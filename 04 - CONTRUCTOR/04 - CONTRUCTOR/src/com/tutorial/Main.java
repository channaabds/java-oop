package com.tutorial;

import java.sql.Struct;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

// class tanpa contructor / class polos
class Polos{
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    // constructor dipanggil saat object pertama kali dibua
    // Mahasiswa(){
    //     System.out.println("Ini adalah constructor");
    // }

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}




public class Main {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("Channa","32602200009","Teknik Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Salim","326022000010","Teknik Pertambangan");

       


        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "polos";
        // objectPolos.dataInteger = 0;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);
    }
    
}
