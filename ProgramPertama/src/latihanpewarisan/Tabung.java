package latihanpewarisan;

public class Tabung extends BangunRuang{
        private double r,t;
            public Tabung(){
            super();
            System.out.println("Mencetak anak : Tabung \n");
            r = 6;
            t = 20;
            nama = "Ini Tabung";
        }
        public double Volume(){
            return 3.14 * (r * r) * t;
        }
        public void infoTabung(){
            System.out.println("Nama : " + nama);
            System.out.println("Nilai r : " + this.r);
            System.out.println("Nilai t : " + this.t);
            System.out.println("Volume Tabung : "
                    + Volume());
        }
}
