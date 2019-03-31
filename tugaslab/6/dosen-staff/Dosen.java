class Dosen extends Pegawai{
    private int sks;
    public Dosen(String name, int sks){
        super(name);
        setSks(sks);
    }
    /**
     * @param sks the sks to set
     */
    public void setSks(int sks) {
        this.sks = sks;
    }
    /**
     * @return the sks
     */
    public int getSks() {
        return sks;
    }
    @Override
    public int getGaji(){
        return gaji+(sks*120000);
    }
    @Override
    public void show(){
        System.out.println("nama dosen: " + getName()+"\njumlah sks: "+getSks());
        System.out.println(getName() + " mendapatkan gaji sebesar: Rp." + getGaji() + ",-");
    }
}