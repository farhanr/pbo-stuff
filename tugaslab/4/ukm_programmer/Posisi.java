//f
class Posisi {
    String jabatan;
    public Posisi(int jabatan){
        if (jabatan == 1) {
            this.jabatan = "Pengurus Inti";
        } else if (jabatan == 2) {
            this.jabatan = "Koordinator Bidang";
        } else if (jabatan == 3) {
            this.jabatan = "Staff";
        } else {
            this.jabatan = "Unknown";
        }
    }
    public String getPosisi(){
        return this.jabatan;
    }
}
//r