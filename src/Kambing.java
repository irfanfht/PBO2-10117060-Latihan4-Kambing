/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfan Faishan Huta,a
 * 10117060 IF-2
 * Menampilkan hasil penambahan jumlah kambing
 */
public class Kambing {

    public void tambahKambing() {
        //Deklarasi Variabel Lokal
        int jumlahKambing = 0;
        
      jumlahKambing = jumlahKambing + 5;
      System.out.println("Jumlah Kambing Setelah Ditambah : " + jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
      Kambing kambingJantan = new Kambing();
      kambingJantan.tambahKambing();
      
       
    }
    
}
