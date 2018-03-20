package DesignPatterns.StatePattern;

/**
 * Created by abhishek.gupt on 17/03/18.
 */
public class MachineWarning extends Exception {
    public MachineWarning(String message)
    {
        super(message);
    }
}