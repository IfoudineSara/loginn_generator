package geco;

import java.util.Random;

/**
 * class Password
 */
public class PasswordGeneration {



    /**
     * class that generates a new password
     */
   public String getRandomPassword(){
       String mdp = null;
       Random rand = new Random();
       Integer nb;
       for(int i=0;i<8;i++) {
           nb = rand.nextInt(9);
           mdp = mdp + nb.toString();
       }
       return mdp;
   }

}
