package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class LatihanMandiri2 {
    public static void main(String[] args) {
        try (PrintWriter hari = new PrintWriter(new FileWriter("hari.txt", true))) {
            hari.println("sabtu");
            hari.println("minggu");
            System.out.println("Data berhasil ditulis ke hari.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }
        
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))){
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(" - " + baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}
