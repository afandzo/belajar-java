package latihanenkapsul;

public class Mobil {
    private String jenisMobil;
    private String merekMobil;
    private String tahunRilis;
    private String namaPemilik;
    private String noKendaraan;

    public void setJenisMobil(String j) {
        jenisMobil = j;
    }
    public void setMerekMobil(String m) {
        merekMobil = m;
    }
    public void setTahunRilis(String t) {
        tahunRilis = t;
    }
    public void setNamaPemilik(String n) {
        namaPemilik = n;
    }
    public void setNoKendaraan(String no) {
        noKendaraan = no;
    }

    public String getJenisMobil() {
        return jenisMobil;
    }
    public String getMerekMobil() {
        return merekMobil;
    }
    public String getTahunRilis() {
        return tahunRilis;
    }
    public String getNamaPemilik() {
        return namaPemilik;
    }
    public String getNoKendaraan() {
        return noKendaraan;
    }
    
    public void tampil(){
        System.out.println("Jenis Mobil = " + getJenisMobil());
        System.out.println("Merek Mobil = " + getMerekMobil());
        System.out.println("Tahun Rilis = " + getTahunRilis());
        System.out.println("Nama Pemilik = " + getNamaPemilik());
        System.out.println("No Kendaraan = " + getNoKendaraan());
    }
    
}
