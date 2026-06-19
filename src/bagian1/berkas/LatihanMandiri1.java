package bagian1.berkas;

import java.io.File;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        // Membuat objek laporan.txt
        File berkas = new File("laporan.txt");
        
        // Mengecek  berkas ada
        if (berkas.exists()) {
            System.out.println("Berkas ditemukan."+ berkas.getName());
            // Menampilkan ukuran byte
            System.out.println("Ukuran berkas: " + berkas.length() + " bytes.");
        } else {
            System.out.println("Berkas "+ berkas.getName() +" tidak ditemukan.");
        }
    }
}
