//package singlelinkedlist;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        a = in.nextInt();
        LinkedList[] list = new LinkedList[a];
        for (int i = 0; i < a; i++) {
            list[i] = new LinkedList();
            b = in.nextInt();
            for (int j = 0; j < b; j++) {
                c = in.nextInt();
                list[i].inEnd(c);
            }
        }
        System.out.println("data:");
        for (int i = 0; i < a; i++) {
            list[i].print();
        }
        System.out.println("angka tengah:");
        for (int i = 0; i < a; i++) {
            list[i].findMid();
        }
        System.out.println("data sesudah removeDuplicate()");
        for (int i = 0; i < a; i++) {
            list[i].removeDuplicate();
            list[i].print();
        }

        LinkedList list2 = list[0];
        list2.makeCircular();
        System.out.println(list2.isCircular());
        
    }
}
