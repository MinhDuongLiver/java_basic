import java.util.Scanner;

public class BaiTapBuoi3LamMayTinhBoTui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a : ");
        int a = Integer.parseInt(sc.nextLine());


        System.out.println("nhap so b : ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.println("nhap phep toan : ");
        String math = sc.nextLine();

        System.out.println("so a la : "+ a);
        System.out.println("so b la : "+ b);
        System.out.println("phep toan la : " + math);

        int resunt = 0;
        switch (math) {
            case "+":
                resunt = a + b;
                break;
            case "-":
                resunt = a - b;
                break;
            case "*":
            case "x":
                resunt = a * b;
                break;
            case "/":
            case ":":
                resunt = a / b;
                break;
            case "%":
                resunt = a % b;
                break;
        }

        System.out.println("---------------");
        System.out.printf("%d %s %d = %d", a, math, b, resunt);
    }
}
