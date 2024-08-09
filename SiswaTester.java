//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //object
        //Class object = new Constructor
        Siswa tegar = new Siswa();
        Siswa naufal = new Siswa();
        Siswa ryuichi = new Siswa();
        Siswa bima = new Siswa();
        Siswa moreno = new Siswa();

        naufal.id = 28;
        naufal.nama = "Naufal";
        naufal.ipk = 0;
        ryuichi.id = 32;
        ryuichi.nama = "Ryuichi";
        ryuichi.ipk = 100;
        tegar.id = 16;
        tegar.nama = "Tegar";
        tegar.ipk = 100;
        bima.id = 2;
        bima.nama = "Bima";
        bima.ipk = 100;
        moreno.id = 24;
        moreno.nama = "Moreno";
        moreno.ipk = 100;

        System.out.println("Nama : " + naufal.nama);
        System.out.println("Absen : " + naufal.id);
        System.out.println("Nilai : " + naufal.ipk);
        System.out.println("   ");
        System.out.println("Nama : " + ryuichi.nama);
        System.out.println("Absen : " + ryuichi.id);
        System.out.println("Nilai : " + ryuichi.ipk);
        System.out.println("   ");
        System.out.println("Nama : " + tegar.nama);
        System.out.println("Absen : " + tegar.id);
        System.out.println("Nilai : " + tegar.ipk);
        System.out.println("   ");
        System.out.println("Nama : " + bima.nama);
        System.out.println("Absen : " + bima.id);
        System.out.println("Nilai : " + bima.ipk);
        System.out.println("   ");
        System.out.println("Nama : " + moreno.nama);
        System.out.println("Absen : " + moreno.id);
        System.out.println("Nilai : " + moreno.ipk);
    }
}