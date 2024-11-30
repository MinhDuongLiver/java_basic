import java.time.LocalTime;
import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên hàng nhập kho: ");
        String name= sc.nextLine();
        System.out.println("Tên hàng nhập kho là  : "+name);
        System.out.println("moi ban nhap ngay thang nam sinh (yyyy/MM/dd) : ");
        String birth = sc.nextLine();
        System.out.println("ngay thang nam sinh la: "+birth);
        System.out.println("moi ban nhap thoi gian nhap hang (yyyy/MM/dd HH:mm:ss) : ");
        String row = sc.nextLine();
        System.out.println("thoi gian nhap la : "+row);
        System.out.println(LocalTime.now());

    }
}
