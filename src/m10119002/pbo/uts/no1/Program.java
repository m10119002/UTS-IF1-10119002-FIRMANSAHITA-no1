/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.uts.no1;

import java.util.Scanner;
import m10119002.pbo.uts.no1.target.Age;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi : UTS No-1
 * 
 */
public class Program {
    private static String getInput(Scanner scan) {
        return scan.nextLine();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Age age = new Age(2020);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(Integer.parseInt(getInput(scanner)));
        System.out.println();
        
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : ".
                concat(Integer.toString(age.getYearBirth())));
        System.out.println("Hari ini tahun : ".
                concat(Integer.toString(age.getYearNow())));
        System.out.println("Umur kamu sampai hari ini adalah ".
                concat(Integer.toString(age.hitungUmur())).concat(" tahun"));
        System.out.println("Tandanya Kamu ".
                concat(age.tandanyaKamu(age.hitungUmur())));
    }
}
