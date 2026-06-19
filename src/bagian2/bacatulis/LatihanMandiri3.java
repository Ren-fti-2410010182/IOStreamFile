package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LatihanMandiri3 {
    public static void main(String[] args) {
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))){
            String baris;
            int nomor = 1;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(nomor + ". " + baris);
                nomor++;
            }
            int hasil = nomor - 1;
            System.out.println("Total hari ada : " + hasil);
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}
