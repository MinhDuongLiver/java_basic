import java.util.Scanner;

public class bai4MaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap so dong A : ");
        int rowA = Integer.parseInt(sc.nextLine());
        System.out.println("moi ban nhap so cot A : ");
        int columnA = Integer.parseInt(sc.nextLine());

        System.out.println("moi ban nhap so dong B : ");
        int rowB = Integer.parseInt(sc.nextLine());
        System.out.println("moi ban nhap so cot B : ");
        int columnB = Integer.parseInt(sc.nextLine());

        if(rowA != rowB || columnA != columnB) {
            System.out.println("so dong hoac so cot hai ma tran khac nhau");
        } else {
            int [][] arrA= new int[rowA][columnA];
            int [][] arrB= new int[rowB][columnB];

            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.println("moi ban nhap a["+i+"]"+"["+j+"]");
                    arrA[i][j]=Integer.parseInt(sc.nextLine());
                }
            }
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    System.out.println("moi ban nhap b["+i+"]"+"["+j+"]");
                    arrB[i][j]=Integer.parseInt(sc.nextLine());
                }
            }
            int [] arrC = new int [rowA][columnA];
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    arrC[i][j]=arrA[i][j] + arrB[i][j];
                }
            }
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.print(arrC[i][j] + "\t");

                }
                System.out.println();
            }
        }



    }
}
