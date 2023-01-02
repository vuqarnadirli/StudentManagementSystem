public class StudentManagementSystem {
    public static void main(String[] args){
        Thread.setDefaultUncaughtExceptionHandler(new MyExceptionHandler());
        test(1);
        test(2);
    }

    public static void test(int a){
        System.out.println("test");
        if (a == 1) {
            throw new RuntimeException();
        }
    }
}