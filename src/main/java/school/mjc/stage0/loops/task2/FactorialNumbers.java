package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        while (counter <= printToInclusive){
            int i = 1;
            int result = 1;
            while (i <= counter){
                result *= i;
                i++;
            }
            System.out.println(result);
            counter++;
        }
    }
}
