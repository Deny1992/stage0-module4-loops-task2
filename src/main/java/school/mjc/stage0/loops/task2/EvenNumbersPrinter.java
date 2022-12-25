package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int currentNumber = 0;
        while (currentNumber <= printTillInclusive){

            System.out.println(currentNumber);
            currentNumber += 2;
        }
    }
}
