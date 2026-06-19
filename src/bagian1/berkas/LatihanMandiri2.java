package bagian1.berkas;

import java.io.File;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        // Membuat objek folder "arsip"
        File folder = new File("arsip");

        //  method mkdir() membuat folder
        if (folder.mkdir()) {
            System.out.println("Folder '"+folder.getName() +"' berhasil dibuat.");
        } else {
            System.out.println("Gagal membuat folder '" + folder.getName() +"' (mungkin sudah ada).");
        }
    }
}
