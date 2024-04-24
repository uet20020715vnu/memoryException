import java.io.IOException;
class test {

    // exception propagated to n() 
    void m() throws IOException
    {
        // checked exception occurred 
        throw new IOException("device error");
    }

    // exception propagated to p() 
    void n() throws IOException
    {
        m();
    }
    void p()
    {
        try {

            // exception handled 
            n();
        }
        catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[])
    {
        test obj = new test();
        obj.p();
        System.out.println("normal flow...");
    }
}