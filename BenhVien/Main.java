package BenhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten : ");
        String name = sc.nextLine();
        System.out.println("nhap tuoi : ");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("nhap khoa : ");
        String chuyenKhoa = sc.nextLine();
        System.out.println("so gio lam viec : ");
        double soGioLamViec = Double.parseDouble(sc.nextLine());
        System.out.println("nhap so benh anh : ");
        int soBenhAn = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ngay nhap vien :");
        double ngayNhapVien = Double.parseDouble(sc.nextLine());

        BacSi bs = new BacSi(name, tuoi, chuyenKhoa, soGioLamViec);
        BenhNhan bn = new BenhNhan(name, tuoi, soBenhAn, ngayNhapVien);

        System.out.println("chi tiet bac si : "+ bs);
        System.out.println("chi tiet benh nhan : "+ bn);



    }
}
