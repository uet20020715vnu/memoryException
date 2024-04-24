import javax.tools.FileObject;
import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Nhanvien nhanvien[] = new Nhanvien[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nhanvien.length; i++) {
            nhanvien[i] = new Nhanvien(); // Khởi tạo đối tượng NhanVien
        }

        for (int i = 0; i < nhanvien.length; i++) {
            System.out.printf("Mã nhân viên %d: ", i+1);
            nhanvien[i].setManv(sc.nextLine());
            System.out.print("Họ và tên: ");
            nhanvien[i].setHoten(sc.nextLine());
            System.out.print("Tuổi: ");
            nhanvien[i].setTuoi(sc.nextInt());
            sc.nextLine();
            System.out.print("Lương: ");
            nhanvien[i].setLuong(sc.nextFloat());
            sc.nextLine();


        }


        File file = new File ("nhanvien.bin");


        ObjectOutputStream objectoutputstream = null;
        int c;
        try {
            objectoutputstream = new ObjectOutputStream(new FileOutputStream(file));
          for(Nhanvien nv : nhanvien ){
                objectoutputstream.writeObject(nv.toString());
            }
        } catch (Exception ex) {
            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (objectoutputstream != null) {
                try {
                   objectoutputstream.close();
                }
                catch (IOException ex) {
                    Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
//        try with resource
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
//            for (Nhanvien nv : nhanvien) {
//                objectOutputStream.writeObject(nv.toString());
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
