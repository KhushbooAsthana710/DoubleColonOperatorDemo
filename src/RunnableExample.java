public class RunnableExample{

    static void show(){
        System.out.println("show defined in separate method");
    }

    public static void main(String[] args) {
        // Using lambda expession
        Runnable r1 = () -> System.out.println("show defined in lambda body");
        r1.run();

        // Using Double Colon Operator
        Runnable r2 = RunnableExample::show;
        Thread t=new Thread(r2);
        t.start();
    }
}