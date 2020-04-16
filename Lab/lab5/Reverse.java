package uj.cs.MP.Lab.lab5;

public class Reverse
{
    static class Node
    {
        int data;
        Node next;
        Node()
        {
            data = 0;
            next = null;
        }
        Node(int d, Node object)
        {
            data = d;
            next = object.next;
            object.next = this;
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
    public static void push(int newData, Node head)
    {
        Node newNode = new Node(newData, head);
    }

    public static void reverse(Node sortedList)
    {
        Node tmp = sortedList.next;
        sortedList.next = null;
        while(tmp != null)
        {
            Node buff = sortedList.next;
            sortedList.next = tmp;
            tmp = tmp.next;
            sortedList.next.next = buff;
        }
    }

    public static void main(String [] args)
    {
        Node list = new Node();

        push(7, list);
        push(5, list);
        push(4, list);
        push(2, list);

        System.out.println("Lista przed odwroceniem:");
        list.next.print();
        System.out.println();
        reverse(list);
        System.out.println("Lista po odwroceniu:");
        list.next.print();
    }
}