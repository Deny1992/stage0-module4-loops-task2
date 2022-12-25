package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int currentNumber = 2;
        while (currentNumber <= printToInclusive){
            int counter = 2;
            boolean isPrime = true;
            while (counter < currentNumber){
                if(currentNumber % counter == 0){
                    isPrime = false;
                    break;
                }
                counter++;
            }
            if(isPrime){ System.out.println(currentNumber); }
            currentNumber++;
        }
    }
}
