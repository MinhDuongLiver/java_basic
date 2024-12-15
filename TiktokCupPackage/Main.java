package Leson8_Arraylist.TiktokCupPackage;

import Leson8_Arraylist.TiktokCupPackage.Service.TiktokService;
import Leson8_Arraylist.TiktokCupPackage.entities.Follower;
import Leson8_Arraylist.TiktokCupPackage.entities.Idol;
import Leson8_Arraylist.TiktokCupPackage.entities.Song;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TiktokService tiktokService = new TiktokService();

        while (true){
            System.out.println("1:them idol");
            System.out.println("2:them follow");
            System.out.println("3:them bai hat");
            System.out.println("4:thoat");
            System.out.println("lua chon cua ban : ");

            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("nhap ten idol : ");
                    String name = sc.nextLine();
                    System.out.println("nhap id idol");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("nhap email idol : ");
                    String email = sc.nextLine();
                    System.out.println("nhap nhung nguoi theo doi idol : ");
                    int follower = Integer.parseInt(sc.nextLine());
                    System.out.println("tao nhom cua idol : ");
                    String group = sc.nextLine();

                    Idol idol = new Idol(name, id, email, follower, group);
                    TiktokService.addIdol(idol);
                    System.out.println("them idol thanh cong!");
                    break;

                case 2:
                    System.out.println("nhap ten nguoi theo doi : ");
                    String namefan = sc.nextLine();
                    System.out.println("nhap id nguoi theo doi");
                    int idfan = Integer.parseInt(sc.nextLine());
                    System.out.println("nhap email nguoi theo doi : ");
                    String emailfan = sc.nextLine();
                    System.out.println("nhap so luot thich : ");
                    int numberOfLike = Integer.parseInt(sc.nextLine());


                    Follower followerfan = new Follower(namefan, idfan, emailfan, numberOfLike);
                    TiktokService.addFollower(followerfan.getNumberOfLike());
                    System.out.println("them idol thanh cong!");
                    System.out.println("them follower thanh cong !");
                    break;

                case 3:
                    System.out.println("nhap id bai hat : ");
                    int idSong = Integer.parseInt(sc.nextLine());
                    System.out.println("nhap ten bai hat : ");
                    String nameSong = sc.nextLine();
                    System.out.println("nhap ten ca si : ");
                    String nameSinger = sc.nextLine();

                    Song song = new Song(idSong, nameSong, nameSinger);
                    TiktokService.addSong(song);
                case 4:
                    System.out.println("thong tin tiktok :");
                    tiktokService.display();
                    System.out.println();
                case 5:
                    System.out.println("thoat chuong trinh");
                    sc.close();
                    return;

                default:
                    System.out.println("lua chon khong hop le, vui long nhap lai");
                    break;
            }
        }
    }
}
