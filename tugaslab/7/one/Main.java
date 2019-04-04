import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        //define arraylist of thread
        ArrayList<Trit> listTrit = new ArrayList<Trit>();

        //add threads to the list of thread
        for (int i = 1; i < 6; i++) {
            Trit trit = new Trit(i);
            listTrit.add(trit);
        }

        //starts thread one by one
        for (int i = 1; i < 6; i++) {
            listTrit.get(i-1).start();
        }
    }
}