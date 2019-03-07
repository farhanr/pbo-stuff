//f
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Orang[] orang = new Orang[100];
        int index = 0;
        int x = 1;

        while(x==1){
            //defines the object's attribute
            String name=in.next();
            String email = in.next();
            char gender = in.next().charAt(0);
            int pos = in.nextInt();
            //making the object
            orang[index]=new Orang(name,email,gender,pos);
            System.out.println(orang[index].getPosisi()); 
            x=0;
        }
        
    }
}
//r