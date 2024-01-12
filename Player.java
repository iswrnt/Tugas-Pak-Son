package game;

public class Player {
    //atribut 
    String name ;
    int speed;
    int healthPoin;
            
    //method
   void run(){
       System.out.println(name+" is running...");
       System.out.println("speed "+speed);
   }
  
   boolean isDead(){
       if (healthPoin <= 0)return true; 
           return false;
    }
     
}
