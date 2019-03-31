class Pegawai {
    protected String name;
    protected int gaji=2500000;
    public Pegawai(String name){
        setName(name);
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the gaji
     */
    public int getGaji() {
        return gaji;
    }
    public void show(){
        System.out.println(getName()+" mendapatkan gaji sebesar: Rp."+getGaji()+",-");
    }
}