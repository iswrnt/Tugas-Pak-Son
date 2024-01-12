package game;

public class Game {

    public static void main(String[] args) {
        //objek
        Player Hero = new Player();
        
        
        //mengisi atribut
        Hero.name = "petani";
        Hero.speed = 80;
        Hero.healthPoin = 100;
        
        //jalan Method
        Hero.run();
          
        if (Hero.isDead()) {
            System.out.println("Game over!");
        }
        
//        Drone yanto = new Drone();
//        yanto.energi= 10;
//        yanto.ketinggian= 0;
//        yanto.kecepatan= 60;
//        yanto.merek= "ijd";
//        
//        yanto.terbang();
//        yanto.matikandrone();
//        yanto.maju();
//        yanto.belok();
//        yanto.mundur();
//        yanto.turun();
    }
    
}
