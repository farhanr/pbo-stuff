public class Main{
    public static void main(String[] args) {
        int ms = 6000;

        Thread A = new Thread(new MyThread(){
            @Override
            public void run() {
                try {
                    if (ms < 2000) {
                        add();
                        return;
                    }
                    for (int i = 1; i <= (ms / 2000); i++) {
                        add();
                        Thread.sleep(2000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
            }
        });

        Thread B = new Thread(new MyThread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(100);    
                    for (int i = 1; i <= (ms / 1000); i++) {
                        print();
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        A.start();
        B.start();
    }
}