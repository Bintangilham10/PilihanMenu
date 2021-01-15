
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class PilihanMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        //membuat objek scan dari class library scanner//
        Scanner masukan = new Scanner(System.in);
        int pilihan = 9;
        
        //Perulangan do-While//
        do{
        
        //menbuat perintah user//
        //yang berisi nilai/value dari inputan user di objek masukan/input
        //lalu nextInt() membuat baris baru angka dibawah 
        System.out.println("\nMENU LUAS BANGUN");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Luas Persegi Panjang");
        System.out.println("3. Keluar");
        System.out.print("Masukkan Pilihan Anda : ");
        pilihan = masukan.nextInt();
        
        //Percabangan switch case// 
        switch(pilihan){
            case 1 : luasPersegi();
            break;
            
            case 2 : luasPersegiPanjang();
            break;
        }
        }
        while(pilihan !=3);
    }
          //Method #2
    private static void luasPersegi(){
      //membuat objek scan dari class library scanner//
      Scanner masukan = new Scanner(System.in);
      
       //Deklarasi Variabel//
       float sisi,luas;
       
       //menbuat perintah inputan user//
       //yang berisi nilai/value dari inputan user di objek masukan/input
       //lalu next() untuk inputan Float  
       System.out.print("masukkan nilai sisi :");
       sisi = masukan.nextFloat();
       
       //Operator aritmatika//
       luas = sisi * sisi;
       System.out.println("Luas Persegi adalah : " + luas);
    }

    private static void luasPersegiPanjang(){
        //membuat objek scan dari class library scanner//
        Scanner masukan = new Scanner(System.in);
        
        //Deklarasi Variabel//
        float panjang, lebar, luas;
        
        //menbuat perintah inputan user//
       //yang berisi nilai/value dari inputan user di objek masukan/input
       //lalu next() untuk inputan Float  
        System.out.print("Masukkan nilai panjang : ");
        panjang = masukan.nextFloat();
        System.out.print("Masukkan nilai lebar : ");
        lebar = masukan.nextFloat();
        luas = panjang * lebar;
        
        //menampilkan output hasil//
        System.out.println("Luas Persegi Panjang adalah : " + luas);
    }
    
}
