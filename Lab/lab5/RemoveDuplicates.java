package uj.cs.MP.Lab.lab5;

public class RemoveDuplicates
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

    public static void removeDuplicates(Node sortedList)
    {
        while(sortedList.next != null)
        {
            if(sortedList.data == sortedList.next.data)
            {
                sortedList.next = sortedList.next.next;
            }
            else
            {
                sortedList = sortedList.next;
            }
        }
    }

    public static void main(String [] args)
    {
        Node sortedList = new Node();

        push(7, sortedList);
        push(7, sortedList);
        push(7, sortedList);
        push(6, sortedList);
        push(4, sortedList);
        push(3, sortedList);
        push(3, sortedList);
        push(3, sortedList);
        push(1, sortedList);
        push(1, sortedList);

        System.out.println("Lista przed usunieciem duplikatow:");
        sortedList.next.print();
        System.out.println();
        removeDuplicates(sortedList);
        System.out.println("Lista po usunieciu duplikatow:");
        sortedList.next.print();
    }
}
