class Staf extends Pegawai{
    int hadir;
    public Staf(String name, int hadir){
        super(name);
        setHadir(hadir);
    }
    /**
     * @param hadir the hadir to set
     */
    public void setHadir(int hadir) {
        this.hadir = hadir;
    }
    /**
     * @return the hadir
     */
    public int getHadir() {
        return hadir;
    }
    @Override
    public int getGaji() {
        return gaji + (hadir * 50000);
    }
    @Override
    public void show() {
        System.out.println("nama staf: " + getName() + "\njumlah kehadiran: " + getHadir());
        System.out.println(getName() + " mendapatkan gaji sebesar: Rp." + getGaji() + ",-");
    }
}