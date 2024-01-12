package game;

public class Drone {
  //ATRIBUT
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    //method
    void terbang(){
        energi--;
        if (energi >= 10){
            //terbang berarti nilai ketinggian bertambah
            ketinggian++;
            System.out.println("Drone terbang...");
          }else {
            System.out.println("Energi lemah : Drone tidak bisa terbang");
        }
    }
    void matikandrone(){
        if (ketinggian >= 0){
            System.out.println("Drone tidak bisa dimatikan karena sedang terbang");
        }else{
            System.out.println("Drone dimatikan...");
        }
    }
    void turun(){
        //ketinggian berkurang,karena turun
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }
    
    void belok(){
        energi--;
        System.out.println("Drone belok");
    }
    
    void maju(){
        energi--;
        System.out.println("Drone maju ke depan");
    }
    
    void mundur(){
        energi--;
        System.out.println("Drone mundur");
        kecepatan++;
    }
}
