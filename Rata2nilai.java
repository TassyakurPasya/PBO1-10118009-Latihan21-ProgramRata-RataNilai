/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rata2nilai;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama  : Tassyakur Pasya
 * Kelas : IF-01
 * NIM : 10118009
 * Matkul : PBO-01
 * Diskripsi Program : rata-rata nilai 
 */
public class Rata2nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahMhs;
        double rataNilai = 0;
        String nama = "Tassyakur pasya";
        
        
        Scanner mahaSiswa = new Scanner(System.in);
        System.out.print("Memasukan Banyaknya Mahasiswa = ");
        jumlahMhs = mahaSiswa.nextInt();
        
        for ( int i = 0; i < jumlahMhs; i++){
            System.out.print("Nilai Mahasiswa ke- " + (i+1) + " : ");
            rataNilai += mahaSiswa.nextInt();
            
        }
        rataNilai /= jumlahMhs;
        System.out.println("Maka, Rata-rata Nilainya adalah "+rataNilai);
        System.out.println("Developed by : "+nama);
    }
    
}
