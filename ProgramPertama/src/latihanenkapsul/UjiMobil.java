package latihanenkapsul;

public class UjiMobil {
    public static void main(String[] args) {
        Mobil akses = new Mobil();
        
        akses.setJenisMobil("Jeep Wrangler");
        akses.setMerekMobil("Rubicon");
        akses.setTahunRilis("2018");
        akses.setNamaPemilik("Muhammad Gilang Nur Afandi");
        akses.setNoKendaraan("AD 8181 GLA");
        akses.tampil();
    }
}
