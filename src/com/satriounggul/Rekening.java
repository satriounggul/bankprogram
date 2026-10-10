package com.satriounggul;

public class Rekening {
    
    private String namaPemilik;
    private int saldo;
    String kodeCabang;

    public Rekening(String namaPemilik, String kodeCabang, int saldoAwal) {
        this.namaPemilik = namaPemilik;
        this.kodeCabang = kodeCabang;
        this.saldo = saldoAwal;        
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean setor(int jumlah) {
        System.out.println(jumlah);
        if (jumlah > 0) {
            saldo += jumlah;
            return true;
        } else { 
            return false;
        }
    }

    public boolean tarik(int jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }

    protected int hitungBonus() {
        return saldo / 10;
    }
}
