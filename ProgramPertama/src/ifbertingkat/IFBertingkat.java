/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifbertingkat;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class IFBertingkat {
    public static void main(String [] args)
    {
    int nilai1, nilai2, nilai3;
    
    Scanner key = new Scanner(System.in);
    System.out.println("Masukkan Nilai 1 : ");
    nilai1 = key.nextInt();
    System.out.println("Masukkan Nilai 2 : ");
    nilai2 = key.nextInt();
    System.out.println("Masukkan Nilai 3 : ");
    nilai3 = key.nextInt();
    
    
    if(nilai1 > nilai2)
    {System.out.println("Nilai 1 lebih besar dari Nilai 2");}
    if(nilai1 > nilai3)
    {System.out.println("Nilai 1 lebih besar dari Nilai 3");}
    else
    {System.out.println("Nilai 1 lebih kecil dari Nilai 2 dan Nilai 3");}
    if(nilai2 > nilai3)
    {System.out.println("Nilai 2 lebih besar dari Nilai 3");}
    if(nilai2 > nilai1)
    {System.out.println("Nilai 2 lebih besar dari Nilai 1");}
    if(nilai3 > nilai2)
    {System.out.println("Nilai 3 lebih besar dari Nilai 2");}
    if(nilai3 > nilai1)
    {System.out.println("Nilai 3 lebih besar dari Nilai 1");}
    }
}
