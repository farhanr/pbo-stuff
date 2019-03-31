class Mahasiswa extends Matkul{
    String name;
    String nim;
    String kelas;
    String matkul;
    Mahasiswa(String name, String nim, String kelas, String matkul){
        setName(name);
        setNim(nim);
        setKelas(kelas);
        setMatkul(matkul);
    }
    /**
     * @param matkul the matkul to set
     */
    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }
    /**
     * @param kelas the kelas to set
     */
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }
    /**
     * @return the kelas
     */
    public String getKelas() {
        return kelas;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }
    public void showOut(int a, int b){
        String dosen;
        int sks=super.jumSKS;
        int nilaiAkhir=(a+b)/2;
        String nilaiMutu = super.getNilaiMutu(nilaiAkhir);

        if(matkul.equals("pbo")){
            dosen=super.namaDosen[0];
        }else if(matkul.equals("strukturdata")){
            dosen = super.namaDosen[1];
        }else{
            dosen = super.namaDosen[2];
        }

        System.out.println("nilai akhir: "+nilaiAkhir);
        System.out.println("nilai mutu: "+nilaiMutu);
    }
}