package latihanenkapsul;

public class Biodata {
    private int absen; //private => imformation hiding
    private int nis;
    private String nama;
    private String kelas;
    
    public void setNama(String n){
        nama = n;
    }
    public String getNama(){
        return nama;
    }
    public void setAbsen(int a){
        absen = a;
    }
    public int getAbsen(){
        return absen;
    }
    public void setKelas(String k){
        kelas = k;
    }
    public String getKelas(){
        return kelas;
    }
    public void setNIS(int l){
        nis = l;
    }
    public int getNIS(){
        return nis;
    }
    
    
//    public int hitLuas(){
//        int luas;
//        luas = panjang * lebar;
//        return luas;
//    }
    public void infoS4(){
        System.out.println("Nama = " + getNama());
        System.out.println("No Absen = " + getAbsen());
        System.out.println("Kelas = " + getKelas());
        System.out.println("NIS = " + getNIS());
    }
}
