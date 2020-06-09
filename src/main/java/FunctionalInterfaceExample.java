public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        createUsingAnanomousClass();
        createUsingLambdaExpression();
    }

    private static void createUsingLambdaExpression() {
        Runnable r =() -> System.out.println("demo run method excutes using lamda");
        Thread t=new Thread(r);
        t.start();
    }


    private static void createUsingAnanomousClass() {
        Runnable r =new Runnable() {
            public void run() {
                System.out.println("demo run method excutes in ananomoous class");
            }
        };
        Thread t=new Thread(r);
        t.start();
    }


}
