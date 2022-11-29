package perulangan;

public class LatihanPerulangan {
    public static void main(String args[])
    {
//        tugas absen ganjil
        for (int i=1; i<=5; i++)
        {
        System.out.print(i + " ");
        }
        System.out.print("\n");
        for (int j=6; j<=10; j++)
        {
        System.out.print(j + " ");
        }
//        akhir tugas absen ganjil
        
        System.out.print("\n");
        System.out.print("\n");
        
//        tugas absen genap
        int a [][] = {{1,2,3,4,5},{6,7,8,9,10}};
        int j = 0;
        while (j <= 4)
        {
            int i = 0;
            while(i <= 1)
            {
                System.out.print(a[i][j]);
                i++;
            }
            System.out.println();
            j++;
        }
//        akhir tugas absen genap
    }
    
}
