//f
class Orang extends Posisi{
    private String name,email;
    private char gender;
    public Orang(String x, String y, char z, int jabatan){
        super(jabatan);
        this.name = x;
        this.email = y;
        this.gender = z;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public char getGender(){
        return this.gender;
    }
}
//r