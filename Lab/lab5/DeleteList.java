package uj.cs.MP.Lab.lab5;

public class DeleteList
{
    public static Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            new Node(d, null);
        }
        Node(int data, Node object)
        {
            this.data = data;
            next = object;
        }
        void print()
        {
            System.out.print(data + " ");
            if(next != null)
            {
                next.print();
            }
        }
    }

    void deleteList()
    {
        head = null;
    }

    public void push(int new_data)
    {
        Node newNode = new Node(new_data, head);
        head = newNode;
    }

//    public void print(Node head)
//    {
//        Node pom = head;
//        while(pom != null)
//        {
//            System.out.print(pom.data + " ");
//            pom = pom.next;
//        }
//        System.out.println();
//    }

    public static void main(String [] args)
    {
        DeleteList list = new DeleteList();

        list.push(3);
        list.push(2);
        list.push(1);

        //list.print(head);
        head.print();
        System.out.println();
        list.deleteList();
        if (head == null)
        {
            System.out.println("Lista zostala usunieta");
        }
        else
        {
            System.out.println("Lista nie zostala usunieta");
        }
    }
}