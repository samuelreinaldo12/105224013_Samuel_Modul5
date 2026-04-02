public class Karyawan {
    private String idkaryawan;
    private String namaKaryawan;
    private Double gajiPokok;
    private String Departemen;

    public Karyawan(String idKaryawan, String namaKaryawan, String Departemen, Double gajiPokok) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.Departemen = Departemen;
        this.gajiPokok = gajiPokok;
    }

    public String getidKaryawan() {
        return idKaryawan;
    }

    public void setidKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getnamaKaryawan() {
        return namaKaryawan;
    }

    public void setnamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public Double getgajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(Double gajiPokok) {
        if (gajiPokok >= 0) {
            this.gajiPokok = gajiPokok;
            System.out.println("Gaji telah diperbarui");
        } else {
            System.out.println("Gagal memperbarui");
        }
    }

    public String getDepartemen() {
        return Departemen;
    }

    public void setDepartemen(String Departemen) {
        this.Departemen = Departemen;
    }

    public void tampilkanDataKaryawan() {
        System.out.println("=== Rangkuman Profil Karyawan ===");
        System.out.println("ID Karyawan : " + idKaryawan);
        System.out.println("Nama        : " + namaKaryawan);
        System.out.println("Departemen  : " + Departemen);
        System.out.println("Gaji Pokok  : Rp" + gajiPokok);
        System.out.println("=================================");
    }
}