public class MethodCallStackDemo {

    public static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }

    public static void methodB() {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }

    public static void methodC() {
        System.out.println("Enter methodC()");// khi gọi phương thức C được thêm
        // vào stack cuối cùng nên sẽ thực hiên C xong quay về B, A rồi kết thúc main
        System.out.println("Exit methodC()");
    }
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }

}