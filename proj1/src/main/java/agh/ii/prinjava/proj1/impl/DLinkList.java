package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> head;

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        private Node(T elem){
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }

    /**
     * addFirst method add an element in the first position in the list:
     * we create the node named add and it will become the head of the list
     * @param elem
     */
    public void addFirst(E elem){
        Node<E> add = new Node<>(elem);
        if (head == null){
            this.head = add;
        }
        else if (head != null){
            Node<E> temp = head;
            head = add;
            add.next = temp;
            temp.prev = head;
        }
    }

    /**
     * addLast method add an element in the last position in the list:
     * we create a node named add and after we browse the list to find the last node of the list
     * and we add our new node to it
     * @param elem
     */
    public void addLast(E elem){
        Node<E> add = new Node<>(elem);
        if (head == null){
            this.head = add;
        }
        else{
            Node<E> temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = add;
            add.prev = temp;
        }
    }

    /**
     * RemoveFirst method remove the element located in the first position in the list:
     * we replace the head value in the next node value of the list and we nullify the prev node
     * @return
     */
    public E removeFirst(){
        E returnValue =  null;
        if (head != null){
            returnValue = (E) head.elem;
            head = head.next;
            if (head != null){
                head.prev = null;
            }
        }
        return returnValue;
    }

    /**
     * RemoveFirst method remove the element located in the first position in the list:
     * we browse the list to find the last node of the list, we nullify the next node of its prev node
     * @return
     */
    public E removeLast(){
        E returnValue = null;
        if (head != null){
            if (head.next == null){
                returnValue = head.elem;
                head = null;
            }
            else{
                Node<E> temp = head;
                while (temp.next.next != null){
                    temp = temp.next;
                }
                returnValue = temp.next.elem;
                temp.next = null;
            }
        }
        return returnValue;
    }


    /**
     * String toString is a method that return a list of String :
     * we create a String list and we place each value of each node of the list
     * @return
     */
    @Override
    public String toString(){
        String list = "";
        if (head == null){
            list = list+"null";
        }
        else {
            Node<E> temp = head;
            list = list + temp.elem;
            while (temp.next != null) {
                list = list + " <-> " + temp.next.elem;
                temp = temp.next;
            }
        }
        return list;
    }

    /**
     * numOfElem return the length of the list:
     * we create a integer variable named length, we browse the list and as long as the next node was
     * not null we increment by 1 length variable
     * @return
     */
    public int numOfElem(){
        int length = 0;
        if (head != null){
            Node<E> temp = head;
            length++;
            while (temp.next != null){
                length++;
                temp = temp.next;
            }
        }
        return length;
    }

    /**
     * we return the first element of the list
     * @return
     */
    public E firstElem(){
        if (head != null){
            return head.elem;
        }
        return null;
    }

    /**
     * we browse the list to find and return the last element of the list
     * @return
     */
    public E lastElem(){
        if (head != null){
            Node<E> temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            return temp.elem;
        }
        return null;
    }



}
