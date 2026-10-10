package com.satriounggul.prioritas;

import com.satriounggul.Rekening;

public class RekeningPrioritas extends Rekening {  
    public RekeningPrioritas(String namaPemilik, String kodeCabang, int saldoAwal) {
        super(namaPemilik, kodeCabang, saldoAwal);
    }

    public int lihatBonus() {
        return hitungBonus();
    }
}
