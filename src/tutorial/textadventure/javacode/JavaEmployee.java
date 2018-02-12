package tutorial.textadventure.javacode;

/**
 * Created by afranzen on 1/23/18.
 */
public class JavaEmployee {
    private final String firstName;
    private final boolean fullTime;

    public JavaEmployee(String firstName) {
        this.firstName = firstName;
        this.fullTime = true;
    }

    public JavaEmployee(String firstName, boolean fullTime) {
        this.firstName = firstName;
        this.fullTime = fullTime;
    }


}
