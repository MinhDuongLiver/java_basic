import java.util.Scanner;

public class BaiTapBuoi3NhapThongTinHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choose = "";
        do {
            System.out.println("Họ và tên : ");
            String name = sc.nextLine();
            System.out.println("Địa chỉ : ");
            String address = sc.nextLine();

            System.out.println("Do you want to continues?(Y/N)");
            choose = sc.nextLine();

        } while (choose.equalsIgnoreCase("Y"));
        return ;
    }
}
