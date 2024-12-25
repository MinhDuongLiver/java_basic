package Lesson12.practice12.view;

import Lesson12.practice12.entities.Product;
import Lesson12.practice12.entities.User;
import Lesson12.practice12.service.ProductService;
import Lesson12.practice12.service.UserSevice;
import Lesson12.practice12.utils.Constant;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    UserSevice userSevice = new UserSevice();
    ProductService productService = new ProductService();
    public void displayMenu(Scanner scanner, ArrayList<User> users, ArrayList<Product> products){
        System.out.println("1.dang nhap\n"+"" +
                "\n"+
                "2.dang ky\n");
        System.out.println("moi ban lua chon");
        selectMenu(scanner, users, products);
    }
    public void selectMenu(Scanner scanner, ArrayList<User> users, ArrayList<Product> products){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                User user = userSevice.login(scanner, users);
                System.out.println(user);
                if(user != null){
                    if( Constant.ROSE_ADMIN== user.getRole()){
                        displayMenuForAdmin();
                    }else if( Constant.ROSE_CUSTOMER== user.getRole()){
                        displayMenuForCustomer();
                    } else if (Constant.ROSE_SALLER == user.getRole()){
                        displayMenuForSeller(scanner, products);
                    }
                }
                break;
            case 2:
                break;
        }
    }
    public void displayMenuPostLogin(){
        System.out.println("1 - Thay đổi username\n" +
                "\n" +
                "2 - Thay đổi email\n" +
                "\n" +
                "3 - Thay đổi mật khẩu\n" +
                "\n" +
                "4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)\n" +
                "\n" +
                "0 - Thoát chương trình\n" +
                "\n" +
                "Lưu ý: username và email mới phải chưa tồn tại");
        System.out.println("moi ban lua chon");
    }
    public void displayMenuForAdmin(){
        System.out.println("1-them san pham");
        System.out.println("2-xoa san pham");
    }
    public void displayMenuForCustomer(Scanner scanner, ArrayList<Product> products){
        System.out.println("1-xem san pham");
        System.out.println("2-xem chi tiet san pham");
        System.out.println("3-tim kiem san pham theo gia");
        System.out.println("moi ban chon");
        selectMenuForCustomer(scanner, products);
        //System.out.println("3-xoa san pham");
    }
    public void displayMenuForSeller(Scanner scanner, ArrayList<Product> products){
        System.out.println("1-xem san pham");
        System.out.println("2-chinh sua gia san phan");
        System.out.println("3-xoa san pham");
        System.out.println("moi ban lua chon");
        selectMenuForSeller(scanner, products);
    }
    public void selectMenuForSeller(Scanner scanner, ArrayList<Product> products) {
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1 :
                productService.createProduct(scanner,products);
                break;
            case 2 :
                System.out.println("nhap danh sach san pham");
                for (int i = 0; i < products.size(); i++) {
                    System.out.println(i + 1 +"."+ products.get(i).getName()+"- gia"+ products.get(i).getPrice());
                }
                System.out.println("chon san pham can chinh sua gia");
                int index = Integer.parseInt(scanner.nextLine()) - 1;

                if (index >= 0 && index < products.size()){
                    System.out.println("nhap gia moi");
                    BigDecimal newPrice = new BigDecimal(scanner.nextLine());
                    products.get(index).setPrice(newPrice);
                    System.out.println("gia da dc cap nhap");
                } else {
                    System.out.println("vui long thu lai sau");
                }


                break;
            case 3 :
                System.out.println("Danh sach san pham:");
                for (int i = 0; i < products.size(); i++) {
                    System.out.println(i + 1 + ". " + products.get(i).getName() + " - Gia: " + products.get(i).getPrice());
                }
                System.out.print("Chon san pham can xoa (nhap so thu tu): ");
                int deleteIndex = Integer.parseInt(scanner.nextLine()) - 1; // Lấy index từ người dùng (danh sách bắt đầu từ 1, nhưng array bắt đầu từ 0)

                // Kiểm tra chỉ số hợp lệ
                if (deleteIndex >= 0 && deleteIndex < products.size()) {
                    // Xóa sản phẩm khỏi danh sách
                    products.remove(deleteIndex);
                    System.out.println("San pham da duoc xoa!");
                } else {
                    System.out.println("Chon sai, vui long thu lai.");
                }
                break;
            default:

        }
    }
    public void selectMenuForCustomer(Scanner scanner, ArrayList<Product> products) {
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1 :
                productService.createProduct(scanner, products);
                break;
            case 2 :
                break;
            case 3:
                break;
        }
    }




}
