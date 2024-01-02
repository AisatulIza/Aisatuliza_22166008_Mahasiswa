/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author LENOVO
 */
class Mahasiswa {
    private String nama;
    private int umur;
    
    public Mahasiswa(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getUmur(){
        return umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void displayinfo(){
        System.out.println ("Nama : " + getNama());
        System.out.println ("Umur : " + getUmur());
    }
}
class MahasiswaBaru extends Mahasiswa{
    private int nim;
    
    public MahasiswaBaru (String nama, int umur, int nim){
        super(nama,umur);
        this. nim = nim;
    }
    public int getNim(){
        return nim;
    }
    public void setNim (int nim){
        this.nim = nim;
    }
    @Override
    public void displayinfo(){
        System.out.println ("Nama : " + getNama());
        System.out.println ("Umur : " + getUmur());
        System.out.println ("Nim : " + getNim());
    }
}
class MahasiswaLama extends Mahasiswa {
    private int angkatan;
    
    public MahasiswaLama (String nama, int umur, int angkatan){
        super(nama, umur);
        this.angkatan = angkatan;
    }
    public int getAngkatan(){
        return angkatan;
    }
    public void setAngkatan(int angkatan){
        this.angkatan = angkatan;
    }
    @Override
    public void displayinfo(){
        System.out.println ("Nama : " + getNama());
        System.out.println ("Umur : " + getUmur());
        System.out.println("Angkatan : " + getAngkatan());
    }
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa ("A'isatul Iza", 19);
        MahasiswaBaru mahasiswa2 = new MahasiswaBaru("Wulandari",18,22166123);
        MahasiswaLama mahasiswa3 = new MahasiswaLama("Mutiara",20,2021);
        
        mahasiswa1.displayinfo();
        System.out.println(" ");
        mahasiswa2.displayinfo();
        System.out.println(" ");
        mahasiswa3.displayinfo();
    }
}