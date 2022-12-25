package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int currentNumber = 0;
        while (currentNumber <= Math.abs(multiplyByAndToInclusive) && multiplyByAndToInclusive != 0){
            System.out.println(currentNumber * multiplyByAndToInclusive);
            currentNumber++;
        }
    }
}
