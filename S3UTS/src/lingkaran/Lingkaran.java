package lingkaran;
import BangunDatar.Bangundatar;

public class Lingkaran implements Bangundatar {
     private final  int jari;
        public Lingkaran (int jari){
            this.jari = jari;
      }

    @Override
    public double luas() {
       return (Math.PI * jari * jari)/2; 
    }
}