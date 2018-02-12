package tutorial.textadventure.javacode;

/**
 * Created by afranzen on 1/22/18.
 */
public class DummyClass {
    public String isVacationTime(boolean onVacation) {
        return onVacation ? "I'm on vacation!" : "I'm working";
    }

    public void printNumbers(int[] numbers) {
        for(int number: numbers) {
            System.out.println(number);
        }
    }
}
