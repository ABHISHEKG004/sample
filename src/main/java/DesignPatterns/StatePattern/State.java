package DesignPatterns.StatePattern;

/**
 * Created by abhishek.gupt on 17/03/18.
 */

public interface State {

    public void insertCoin()throws MachineWarning;
    public void pressButton()throws MachineWarning;
    public void dispense()throws MachineWarning;
}