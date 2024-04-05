package tugas4;

/**
 *
 * @author adimu
 */
class Mahasiswa {

    public String nim;
    public String nama;
    public String alamat;
    public double ipk;

    // Konstruktor default
    public Mahasiswa() {
        // Kosong
    }

    // Konstruktor dengan satu parameter nim
    public Mahasiswa(String nim) {
        this.nim = nim;
    }

    // Konstruktor dengan empat parameter untuk inisialisasi semua properti
    public Mahasiswa(String nimBaru, String namaBaru, String alamatBaru, double ipkBaru) {
        this.nim = nimBaru;
        this.nama = namaBaru;
        this.alamat = alamatBaru;
        this.ipk = ipkBaru;
    }

    // Method untuk menentukan predikat berdasarkan IPK
    public String predikat(double ipk) {
        if (ipk >= 2.0 && ipk <= 2.75) {
            return "Memuaskan";
        } else if (ipk >= 2.76 && ipk <= 3.5) {
            return "Sangat Memuaskan";
        } else if (ipk >= 3.51 && ipk <= 4.0) {
            return "Dengan Pujian";
        } else {
            return "-";
        }
    }

    // Method untuk mencetak informasi mahasiswa
    public void cetak() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("IPK: " + ipk);
        System.out.println("Predikat: " + predikat(ipk));
    }

    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("22552011131", "Adi Mulyadi", "Cisarua", 3.78);
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nim = "2255529113";
        mahasiswa2.nama = "yauday";
        mahasiswa2.alamat = "Jl. Rajadesa No. 6";
        mahasiswa2.ipk = 3.0;

        // Menampilkan informasi mahasiswa
        System.out.println("Mahasiswa 1:");
        mahasiswa1.cetak();
        System.out.println();
        System.out.println("Mahasiswa 2:");
        mahasiswa2.cetak();
    }
}
