package javaBrocode.variableS;

import java.util.Random;

import javaBrocode.random;

public class DiceRoller {
    
    // int num = 0;
    Random random;
    int num;
    DiceRoller(){
        random = new Random();
        num = 0;
        roll();
        // roll(random , num);
    }


    void roll(/*Random random , int num*/)
    {
        num = random.nextInt(6) + 1;
        System.out.println(num);
    }
}
