package com.satriounggul.prioritas;

// Import class Rekening agar dapat diakses, karena berbeda package.
import com.satriounggul.Rekening;

// Pembuatan class RekeningPrioritas sebagai subclass dari Rekening dengan extends
public class RekeningPrioritas extends Rekening {  
    
    // Method dari parent class menggunakan super(), untuk membuat rekening baru dengan tipe prioritas.
    public RekeningPrioritas(String namaPemilik, String kodeCabang, int saldoAwal) {
        super(namaPemilik, kodeCabang, saldoAwal);  // Menggunakan super untuk memanggil constructor milik parent class.
    }
    
    // Method untuk menampilkan bonus dari rekening prioritas, sebagai method untuk mengakses protected attribute.
    // hitungBonus() bertipe protected, sehingga dapat diakses oleh subclass di package yang berbeda.
    public int lihatBonus() {
        return hitungBonus();
    }
}
