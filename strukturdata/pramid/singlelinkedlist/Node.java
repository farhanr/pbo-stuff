//package singlelinkedlist;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
    public void show() {
        System.out.print("["+data+"]");
    }
}