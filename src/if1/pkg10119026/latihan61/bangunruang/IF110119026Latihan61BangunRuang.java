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
public class IF110119026Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunRuang kerucut, tabung, bola;
        bola = new Bola(7);
        System.out.println("Volume Bola Basket");
        bola.tampil();

        kerucut = new Kerucut(14, 9);
        System.out.println("Volume Bola Kerucut");
        kerucut.tampil();

        tabung = new Tabung(10, 21);
        System.out.println("Volume Bola Tabung");
        tabung.tampil();

    }
    
}
