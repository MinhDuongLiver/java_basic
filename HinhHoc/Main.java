package HinhHoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chieu dai hinh cn la : ");
        int length = Integer.parseInt(sc.nextLine());
        System.out.println("chieu rong hinh cn la : ");
        int wedth = Integer.parseInt(sc.nextLine());
        System.out.println("canh hinh vuong");
        int side = Integer.parseInt(sc.nextLine());

        HinhChuNhat hcn = new HinhChuNhat(length, wedth);
        HinhVuong hv = new HinhVuong(side);

        // hinh chu nhat
        System.out.println("chu vi hcn la : "+((length+wedth)*2));
        System.out.println("dien tich hcn la : "+(length*wedth));

        // hinh vuong
        System.out.println("chu vi hinh vuong la : "+ (side*4));
        System.out.println("dien tich hinh vuong la : "+ (side*2));

        System.out.println("chieu dai hinh chu nhat : "+ length);
        System.out.println(" chieu rong hinh chu nhat la :"+ wedth);
        System.out.println("canh hinh vuong la : "+ side);

    }
}
