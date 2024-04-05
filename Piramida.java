package tugas4;

/**
 *
 * @author adimu
 */
public class Piramida {

    private double tinggi;
    private double panjangAlas;

    public Piramida(double tinggi, double panjangAlas) {
        this.tinggi = tinggi;
        this.panjangAlas = panjangAlas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getPanjangAlas() {
        return panjangAlas;
    }

    public void setPanjangAlas(double panjangAlas) {
        this.panjangAlas = panjangAlas;
    }

    public double hitungVolume() {
        // Rumus volume piramida: 1/3 * alas * tinggi
        return (1.0 / 3.0) * panjangAlas * panjangAlas * tinggi;
    }

    public double hitungLuasPermukaan() {
        // Rumus luas permukaan piramida: (alas * alas) + 2 * alas * tinggiSegitiga
        double tinggiSegitiga = Math.sqrt(Math.pow(panjangAlas / 2, 2) + Math.pow(tinggi, 2));
        return (panjangAlas * panjangAlas) + (2 * panjangAlas * tinggiSegitiga);
    }

    public static void main(String[] args) {
        // Membuat objek piramida dengan tinggi 8 dan panjang alas 6
        Piramida piramida = new Piramida(8, 6);

        // Menampilkan tinggi dan panjang alas piramida
        System.out.println("Tinggi piramida: " + piramida.getTinggi());
        System.out.println("Panjang alas piramida: " + piramida.getPanjangAlas());

        // Menghitung dan menampilkan volume piramida
        double volume = piramida.hitungVolume();
        System.out.println("Volume piramida: " + volume);

        // Menghitung dan menampilkan luas permukaan piramida
        double luasPermukaan = piramida.hitungLuasPermukaan();
        System.out.println("Luas permukaan piramida: " + luasPermukaan);
    }
}
