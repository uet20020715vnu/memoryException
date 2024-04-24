public class DivideZeroException extends Exception {
    double x, y;

    public DivideZeroException(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getMessage() {
        return "Lỗi chia cho 0 : " + x + "/ " + y;
    }
}