package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri3 {
    public static void main(String[] args) {
        //Buat Objeck "sementara.txt"
        File berkas = new File("sementara.txt");

        try {
            System.out.println("Status True (berkas ada) Status False (Berkas tidak ada)");
            System.out.println("");
            //Membuat berkas
            if (berkas.createNewFile()) {
                System.out.println("Berkas 'sementara.txt' berhasil dibuat.");
                System.out.println("");
            }

            //Cek setelah dibuat
            System.out.println("Apakah berkas ada setelah dibuat? " + berkas.getName()+" Status berkas "+berkas.exists());
            System.out.println("");
            //Menghapus berkas
            if (berkas.delete()) {
                System.out.println("Berkas berhasil dihapus.");
                System.out.println("");
            }
            //Cek setelah dihapus
            System.out.println("Apakah berkas ada setelah dihapus? " + berkas.getName()+" Status berkas "+berkas.exists());
            
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
