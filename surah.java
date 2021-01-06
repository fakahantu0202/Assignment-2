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
abstract class surah1                                                   //abstract class declared
{
    public void welcome()
    {
        System.out.println("Selamat Datang ke Kelas Al-Quran!");
    }
    
}
class surah extends surah1 {
    
    Scanner scan = new Scanner(System.in);
    private String ayat;
    private String peserta;
    private String username;
    
    public surah(String username){
        
        this.ayat = "alFatihah , anNas , alFalaq , alIkhlas";
        this.peserta = "MUHAMMAD FAKHRUDDIN";
        this.username = username;

        
        /*    public surah(String username)
        {
        this.username = username;
        }*/
    
    public void printUsername(String peserta)                                     
    {
        peserta = username;
        System.out.println(username);
    }
    
    public void setPeserta(String peserta)
    {
        this.peserta = peserta;
    }

    public void setAyat(String ayat){
        this.ayat = ayat; 
        
        if (ayat.equalsIgnoreCase("alFatihah"))
        {
            System.out.println("Surah Yang Anda Pilih Adalah : Al-Fatihah ");
            System.out.println("Yuran dikenakan : rm20");
            
        }else if (ayat.equalsIgnoreCase("anNas"))
        {
            System.out.println("Surah Yang Anda Pilih Adalah : An-Nas ");
            System.out.println("Yuran dikenakan : rm30");
            
        }else if (ayat.equalsIgnoreCase("alFalaq"))
        {
            System.out.println("Surah Yang Anda Pilih Adalah : Al-Falaq ");
            System.out.println("Yuran dikenakan : rm40");
            
        }else if (ayat.equalsIgnoreCase("alIkhlas"))
        {
            System.out.println("Surah Yang Anda Pilih Adalah : Al-Ikhlas ");
            System.out.println("Yuran dikenakan : rm50");
            
        }else
        {
            System.out.println("Sila tulis dengan jelas!");
        } 
    }
    
    public String getAyat()
    {
        return ayat;
    }
    
    public String getPeserta()
    {
        return peserta;
    }

    public String toString()
    {
        return peserta + " Memilih Surah : " + ayat;
    }
}
