package LinkedList;

import java.util.function.Function;

public class LinkedList<T> implements ListInterface<T> {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.insert("test");
        list.insert( 1 ,"hallo");
        list.insert( 0 ,"car");
        list.insert( 2 ,"pc");
        list.print();
        System.out.println("====> find<====");
        System.out.println(list.find(e->e.startsWith("h")));
        System.out.println("====> delete<====");
         list.delete(e->e.contentEquals("test"));
         list.print();
    }

    private Node head = null;

    @Override
    public void insert(T data) {
        Node tamp = new Node(data);
        tamp.next = head;
        head = tamp;
    }

    @Override
    public void insert(int pos, T data) {
        if(pos == 0) {
            insert(data);
        }
        else {
            Node tamp = new Node(data);
            Node cursor = head;
            for (int i = 0; i < pos - 1 && cursor.next != null; i++) {
                cursor = cursor.next;
            }
            tamp.next = cursor.next;
            cursor.next = tamp;
        }
    }

    @Override
    public void print() {
        if(head != null) {
            Node cursor = head;
            while (cursor != null)
            {
                System.out.println(cursor);
                cursor = cursor.next;
            }
        }
    }

    @Override
    public T find(Function<T,Boolean> func) {
        if(head == null) return null;
        Node cursor = head;
        while (cursor != null)
        {
            if(func.apply(cursor.data))return cursor.data;
            cursor = cursor.next;
        }
        return  null;
    }

    @Override
    public T delete(Function<T, Boolean> func) {
       if(head == null) return null;
       if(func.apply(head.data)) {
           Node tamp = head;
           head = head.next;
           return tamp.data;
       }
       else {
           Node prev = head;
           Node cursor = head.next;
           while (cursor != null) {
               if (func.apply(cursor.data)) {
                   prev.next = cursor.next;
                   return cursor.data;
               }
               prev = cursor;
               cursor = cursor.next;
           }
       }
       return  null;
    }

    class Node
    {
        T data;
        Node next;
        Node(T data)
        {
            this.data = data;
        }
        public String toString() {
            return data.toString();
        }
    }
}
