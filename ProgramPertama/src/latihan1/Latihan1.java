package latihan1;

public class Latihan1 {
    public static void main(String [] args)
    {
    int pensil=15000;
    int buku=45000;
    int pulpen=20000;
    int penghapus=30000;
    int harga= pensil+(2*buku)+(3*pulpen)+penghapus-5000;
    if (harga>100000)
    {
        int diskon = harga*10/100;
        int total_bayar = harga-diskon;
        System.out.println(total_bayar);
    }
    else
    {
        int diskon = harga*5/100;
        int total_bayar = harga - diskon;
        System.out.println(total_bayar);
    }
    }
}
   
