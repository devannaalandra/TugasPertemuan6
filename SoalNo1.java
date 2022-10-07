//untuk memasukkan paket scanner menggunakan scanneruntuk lebih mempermudah
import java.util.Scanner;
import java.util.Locale;

    class SoalNo1 {
        //tidak mengembalikan nilai apapun ketika main method dijalankan
        public static void main(String args[]) {

            Scanner input = new Scanner(System.in).useLocale(Locale.US);
            //system ini untuk mencetak angka atau karakter di layar
            System.out.println("##  Program Java Menghitung Luas Segitiga  ##");
            System.out.println("=============================================");
            System.out.println();

            //sebagai nilai default untuk nilai desimal
            double a, t, luas;

            System.out.print("Input alas segitiga: ");

            a = input.nextDouble();

            System.out.print("Input tinggi segitiga: ");
            t = input.nextDouble();

            luas = 0.5 * a * t;

            System.out.println("Luas segitiga: " + luas);

        }

    }
