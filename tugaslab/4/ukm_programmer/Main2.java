//f
import java.util.*;
public class Main{
    private static Scanner in = new Scanner(System.in);
    private static List<Orang> orang = new ArrayList<Orang>();
    private static int x = 1;
    public static void addOrang(){
        //defines the object's attribute
        System.out.println("\n +making the object+\n fill with name (space) email (space) gender m/f (space) position 1/2/3.\n input nama hanya 1 huruf saja");
        System.out.println(" contoh: joni joni_noob@cs.sci.unhas m 2");
        System.out.print("> ");
        String name=in.next();
        String email = in.next();
        char gender = in.next().charAt(0);
        int pos = in.nextInt();
        //making the object
        orang.add(new Orang(name,email,gender,pos));
        System.out.println();
    }
    public static void show(){
        System.out.println("\n +showing orang-orang+");
        for (int i = 0; i < orang.size(); i++) {
            System.out.println("orang ke-"+(i+1)+":");
            System.out.println("nama \t\t: "+orang.get(i).getName());
            System.out.println("email \t\t: "+orang.get(i).getEmail());
            System.out.println(orang.get(i).getGender()=='m' ? "gender \t\t: male" : "Gender \t\t: female");
            System.out.println("jabatan \t: "+orang.get(i).getPosisi()+"\n");
        }
    }
    public static void main(String[] args) {
        while(x==1){
            System.out.println("\n+menu+\n type 1 to add an object\n type 2 to show object\n type whatever you want to exit");
            System.out.print("> ");
            String choice = in.next();
            if(choice.equals("1")){
                addOrang();
            } else if(choice.equals("2")){
                show();
            } else {
                x=0;
            }
        }
    }
}
//r