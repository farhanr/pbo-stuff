class MyThread implements Runnable{
    static long total = 0;
    @Override
    public void run() {
        
    }

    public void add(){
        total++;
    }
    public void print(){
        System.out.println(total);
    }
}