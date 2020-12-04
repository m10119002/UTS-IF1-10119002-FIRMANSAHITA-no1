/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.uts.no1.target;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi : UTS no-1
 * 
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private static String red = "\u001B[31m";
    
    public Age(int yearNow) {
        this.yearNow = yearNow;
    }
    
    public int getYearBirth() {return this.yearBirth;}
    public void setYearBirth(int yearBirth) {this.yearBirth = yearBirth;}
    public int getYearNow() {return this.yearNow;}
    public int hitungUmur() {return this.yearNow-this.yearBirth;}
    public String tandanyaKamu(int umur) {
        if((0 <= umur) && (umur <= 5)) {
            return red.concat("LAGI LUCU-LUCU NYA");
        } else if((5 < umur) && (umur <= 10)) {
            return red.concat("MASIH ANAK-ANAK");
        } else if((10 < umur) && (umur <= 13)) {
            return red.concat("MASIH REMADJA");
        } else if((13 < umur) && (umur <= 19)) {
            return red.concat("ALAY");
        } else if((19 < umur) && (umur <= 29)) {
            return red.concat("LAGI GALAU NYARI JODOH");
        } else if((29 < umur) && (umur <= 35)) {
            return red.concat("LAGI SIBUK NYARI UANG");
        } else if((35 < umur) && (umur <= 150)) {
            return red.concat("SUDAH TUA");
        } else if((0 > umur) || (umur > 150)) {
            return red.concat("TIDAK TERDETEKSI DI KEHIDUPAN");
        } else {
            return red.concat("???");
        }
    }
}
