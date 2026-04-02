public class Main {
    public static void main(String[] args) {
        System.out.println("=== MEMULAI SISTEM GUDANG BARU ===");

        Barang barang1 = new Barang("ELK-001", "Kulkas 2 Pintu");

        System.out.println("--- MENGUJI KEAMANAN SISTEM (Mencoba input data ngawur) ---");
        barang1.setHargaSatuan(-5000000);
        barang1.kurangiStok(10);

        System.out.println("--- MENGISI DATA YANG BENAR ---");
        barang1.setKategori("Elektronik");
        barang1.setHargaSatuan(3500000);

        barang1.tambahStok(20);

        barang1.kurangiStok(5);

        barang1.tampilkanDetailBarang();
    }
}