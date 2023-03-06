package org.example;

public class Stack
{
    private class Node
    {
        int num;
        Node prev;
        Node(int x)
        {
            num = x;
        }
    }
    private int sizes;
    private Node head;

    Stack()
    {
        sizes = 0;
        head = null;
    }
    public void push(int x)
    {
        if(head != null)
        {
            Node buf = new Node(x);
            buf.prev = head;
            head = buf;
            sizes ++;
            System.out.println("ok");
        }
        else
        {
            head = new Node(x);
            head.prev = null;
            sizes ++;
            System.out.println("ok");
        }
    }
    public void show()
    {
        if(head != null)
        {
            System.out.println(head.num);
        }
        else
        {
            System.out.println("error");
        }

    }
    public void size()
    {
        System.out.println(sizes);
    }
    public void pop()
    {

        if(sizes > 0)
        {
            System.out.println(head.num);
            head = head.prev;
            sizes -=1;
        }
        else
        {
            System.out.println("error");
        }
    }
    public void clear()
    {
        while(sizes != 0)
        {
            head = head.prev;
            sizes --;
        }
        System.out.println("ok");
    }
}
