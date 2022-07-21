package vag.lesson11;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        System.out.println(j);
                    }
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(Thread.currentThread().getState());
                }
            }).start();
        }
    }
}