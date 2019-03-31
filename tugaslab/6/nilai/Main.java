public class Main{
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("budi","H071171527","Ilkom-B","pbo");
        NilaiUAS a = new NilaiUAS(80);
        NilaiUTS b = new NilaiUTS(85);
        mhs.showOut(a.getNilai(),b.getNilai());
    }
}