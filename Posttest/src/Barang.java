class Barang {
    private String idBarang;
    private String namaBarang;
    private int stok;
    private double hargaSatuan;
    protected String kategori;

    public Barang(String idBarang, String namaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = 0;
        this.hargaSatuan = 0.0;
        this.kategori = "Belum Ada Kategori";
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("[TOLAK] Gagal set stok: Stok tidak boleh angka negatif!");
        }
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(double hargaSatuan) {
        if (hargaSatuan > 0) {
            this.hargaSatuan = hargaSatuan;
        } else {
            System.out.println("[TOLAK] Gagal set harga: Harga satuan harus lebih dari 0!");
        }
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
            System.out.println("Berhasil menambah stok sebanyak " + jumlah);
        } else {
            System.out.println("Jumlah penambahan stok harus lebih dari 0!");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0) {
            if (this.stok >= jumlah) {
                this.stok -= jumlah;
                System.out.println("Berhasil mengurangi stok sebanyak " + jumlah);
            } else {
                System.out.println("Jumlah stok di gudang tidak mencukupi!");
            }
        } else {
            System.out.println("Jumlah pengurangan stok harus lebih dari 0!");
        }
    }

    public void tampilkanDetailBarang() {
        System.out.println("\n=== DETAIL BARANG ===");
        System.out.println("ID Barang    : " + idBarang);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Kategori     : " + kategori);
        System.out.println("Stok         : " + stok + " unit");
        System.out.println("Harga Satuan : Rp" + hargaSatuan);
        System.out.println("=====================\n");
    }
}