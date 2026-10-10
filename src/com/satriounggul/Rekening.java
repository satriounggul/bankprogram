package com.satriounggul;

public class Rekening {
    
    // Inisialisasi atribut.
    
    // Bertipe private, hanya dapat diakses pada class yang sama.
    // Melindungi data nama pemilik rekening.
    private String namaPemilik;
    
    // Bertipe private, hanya dapat diakses pada class yang sama.
    // Perubahan hanya dapat dilakukan melalui method setor() dan tarik() yang telah disediakan.
    private int saldo;

    // Bertipe default, hanya dapat diakses pada package yang sama.
    // Dapat diakses pada class lain dalam package yang sama.
    String kodeCabang;

    // Constructor default value saat object dibuat.
    public Rekening(String namaPemilik, String kodeCabang, int saldoAwal) {
        this.namaPemilik = namaPemilik;
        this.kodeCabang = kodeCabang;
        this.saldo = saldoAwal;        
    }

    // Method Getter, menampilkan nama pemilik rekening.
    // Bertipe public, bisa diakses dimana saja, untuk mengakses private atribut.
    public String getNamaPemilik() {
        return namaPemilik;
    }

    // Method Getter, menampilkan nilai saldo rekening.
    // Bertipe public, bisa diakses dimana saja, untuk mengakses private atribut.
    public int getSaldo() {
        return saldo;
    }

    // Method untuk setor uang, bertipe boolean untuk mendeteksi keberhasilan, memeriksa nilai jumlah agar lebih dari 0.
    public boolean setor(int jumlah) {
        System.out.println(jumlah);
        if (jumlah > 0) {
            saldo += jumlah;
            return true;    // Operasi berhasil.
        } else {
            return false;   // Operasi gagal.
        }
    }

    // Method untuk tarik uang, bertipe boolean untuk mendeteksi keberhasilan, memeriksa nilai jumlah agar lebih dari 0 dan saldo mencukupi untuk ditarik. Hal ini bertujuan untuk mencegah saldo bernilai negatif.
    public boolean tarik(int jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            return true;    // Operasi berhasil.
        } else {
            return false;   // Operasi gagal.
        }
    }

    // Method untuk menghitung bonus, khusus untuk rekening prioritas.
    // Bertipe protected, dapat diakses oleh class lain dalam package yang sama dan subclassnya pada package yang berbeda. Tidak bisa dipanggil langsung dari app.Main
    protected int hitungBonus() {
        return saldo / 10; // Bonus bernilai 10% dari saldo.
    }
}
