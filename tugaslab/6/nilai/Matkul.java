class Matkul{
    int nilai;
    String[] namaMatkul = {"pbo","strukturdata","pemrogramanmobile"};
    String[] namaDosen = {"Supri Amir, ST. M.SI","Edi Anugrah M.SI","Amil Siddik M.SI"};
    int jumSKS = 3;
    public String getNilaiMutu(int a){
        if(a >= 80){
            return "A";
        }else if(a >= 70){
            return "A-";
        } else if (a >= 60) {
            return "B+";
        } else if (a >= 50) {
            return "B";
        } else if (a >= 40) {
            return "B-";
        } else if (a >= 30) {
            return "C";
        } else if (a >= 30) {
            return "D";
        } else{
            return "E";
        }
    }
}