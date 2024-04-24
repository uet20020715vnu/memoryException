import java.io.Serializable;
import java.util.Scanner;
public class Nhanvien implements Serializable {
    private String manv;
    private String hoten;
    private int tuoi;
    private float luong;

    public Nhanvien() {
    };

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public String toString() {
        return "Mã nhân viên: " + manv + "\nHọ và tên: " + hoten + "\nTuổi: " + tuoi +"\nLương:" + luong + "\n\r";
    }

    public static void main(String[] args) {
        Nhanvien nv = new Nhanvien();
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã nhân viên: ");
        nv.manv = sc.nextLine();
        System.out.print("Họ và tên: ");
        nv.hoten = sc.nextLine();
        System.out.print("Tuổi: ");
        nv.tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Lương: ");
        nv.luong = sc.nextFloat();
        System.out.println(nv.toString());
    }
}
