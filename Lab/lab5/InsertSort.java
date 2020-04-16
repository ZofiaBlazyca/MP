package uj.cs.MP.Lab.lab5;

public class InsertSort
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

    public static Node insertSort(Node listElement)
    {
        Node sortedList = new Node();
        listElement = listElement.next;
        Node head = sortedList;
        while(listElement != null)
        {
            sortedList = head;
            while(sortedList.next != null)
            {
                if(sortedList.next.data > listElement.data)
                {
                    Node tmp = new Node(listElement.data, sortedList);
                    break;
                }
                sortedList = sortedList.next;
            }
            if(sortedList.next == null)
            {
                Node tmp = new Node(listElement.data, sortedList);
            }
            listElement = listElement.next;
        }
        return head;
    }
    public static void main(String [] args)
    {
        Node unsortedList = new Node();

        push(7, unsortedList);
        push(4, unsortedList);
        push(9, unsortedList);
        push(6, unsortedList);
        push(1, unsortedList);

        System.out.println("Lista przed sortowaniem:");
        unsortedList.next.print();
        System.out.println();
        Node sortedList = insertSort(unsortedList);
        System.out.println("Lista po sortowaniu:");
        sortedList.next.print();
    }
}