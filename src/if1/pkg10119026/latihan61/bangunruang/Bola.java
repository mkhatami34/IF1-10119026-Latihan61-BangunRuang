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
public class Bola extends BangunRuang {

    public Bola(float jarijari) {
        super(jarijari);
    }

    @Override
    public float hitungVolume() {
        return (float) (4/3f * Math.PI * Math.pow(jariJari, 3));
    }
    
    
}
