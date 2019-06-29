import java.text.DecimalFormat;
import java.util.Scanner;

public class TinggiPohon {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Tinggi awal : ");
        int tinggiAwal = s.nextInt();
        System.out.print("Jangka waktu (dalam tahun): ");
        int tahun = s.nextInt();

        double tinggiPohon = hitungPohon(tinggiAwal, tahun);

        DecimalFormat dv = new DecimalFormat("0.0");

        System.out.println("Tinggi pohon menjadi: " + dv.format(tinggiPohon) + "m");
    }


    public static double hitungPohon(double tinggiAwal, int tahun) {

        double tinggiPohon = tinggiAwal;

        for (int i = 1; i <= tahun; i++) {
            tinggiPohon = (3 * (tinggiPohon + 1) - 1.5) + 0.15 * (3 * (tinggiPohon + 1) - 1.5);
            if (i % 2 == 0) {
                tinggiPohon = 0.5 * tinggiPohon;
            }
        }
        return tinggiPohon;
    }
}
