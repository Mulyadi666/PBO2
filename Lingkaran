package tugas4;

/**
 *
 * @author adimu
 */
public class Lingkaran {
    double jari_jari;
    static final double PHI = 3.14;
    static int jumlahLingkaran = 0;

    Lingkaran() {
        // Konstruktor default
    }
        // Menambahkan 1 setiap lingkaran baru
    Lingkaran(double jari_jari_baru) {
        this.jari_jari = jari_jari_baru;
        jumlahLingkaran++;
    }
        // Menghitung luas
    double getLuas() {
        return PHI * jari_jari * jari_jari;
    }
        // Menghitung keliling
    double getKeliling() {
        return 2 * PHI * jari_jari;
    }

    static int getJumlahLingkaran() {
        return jumlahLingkaran;
    }

    public static void main(String[] args) {
        // Objek pertama tanpa inisialisasi jari_jari
        Lingkaran lingkaran1 = new Lingkaran();
        System.out.println("Luas lingkaran 1: " + lingkaran1.getLuas());
        System.out.println("Keliling lingkaran 1: " + lingkaran1.getKeliling());

        // Objek kedua dengan inisialisasi jari_jari dari property
        Lingkaran lingkaran2 = new Lingkaran();
        lingkaran2.jari_jari = 5.0;
        System.out.println("Luas lingkaran 2: " + lingkaran2.getLuas());
        System.out.println("Keliling lingkaran 2: " + lingkaran2.getKeliling());

        // Objek ketiga dengan inisialisasi jari_jari dari konstruktor
        Lingkaran lingkaran3 = new Lingkaran(7.0);
        System.out.println("Luas lingkaran 3: " + lingkaran3.getLuas());
        System.out.println("Keliling lingkaran 3: " + lingkaran3.getKeliling());

        // Menampilkan jumlah lingkaran yang telah dibuat
        System.out.println("Jumlah lingkaran yang dibuat: " + Lingkaran.getJumlahLingkaran());
    }
}
