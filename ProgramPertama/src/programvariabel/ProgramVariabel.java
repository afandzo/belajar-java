package programvariabel;

public class ProgramVariabel {
    public static void main(String [] args) 
   {
       int bilangan = 80;
       System.out.println(bilangan);
       
       //Luas Trapesium
       int tinggi = 9;
       int sisi_atas = 10;
       int sisi_bawah = 17;
       int luas = (sisi_atas + sisi_bawah)*tinggi/2;
       System.out.println("Luas Trapesium: " +luas);
       
       //Keliling Trapesium
       int sisi_a =5;
       int sisi_b =8;
       int sisi_c =3;
       int sisi_d =16;
       int keliling = sisi_a + sisi_b + sisi_c + sisi_d;
       System.out.println("Kelili Trapesium: " +keliling);
      }
}
