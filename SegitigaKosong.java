import java.util.Scanner;

public class SegitigaKosong {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Jumlah baris: ");
        int line = s.nextInt();
        draw(line);
    }


    public static void draw(int n) {
        int oddNumber = n * 2 - 1;

        for (int i = 0; i < oddNumber; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < oddNumber-i; j++) {
                if (j == i || j == oddNumber-i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}