import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadObject {
    public static void main(String[] args) throws IOException {
        FileInputStream fileinputstream = null;
        int c;
        try {
            fileinputstream = new FileInputStream("nhanvien.bin");
            while ( (c = fileinputstream.read()) != -1){
                System.out.print((char) c);
            }
        } catch (Exception ex) {
            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE,null,ex);
    }
        finally {
            if (fileinputstream != null) {
            try {
                fileinputstream.close();
            }
            catch (IOException ex) {
                Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE,null,ex);
            }
            }
        }
        }
}
