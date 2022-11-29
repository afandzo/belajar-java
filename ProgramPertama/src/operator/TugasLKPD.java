package operator;
import java.util.Scanner;
public class TugasLKPD {
    public static void main(String [] args){
    int nilai1, nilai2, nilai3;
    
    Scanner key = new Scanner(System.in);
    System.out.println("Masukkan Nilai 1 : ");
    nilai1 = key.nextInt();
    System.out.println("Masukkan Nilai 2 : ");
    nilai2 = key.nextInt();
    System.out.println("Masukkan Nilai 3 : ");
    nilai3 = key.nextInt();
    
    //TAMPILAN NILAI
    {System.out.println("Nilai 1 = " + nilai1);}
    {System.out.println("Nilai 2 = " + nilai2);}
    {System.out.println("Nilai 3 = " + nilai3);}
    
    //TAMBAH DAN KALI
    int tambah = nilai1  + nilai3;
    int kali = nilai2  * nilai3;
    {System.out.println("Nilai 1 + Nilai 3 = " + tambah);}
    {System.out.println("Nilai 2 * Nilai 3 = " + kali);}
    
    //PERBANDINGAN LEBIH BESAR
    if(nilai1 > nilai2 && nilai1 > nilai3)
    {System.out.println("Nilai 1 lebih besar dari Nilai 2 dan Nilai 3");}
    else if(nilai2 > nilai3 && nilai2 > nilai1)
    {System.out.println("Nilai 2 lebih besar dari Nilai 1 dan nilai 3");}
    else if(nilai3 > nilai2 && nilai3 > nilai1)
    {System.out.println("Nilai 3 lebih besar dari Nilai 1 dan Nilai 2");}
    
    //PERBANDINGAN LEBIH KECIL
    if (nilai1 < nilai2 && nilai1 < nilai3)
    {System.out.println("Nilai 1 lebih kecil dari Nilai 2 dan Nilai 3");}
    else if (nilai2 < nilai3 && nilai2 < nilai1)
    {System.out.println("Nilai 2 lebih kecil dari Nilai 1 dan Nilai 3");}
    else if (nilai3 < nilai2 && nilai3 < nilai1)
    {System.out.println("Nilai 3 lebih kecil dari Nilai 1 dan Nilai 2");}
    }
}
