package s3uts;
import java.util.Scanner;
import lingkaran.Lingkaran;
import persegipanjang.PersegiPanjang;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    System.out.print("Masukan Panjang Persegi panjang : ");
         int panjang = input.nextInt();
    System.out.print("Masukan lebar Persegi panjang : ");
         int lebar = input.nextInt();
    System.out.print("Masukan jari-jari Lingkaran : ");
         int jari = input.nextInt();
    
    PersegiPanjang Persegipanjang = new PersegiPanjang(panjang, lebar);
    Lingkaran lingkaran = new Lingkaran(jari);
    System.out.print("Luas daerah yang di arsir adalah  " +Persegipanjang.luas()+ "cm - " + lingkaran.luas()+ "cm = " + (Persegipanjang.luas()- lingkaran.luas())+ "cm");
    }
}
