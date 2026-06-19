package tugas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Gudang {

    private ArrayList<Barang> daftar = new ArrayList<>();
    private String namaBerkas;
    private String[] kategori = {"Komponen Komputer", "Aksesoris", "Periferal", "Kabel"};
    
    public void tampilkanKategori() {
        System.out.println("== Kategori Gudang ==");
        for (String k : kategori) {
            System.out.println("- " + k);
        }
        System.out.println();
    }
    
    public Gudang(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    public void tambahBarang(Barang barang) {
        daftar.add(barang);
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Barang di Gudang ==");
        for (int i = 0; i < daftar.size(); i++) {
            Barang b = daftar.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    public void simpanKeBerkas() {
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) {
            for (Barang b : daftar) {
                penulis.println(b.keBaris());
            }
            System.out.println("Data barang berhasil disimpan ke " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan: " + e.getMessage());
        }
    }

    public void muatDariBerkas() {
        daftar.clear(); // Bersihkan list sebelum memuat data baru
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                String[] bagian = baris.split(";");
                // Memastikan baris memiliki 3 bagian (nama, harga, stok)
                if (bagian.length == 3) {
                    String nama = bagian[0];
                    // Konversi String ke tipe data yang sesuai
                    double harga = Double.parseDouble(bagian[1]);
                    int stok = Integer.parseInt(bagian[2]);

                    daftar.add(new Barang(nama, harga, stok));
                }
            }
            System.out.println("Data barang dimuat dari " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal memuat: " + e.getMessage());
        }
    }

    // Menjumlahkan dari seluruh barang
    public double totalNilai() {
        double total = 0;
        for (Barang b : daftar) {
            total += (b.getHarga() * b.getStok());
        }
        return total;
    }
}
