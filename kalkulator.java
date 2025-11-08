/**
 * Kelas Kalkulator sederhana untuk operasi aritmatika dasar.
 * Menyediakan fungsi penjumlahan dan pembagian.
 */
public class kalkulator {

    /**
     * Menghitung hasil penjumlahan dari dua bilangan integer.
     * 
     * @param a bilangan pertama (integer)
     * @param b bilangan kedua (integer)
     * @return hasil penjumlahan (integer) dari a dan b
     */
    public int tambah(int a, int b) {
        return a + b;
    }

    /**
     * Menghitung hasil pembagian dari dua bilangan integer.
     *
     * @param a pembilang (integer)
     * @param b penyebut (integer)
     * @return hasil pembagian (double) dari a dibagi b
     * @throws IllegalArgumentException jika penyebut (b) adalah nol.
     */
    public double bagi(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Tidak bisa dibagi dengan nol");
        }
        return (double) a / b;
    }
}