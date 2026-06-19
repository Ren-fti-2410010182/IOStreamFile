package tugas;

public class MainTugas {
    public static void main(String[] args) {
        Gudang gudangAwal = new Gudang("barang.txt");
        
        gudangAwal.tampilkanKategori();
        // Membuat objek Gudang
        
        gudangAwal.tambahBarang(new Barang("Prosesor AMD Ryzen 7", 4500000.0, 5));
        gudangAwal.tambahBarang(new Barang("RAM 32GB DDR5", 1800000.0, 10));
        gudangAwal.tambahBarang(new Barang("SSD 1TB", 1200000.0, 15));
        gudangAwal.tambahBarang(new Barang("Keyboard", 650000.0, 8));
        gudangAwal.tambahBarang(new Barang("Mouse Gaming", 350000.0, 20));
        gudangAwal.tambahBarang(new Barang("HeadSet Gaming", 100000.0, 30));
        gudangAwal.tambahBarang(new Barang("Monitor Gaming(255HZ)", 600000.0, 7));
        gudangAwal.tambahBarang(new Barang("HDMI", 0000.0, 20));

        //Menyimpan ke berkas
        gudangAwal.tampilkanSemua();
        gudangAwal.simpanKeBerkas();
        
        
        System.out.println("\n------------------------------------------------\n");

        //Membuat objek Gudang baru, memuat data, dan menampilkan total nilai
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();
        
        //tampilkan total nilai
        System.out.printf("Total nilai persediaan di gudang: Rp%.0f\n", gudangBaru.totalNilai());
    }
}