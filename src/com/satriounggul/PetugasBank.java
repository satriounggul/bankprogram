package com.satriounggul;

public class PetugasBank {
    
    // Method untuk menampilkan kode cabang dari rekening tertentu.
    // Bertipe public static agar dapat diakses langsung dari class.
    public static void tampilkanKodeCabang(Rekening rekening) {
        System.out.println("Kode Cabang: " + rekening.kodeCabang);
    }
}
