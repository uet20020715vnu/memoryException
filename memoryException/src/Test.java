import java.util.Scanner;
public class Test {
    public static void main(String[] args) throws DivideZeroException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();
        try {
            double divide = Calculator.divide(a,b);
            System.out.println(divide);
        } catch (DivideZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
