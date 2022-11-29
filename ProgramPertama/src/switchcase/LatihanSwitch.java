package switchcase;
import java.util.Scanner;
public class LatihanSwitch {
    public static void main(String args[])
    {
        int Nasi_Goreng, Steak, Mie_Ayam, Siomay_Batagor, Harga;
        Nasi_Goreng = 12000;
        Steak = 15000;
        Mie_Ayam = 7000;
        Siomay_Batagor = 8000;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan No Pesanan Anda : ");
        Harga = input.nextInt();
        switch(Harga)
        {
            case 1 : { System.out.println("Makanan Yang Anda Pilih Adalah " + Nasi_Goreng);
                        break; }
            case 2 : { System.out.println("Makanan Yang Anda Pilih Adalah " + Steak);
                        break; }
            case 3 : { System.out.println("Makanan Yang Anda Pilih Adalah " + Mie_Ayam);
                        break; }
            case 4 : { System.out.println("Makanan Yang Anda Pilih Adalah " + Siomay_Batagor);
                        break; }
            default :{ System.out.println("Pesanan Yang Anda Pilih Tidak Ada Dimenu Pesanan");}
        }
        if (Harga==1) {
        System.out.println("Masukkan Jumlah Makanan Yang Anda Pesan: ");
        int Jumlah = input.nextInt();
        System.out.println("Total Harga = " + Nasi_Goreng * Jumlah);
        }
        if (Harga==2) {
        System.out.println("Masukkan Jumlah Makanan Yang Anda Pesan: ");
        int Jumlah = input.nextInt();
        System.out.println("Total Harga = " + Steak * Jumlah);
        }
        if (Harga==3) {
        System.out.println("Masukkan Jumlah Makanan Yang Anda Pesan: ");
        int Jumlah = input.nextInt();
        System.out.println("Total Harga = " + Mie_Ayam * Jumlah);
        }
        if (Harga==4) {
        System.out.println("Masukkan Jumlah Makanan Yang Anda Pesan: ");
        int Jumlah = input.nextInt();
        System.out.println("Total Harga = " + Siomay_Batagor * Jumlah);
        }
    }
    
}
