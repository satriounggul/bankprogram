package com.satriounggul.app;

import com.satriounggul.Rekening;
import com.satriounggul.PetugasBank;
import com.satriounggul.prioritas.RekeningPrioritas;

public class Main {
    public static void main(String[] args) throws Exception {
        Rekening rekening = new Rekening("Satrio", "PWR01", 50000);

        System.out.print("Pemilik : " + rekening.getNamaPemilik());
        System.out.println("Saldo awal : " + rekening.getSaldo());

        System.out.println("");

        System.out.println("Setor : " + rekening.setor(50000));
        System.out.println("Saldo : " + rekening.getSaldo());

        System.out.println("");

        System.out.println("Tarik : " + rekening.tarik(24000));
        System.out.println("Saldo : " + rekening.getSaldo());

        System.out.println("");

        System.out.println("Tarik melebihi saldo : " + rekening.tarik(500000));
        System.out.println("Saldo : " + rekening.getSaldo());

        System.out.println("");

        System.out.print("Kode cabang : " );
        PetugasBank.tampilkanKodeCabang(rekening);

        System.out.println("");

        RekeningPrioritas prioritas = new RekeningPrioritas("Rio", "JKT02", 1000000000);
        System.out.println("Bonus prioritas : " + prioritas.lihatBonus());

        System.out.println("");
        // System.out.println(rekening.saldo);
        // System.out.println(rekening.kodeCabang);
        // System.out.println(prioritas.hitungBonus());
    }
}