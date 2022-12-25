package school.mjc.stage0.loops.task2;

import java.util.SortedMap;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power < 0){
            System.out.println("too much power");
            return;
        }
        int currentPower = 0;
        while (currentPower <= power){
            System.out.println((int) Math.pow(2, currentPower));
            currentPower++;
        }
    }
}
