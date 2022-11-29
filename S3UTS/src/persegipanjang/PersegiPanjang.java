package persegipanjang;
import BangunDatar.Bangundatar;

public class PersegiPanjang implements Bangundatar{
    private int panjang;
    private int lebar;
    
 public PersegiPanjang(int panjang, int lebar){
    this.panjang = panjang;
 this.lebar = lebar;
 }
    @Override
    public double luas() {
        return panjang * lebar; 
    }

}
