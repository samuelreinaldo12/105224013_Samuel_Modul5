public class RekeningBank {
    class RekeningBank{
        private int saldo;
        private int nomorRekening;
    }

    public RekeningBank(string saldo, stringnomorRekening){
        this nomorRekening = nomorRekening;
    }

    if (saldoAwal >= 0 ){
        this.saldo = saldoAwal;
    } else{
        this.saldo = 0;
        System.out.println("Saldo tidak bisa diisi minus. Saldo diset ke 0");
    }

    public int getnomorRekening(){
        return nomorRekening;
    }
    public int getsaldo(){
        return saldo;
    }

    public void setsaldo(int saldoBaru){
        if (saldoBaru>= 0){
            this.saldo = saldoBaru;
            System.out.println("Berhasil. Saldo menjadi Rp" + this.saldo);
        } else {
            System.out.println("Gagal. Angka saldo tidak boleh negatif" + this.saldo);
        }
    }

    }
}
