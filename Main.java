/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Fakhruddin
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        surah s = new surah() {};
        String username, firstName, lastName, ayat;
        s.welcome();
        System.out.println("Sila Nyatakan Nama Anda : ");
        username = scan.nextLine();
        
        peserta p = new peserta(username);
        
        System.out.println("Sila Nyatakan Nama Pertama Anda : ");
        firstName = scan.nextLine();
        p.setFirstName(firstName);
        
        System.out.println("Sila Nyatakan Nama Anda Yang Seterusnya : ");
        lastName = scan.nextLine();
        p.setLastName(lastName);
        
        p.getFirstName();
        p.getLastName();
        
        System.out.println("Sila Nyatakan Surah Yang Anda Mahukan :  (alFatihah , anNas , alFalaq , alIkhlas)");
        ayat = scan.nextLine();
        
        System.out.println("Nama Peserta: " + p.toString());
        s.setAyat(ayat);
        System.out.println("Surah Yang Dipilih: " + s.getAyat()); 
        System.out.println("");    
        
    }  
}
