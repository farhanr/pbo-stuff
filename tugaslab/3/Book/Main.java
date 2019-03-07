public class Main{
    public static void main(String[] args) {
        Author penulis1 = new Author("Paul Colen","paulco@email.com",'m');
        Book buku1 = new Book("The Alchemist", penulis1, 100000);
        
        System.out.println("Keterangan buku:");
        System.out.println("Judul\t: "+buku1.getName());
        System.out.println("Penulis\t: "+buku1.getAuthor().getName());
        System.out.printf("Harga\t: %.0f \n\n", buku1.getPrice());
        
        System.out.println("Keterangan penulis:");
        System.out.println("Nama\t: "+penulis1.getName());
        System.out.println("Email\t: "+penulis1.getEmail());
        System.out.println(penulis1.getGender()=='m' ? "Gender \t: male" : "Gender \t: female");
    }
}