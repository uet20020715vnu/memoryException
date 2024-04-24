public class Calculator {

    // Static method sử dụng throw
    public static double divide(double dividend, double divisor) throws DivideZeroException {
        if (divisor == 0) {
            throw new DivideZeroException(dividend, divisor);
        }
        return dividend / divisor;
    }


    }

