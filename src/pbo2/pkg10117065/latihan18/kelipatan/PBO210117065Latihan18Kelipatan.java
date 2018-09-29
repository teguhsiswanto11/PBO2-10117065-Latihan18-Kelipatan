package pbo2.pkg10117065.latihan18.kelipatan;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Menampilkan bilangan kelipatan 3,5 dari 3,5 sampai dengan
 * 35 menggunakan looping for dengan typedata pengontrol menggunakan double
 * 
 */
public class PBO210117065Latihan18Kelipatan {

    public static void main(String[] args) {
//        deklarasi variabel
        double bilangan;
        bilangan = 3.5;

        System.out.println("Tampilkan bilangan kelipatan 3,5 dumulai dari"
                + " 3,5 sampai dengan 35\n");
//        proses looping 
        for (double i = 3.5; i <= 35; i+=3.5) {
            System.out.println(i);
        }
    }
    
}
