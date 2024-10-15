package LinkedList;

public class Basicll {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addfirst(String Data){
        Node newnode = new Node(Data);
        if(head==null){
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    public void addlast(String Data){
        Node newnode = new Node(Data);
        if(head == null){
            head = newnode;
            return;
        }
        Node currentnode = head;
        while(currentnode.next!=null){
            currentnode = currentnode.next;
        }
        currentnode.next = newnode;

    }
    public void printlist(){
        if(head == null){
            System.out.print("List is empty");
        }
        Node currentnode = head;
        while(currentnode !=null){
            System.out.print(currentnode.data +" ---> ");
            currentnode = currentnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
     Basicll list = new Basicll();
     list.addfirst("a");
     list.addfirst("is");
     list.printlist();
    
     list.addlast("list");
     list.printlist();

     list.addfirst("This");
     list.printlist();
    }
}
