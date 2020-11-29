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
public abstract class BangunRuang {
    protected float jariJari;
    
    public BangunRuang(float jariJari){
        this.jariJari = jariJari;
    }
    
    public abstract float hitungVolume();
    
    public void tampil(){
        System.out.printf("Volume : %.0f cm%n", Math.ceil(hitungVolume()));
    }
    
}
