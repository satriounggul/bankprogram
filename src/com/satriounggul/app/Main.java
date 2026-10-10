package com.satriounggul.app;

// Import semua class yang dipakai dari package lain
import com.satriounggul.Rekening;
import com.satriounggul.PetugasBank;
import com.satriounggul.prioritas.RekeningPrioritas;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Membuat objek rekening, dan memanggil constructor.
        Rekening rekening = new Rekening("Satrio", "PWR01", 50000);

        // Demonstrasi menampilkan nama pemilik rekening dan saldo awal.
        System.out.print("Pemilik : " + rekening.getNamaPemilik());
        System.out.println("Saldo awal : " + rekening.getSaldo());

        System.out.println("");

        // Demonstrasi melakukan setor uang, kemudian menampilkan saldo terbaru.
        System.out.println("Setor : " + rekening.setor(50000));
        System.out.println("Saldo : " + rekening.getSaldo());

        System.out.println("");

        // Demonstrasi melakukan tarik uang, kemudian menampilkan saldo terbaru.
        System.out.println("Tarik : " + rekening.tarik(24000));
        System.out.println("Saldo : " + rekening.getSaldo());   // Melalui method getter.

        System.out.println("");

        // Demonstrasi melakukan skenario tarik uang melebihi saldo, menolak proses tarik uang, kemudian menampilkan saldo yang belum berubah.
        System.out.println("Tarik melebihi saldo : " + rekening.tarik(500000));
        System.out.println("Saldo : " + rekening.getSaldo());

        System.out.println("");

        // Demonstrasi menampilkan kode cabang dari rekening tertentu.
        System.out.print("Kode cabang : " );
        PetugasBank.tampilkanKodeCabang(rekening);

        System.out.println("");

        // Demonstrasi membuat rekening prioritas, kemudian menampilkan bonus prioritas yang dimiliki
        RekeningPrioritas prioritas = new RekeningPrioritas("Rio", "JKT02", 1000000000);
        
        // Mengakses bonus dengan memanggil method lihatBonus(), karena tidak bisa memanggil hitungBonus() yang bertipe protected.
        System.out.println("Bonus prioritas : " + prioritas.lihatBonus());

        System.out.println("");

        // Demonstrasi menampilkan 
        // System.out.println(rekening.saldo);
        // System.out.println(rekening.kodeCabang);
        // System.out.println(prioritas.hitungBonus());
    }
}