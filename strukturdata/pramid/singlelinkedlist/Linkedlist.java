//package singlelinkedlist;
class LinkedList{
    Node head,tail;
    public boolean isEmpty() {
        return (head == null);
    }
    public void inFirst(int databaru){
        Node nodebaru = new Node(databaru);
        if (isEmpty()){
            head = new Node(databaru);
            tail = head;
            return;
        }
        nodebaru.next = head;
        head = nodebaru;
    }
    public void inEnd(int databaru){
        Node nodebaru = new Node(databaru);
        if (isEmpty()){
            inFirst(databaru);
            return;
        }
        nodebaru.next=null;
        tail.next=nodebaru;
        tail=nodebaru;
        return;
    }
    public void inMid(int databaru, int pos){
        if(pos == 0){
            inFirst(databaru);
            return;
        }
        Node current = head;
        for(int i=0;i < pos-1;i++){
            current = current.next;
            if(current == null){
                System.out.println("posisi index melebihi size linkedlist");
                return;
            }
        }
        Node nodebaru = new Node(databaru);
        nodebaru.next = current.next;
        current.next = nodebaru;
    }
    public void print2(){
        for (Node x = head; x != null; x = x.next) {
            x.show();
        }
    }
    public void print(){
        Node printNode = head;
        while (printNode != null){
            printNode.show();
            if (printNode == tail && isCircular()) {
                System.out.print("->");
                printNode.next.show();
                System.out.print("list is circular");
                return;
            } else if(printNode == tail){
                System.out.print("->"+printNode.next);
                System.out.print(" (list is not circular)");
                return;
            }
            printNode=printNode.next;
        }
        System.out.println();
    }
    private void searchNode(int searched_data){
        Node current = head;
        int pos=1;
        while (current.data != searched_data){
            pos++;
            current=current.next;
            if(current == null){
                System.out.println("tidak ditemukan");
                return;
            }
        }
        System.out.println("data ditemukan di node "+pos);
    }
    private void delIndex(int pos){
        Node current = head;
        Node t = current.next;
        if(isEmpty()){
            return;
        }
        if(pos == 0){
            head=head.next;
            return;
        }
        for(int i=0; i<pos-1; i++){
            current = current.next;
            t = t.next;
        }
        current.next = t.next;
    }
    private void delData(int data) {
        Node current = head;
        if(isEmpty()){
            return;
        }
        if (current.data == data) {
            head=head.next;
            return;
        }
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    public void removeDuplicate(){
        Node pivot = head;
        Node current = pivot.next;
        int index = 1;
        int pivotIndex = 1;
        //int shifted = 0;
        if(isEmpty()){
            return;
        }
        while (pivot != null) {
            //System.out.println(pivot.data);
            while(current!=null){
                //System.out.println(current.data == pivot.data);
                index++;
                if (current.data == pivot.data) {
                    index--;
                    //shifted--;
                    delIndex(index);
                    //print();
                }
                if (current.next == null) {
                    index--;
                    //shifted--;
                }
                //System.out.println("current index"+index);
                //System.out.println("current pivot index"+pivotIndex);
                current = current.next;
            }
            if(pivot.next != null){
                pivot = pivot.next;
                current = pivot.next;
                pivotIndex++;
                index = pivotIndex;
            } else {
                return;
            }
        }
    }
    public int count() {
        Node current = head;
        int length = 0;
        while (current != null) {
            current = current.next;
            length++;
        }
        return length;
    }
    public void findMid(){
        Node current = head;
        for (int i = 0; i < (count()/2); i++) {
            current = current.next;
        }
        current.show();
        System.out.println();
    }
    public void makeCircular(){
        tail.next = head;
    }
    public boolean isCircular(){ 
        Node current = head.next;
        if (head == null){
            return true; 
        }
        while (current != null && current != head){
            current = current.next; 
        }
        return (current == head);
    } 
}
