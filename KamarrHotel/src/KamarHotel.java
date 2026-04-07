class KamarHotel {
    
    // Encapsulation 
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar); // Memanfaatkan setter agar validasi tetap berjalan
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0.0;
        this.isTersedia = true;
    }

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        setHargaPerMalam(hargaPerMalam); 
        this.isTersedia = true;
    }

    public String getNomorKamar() { return nomorKamar; }
    public void setNomorKamar(String nomorKamar) { this.nomorKamar = nomorKamar; }

    public String getTipeKamar() { return tipeKamar; }
    
    public void setTipeKamar(String tipeKamar) {
        if (tipeKamar.equalsIgnoreCase("Reguler") || 
            tipeKamar.equalsIgnoreCase("Premium") || 
            tipeKamar.equalsIgnoreCase("Suite")) {

            this.tipeKamar = tipeKamar.substring(0, 1).toUpperCase() + tipeKamar.substring(1).toLowerCase();
        } else {
            System.out.println("[SISTEM TOLAK] Tipe '" + tipeKamar + "' tidak dikenali. Dipaksa menjadi 'Reguler'.");
            this.tipeKamar = "Reguler";
        }
    }

    public int getKapasitasMaksimal() { return kapasitasMaksimal; }
    public void setKapasitasMaksimal(int kapasitasMaksimal) { this.kapasitasMaksimal = kapasitasMaksimal; }

    public double getHargaPerMalam() { return hargaPerMalam; }
    
    // Menetapkan harga tiap malam
    public void setHargaPerMalam(double hargaPerMalam) {
        if (hargaPerMalam >= 50000) {
            this.hargaPerMalam = hargaPerMalam;
        } else {
            System.out.println("[SISTEM TOLAK] Harga tidak boleh di bawah 50000. Dipaksa menjadi 50000.");
            this.hargaPerMalam = 50000;
        }
    }

    public boolean getIsTersedia() { return isTersedia; }
    
    public void batalPesan() {
        this.isTersedia = true;
        System.out.println("[INFO] Pesanan kamar " + nomorKamar + " dibatalkan. Kamar kini tersedia.");
    }

    // Reservasi
    public void pesanKamar() {
        if (isTersedia) {
            this.isTersedia = false;
            System.out.println("[SUKSES] Kamar " + nomorKamar + " berhasil dipesan.");
        } else {
            System.out.println("[GAGAL] Kamar " + nomorKamar + " sudah terisi!");
        }
    }

    public void pesanKamar(int jumlahTamu) {
        if (!isTersedia) {
            System.out.println("[GAGAL] Kamar " + nomorKamar + " sudah terisi!");
            return;
        }
        if (jumlahTamu <= kapasitasMaksimal) {
            this.isTersedia = false;
            System.out.println("[SUKSES] Kamar " + nomorKamar + " berhasil dipesan untuk " + jumlahTamu + " tamu.");
        } else {
            System.out.println("[TEGURAN] Overcapacity! Kamar " + nomorKamar + " hanya muat " + kapasitasMaksimal + " orang. Pesanan ditolak.");
        }
    }

    // Bill

    //  Menghitung total tanpa voucher
    public double hitungTotalBayar(int jumlahMalam) {
        return hargaPerMalam * jumlahMalam;
    }

    //  Menghitung total bayar dengan voucher promo 20% (minimal 3 malam)
    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double totalNormal = hitungTotalBayar(jumlahMalam);
        if (kodeVoucher.equals("PROMO") && jumlahMalam >= 3) {
            double diskon = totalNormal * 0.20;
            return totalNormal - diskon;
        } else {
            System.out.println("[INFO VOUCHER] Gagal pakai voucher '" + kodeVoucher + "'. Syarat min 3 malam tidak terpenuhi atau kode salah. Tagihan normal berlaku.");
            return totalNormal;
        }
    }

    // Cetak profil kamar
    public void tampilkanProfilKamar() {
        System.out.println("---------------------------------");
        System.out.println("Nomor Kamar : " + nomorKamar);
        System.out.println("Tipe        : " + tipeKamar);
        System.out.println("Kapasitas   : " + kapasitasMaksimal + " Orang");
        System.out.println("Harga/Malam : Rp" + hargaPerMalam);
        System.out.println("Status      : " + (isTersedia ? "Tersedia" : "Terisi"));
        System.out.println("---------------------------------");
    }
}