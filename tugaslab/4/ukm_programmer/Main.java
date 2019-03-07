//f
public class Main{
    public static void main(String[] args) {
        // Constructor parameter: String name, String email, char gender, int jabatan. 
        // Fill jabatan with:
        // 1 for Pengurus Inti 
        // 2 for Koordinator Bidang 
        // 3 for Staff

        Orang satu = new Orang("farhan ramdhani", "aan@email.com", 'm', 1);

        System.out.println("nama \t\t: "+satu.getName());
        System.out.println("email \t\t: "+satu.getEmail());
        System.out.println(satu.getGender()=='m' ? "gender \t\t: male" : "Gender \t\t: female");
        System.out.println("jabatan \t: "+satu.getPosisi()+"\n");

        Orang dua = new Orang("Papa Franco","pudge@dota.com", 'm', 3);

        System.out.println("nama \t\t: "+dua.getName());
        System.out.println("email \t\t: "+dua.getEmail());
        System.out.println(dua.getGender()=='m' ? "gender \t\t: male" : "Gender \t\t: female");
        System.out.println("jabatan \t: "+dua.getPosisi()+"\n");
    }
}
//r


