import java.util.Scanner;
    public class Soal2Phonecell {
        /* Membuat app OOP untuk menghitung perkiraan biaya percakapan melalui phonecell
        Di mana waktu awal dan akhir percakapan (hh:mm:ss) diinput dari keyboard
        Keluaran dari app ini adalah lama dan biaya percakapan
        Satu pulsa = 5 detik dan biaya per pulsa adalah Rp 150
         */
        private int jam;
        //hak akses yang melarang method atau property yang menggunakan nya di larang di akses dari luar class.
        // jadi hak akses private hanya bisa di akses dari dalam class itu sendiri
        private int menit;
        private int detik;
        private double harga;

        // public int untuk hak akses dari method/class fungsi STATIC agar method tersebut
        // dapat di akses tampa melakukan instansiasi pada class
        public int getJam() {
            return jam;
        }

        //public void  prosedur yang menghasilkan nilai tetap dan bersifat public atau global yang dapat diakses dari
        // prosedur atau fungsi manapun dengan syarat
        // semua variabel didalam void / prosedur tersebut juga pubic static.
        public void setJam(int jam) {
            this.jam = jam;
        }
        public int getMenit() {
            return menit;
        }
        public void setMenit(int menit) {
            this.menit = menit;
        }
        public int getDetik() {
            return detik;
        }
        public void setDetik(int detik) {
            this.detik = detik;
        }
        public double harga(){
            return (3600*jam + 60*menit + detik)*30;
        /* menggunakan harga per detik, di mana per detik seharga Rp 30
           1 jam ada 3600 detik, maka tinggal dikali 3600 dari input jam
           1 menit ada 60 detik, maka tinggal dikali 60 dari input menit
         */
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Soal2Phonecell biaya_pulsa = new Soal2Phonecell();
            System.out.print("Masukkan jam = ");
            biaya_pulsa.setJam(sc.nextInt()); // input jam
            System.out.print("Masukkan menit = ");
            biaya_pulsa.setMenit(sc.nextInt()); // input menit
            System.out.print("Masukkan detik = ");
            biaya_pulsa.setDetik(sc.nextInt());
            // tampilan (hh:mm:ss)
            System.out.println("Waktu awal percakapan = (" + biaya_pulsa.getJam() + ":" + biaya_pulsa.getMenit() + ":" + biaya_pulsa.getDetik()+ ")");
            System.out.println("Biaya pulsa untuk percakapan terkahir anda = Rp" + biaya_pulsa.harga());
        }
    }
