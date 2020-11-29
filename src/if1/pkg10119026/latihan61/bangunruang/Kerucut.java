/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan61.bangunruang;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : IF-1
 * NIM      : 10119026
 * Deslripsi : program ini menampilkan hasil hitung bangun ruang
 */
public class Kerucut extends BangunRuang {
    private float tinggi;

    public Kerucut(float jarijari, float tinggi) {
        super(jarijari);
        this.tinggi = tinggi;
    }

    @Override
    public float hitungVolume() {
        return (float) (1/3f * Math.PI * Math.pow(jariJari, 2) * tinggi);
    }
    
    
}
