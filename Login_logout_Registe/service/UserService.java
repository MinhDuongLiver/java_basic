package Lesson10.Login_logout_Registe.service;

import Lesson10.Login_logout_Registe.entities.User;

import javax.xml.validation.Validator;
import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    private ArrayList<User> users = new ArrayList<>();
    private User currentUser = null;
    public void inputInfo(Scanner scanner) {
        System.out.println("nhau username : ");
        String userName = scanner.nextLine();
        if(isUsernameExist(userName)){
            System.out.println("username da ton tai");
            return;
        }
        System.out.println("nhap lai email");
        String email = scanner.nextLine();
//        if (!ValidationUtil.isValidEmail(email)) {
//            System.out.println("Email không hợp lệ.");
//            return;
//        }
        if (isEmailExist(email)) {
            System.out.println("Email đã tồn tại.");
            return;
        }

        System.out.println("nhap password : ");
        String password = scanner.nextLine();
//        if(!ValidationUtil.isValid(password)) {
//            System.out.println("password khong hop le");
//            return;
//        }
        users.add(new User(userName, email, password));
        System.out.println("dang ki thanh cong");
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap username : ");
        String userName = scanner.nextLine();
        User user = findUserByUsername(userName);

        if(user == null) {
            System.out.println("kiem tra lai username ");
            return;
        }
        System.out.println("nhap password");
        String password = scanner.nextLine();

        if(!user.getPassworld().equals(password)) {
            System.out.println("Sai mật khẩu.");
            System.out.println("1 - Đăng nhập lại");
            System.out.println("2 - Quên mật khẩu");

            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 2) {
                forgotPassword();
            }
            return;
        }

        currentUser = user;
        System.out.println("chao mung "+ currentUser.getUserName()+ "bạn có thể thực hiện các công việc sau : ");
        userMenu();
    }
    private void userMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Thay đổi username");
            System.out.println("2 - Thay đổi email");
            System.out.println("3 - Thay đổi mật khẩu");
            System.out.println("4 - Đăng xuất");
            System.out.println("0 - Thoát chương trình");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                changeUsername();
                break;
            case 2:
                changeEmail();
                break;
            case 3:
                changePassword();
                break;
            case 4:
                currentUser = null;
                return;
            case 0:
                System.exit(0);
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
        }
    }

    private void changeUsername(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap username moi : ");
        String newUserName = scanner.nextLine();
        if(isUsernameExist(newUserName)){
            System.out.println("username da ton tai");
            return;
        }
        currentUser.setUserName(newUserName);
        System.out.println("soi username thanh cong");
    }

    private void changeEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập email mới: ");
        String newEmail = scanner.nextLine();
//        if (!ValidationUtil.isValidEmail(newEmail)) {
//            System.out.println("Email không hợp lệ.");
//            return;
//        }
        if (isEmailExist(newEmail)) {
            System.out.println("Email đã tồn tại.");
            return;
        }
        currentUser.setEmail(newEmail);
        System.out.println("Đổi email thành công.");
    }

    private void changePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mật khẩu mới: ");
        String newPassword = scanner.nextLine();
//        if (!ValidatorUtil.isValidPassword(newPassword)) {
//            System.out.println("Password không hợp lệ.");
//            return;
//        }
        currentUser.setPassworld(newPassword);
        System.out.println("Đổi mật khẩu thành công.");
    }

    private void forgotPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap email ");
        String email = scanner.nextLine();
        User user = findUserByEmail(email);

        if (user == null) {
            System.out.println("Email chưa tồn tại.");
            return;
        }

        System.out.print("Nhập mật khẩu mới: ");
        String newPassword = scanner.nextLine();
//        if (!ValidationUtil.isValidPassword(newPassword)) {
//            System.out.println("Password không hợp lệ.");
//            return;
//        }
        user.setPassworld(newPassword);
        System.out.println("Đổi mật khẩu thành công. Vui lòng đăng nhập lại.");
    }









    private boolean isEmailExist(String email) {
        return users.stream().anyMatch(user -> user.getUserName().equals(email));
    }

    private boolean isUsernameExist(String userName) {
        return users.stream().anyMatch(user -> user.getUserName().equals(userName));
    }

    private User findUserByUsername(String username) {
        return users.stream().filter(user -> user.getUserName().equals(username)).findFirst().orElse(null);
    }
    private User findUserByEmail(String email) {
        return users.stream().filter(user -> user.getEmail().equals(email)).findFirst().orElse(null);
    }

    public void register() {
    }
}
