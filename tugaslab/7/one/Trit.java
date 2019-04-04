class Trit extends Thread{
    Trit(int name){
        this.setName(String.valueOf(name));
    }
    @Override
    public void run() {
        super.run();
        System.out.println("Thread #"+getName()+" sedang berjalan");
    }
}