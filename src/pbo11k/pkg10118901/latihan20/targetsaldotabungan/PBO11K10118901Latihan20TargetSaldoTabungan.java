/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan20.targetsaldotabungan;

/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Tentang Program  : Menghitung saldo tabungan dengan bunga 8% dengan target tertentu
 */
public class PBO11K10118901Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int saldo = 3500000,i = 1;
        double bunga;
        
        do {
            bunga = saldo * 0.08;
            saldo = (int) (saldo + bunga);
            System.out.printf("Saldo di bulan ke-"+i+" Rp.%,10d%n",saldo);
            i++;
        } while (saldo <=6000000);
    }
    
}
