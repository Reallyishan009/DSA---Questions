package LinkedList;

import java.lang.classfile.instruction.ThrowInstruction;

public class Allthebasicstogether {
    Node head;
    private int size;
    class Node{
        String data;
        Node next;
         Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addfirst(String data){
        Node currentNode = new Node(data);
        if(head==null){
            head = currentNode;
            return;
        }
        
       currentNode.next = head;
       head = currentNode;
        
    }

    public void addlast(String data){
        Node lastnode = new Node(data);
        if(head ==null){
            head = lastnode;
            return;
        }
        
        Node currentnode = head;
        while(currentnode.next!=null){
            currentnode = currentnode.next;
        }
        currentnode.next = lastnode;
    }

    public void printlist(){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.data + "--->");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void deletefirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deletelast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null; // If there's only one element
            return;
        }
        Node secondlastnode = head;
        Node lastnode = head.next;

        while(lastnode.next!=null){
            lastnode = lastnode.next;
            secondlastnode = secondlastnode.next;
        }
        secondlastnode.next = null;

    }
    public int  sizee(){
        return size;
    }

    public static void main(String[] args) {
        Allthebasicstogether list = new Allthebasicstogether();
        list.addfirst("Ishan");
        list.addfirst("I am");

        list.addlast("Tripathi.");
        list.addlast("I am ");
        list.addlast("a software engineer.");
        list.addlast("delete");
        list.addlast("me");

        list.printlist();

        list.deletefirst();
        list.printlist();
        list.deletelast();
        list.printlist();

        System.out.println(list.sizee());
    }
    
}
