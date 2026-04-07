public class Main {
    public static void main(String[] args) {
        System.out.println("=== MEMULAI SIMULASI SISTEM HOTEL ===\n");

        KamarHotel kamar1 = new KamarHotel("101", "Reguler", 2);

        KamarHotel kamar2 = new KamarHotel("202A", "Suite", 2, 750000);

        System.out.println(">>> UJI COBA INPUT DATA NGAWUR (Kamar 1)");
        kamar1.setTipeKamar("Presidential"); 
        kamar1.setHargaPerMalam(-10000);     
        System.out.println();

        System.out.println(">>> UJI COBA OVERCAPACITY (Kamar 2)");
        kamar2.pesanKamar(4); 
        System.out.println();

        System.out.println(">>> UJI COBA PESAN SESUAI ATURAN (Kamar 2)");
        kamar2.pesanKamar(2); 
        System.out.println();

        System.out.println(">>> UJI COBA DOUBLE BOOKING (Kamar 2)");
        kamar2.pesanKamar();  
        System.out.println();

        System.out.println(" UJI COBA TAGIHAN & VOUCHER");
        double tagihanKamar1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total Tagihan Kamar 1 (2 Malam): Rp" + tagihanKamar1);
        
        System.out.println();

        double tagihanKamar2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total Tagihan Kamar 2 (4 Malam, Diskon 20%): Rp" + tagihanKamar2);
        System.out.println();

        System.out.println("=== STRUK INFORMASI PROFIL KAMAR (KONDISI AKHIR) ===");
        kamar1.tampilkanProfilKamar();
        kamar2.tampilkanProfilKamar();
    }
}