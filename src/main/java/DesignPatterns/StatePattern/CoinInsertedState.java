package DesignPatterns.StatePattern;

/**
 * Created by abhishek.gupt on 17/03/18.
 */

public class CoinInsertedState implements State{
    VendingMachine machine =null;
    public CoinInsertedState(VendingMachine machine) {
        this.machine =  machine;
    }
    public void insertCoin() throws MachineWarning{
        throw new MachineWarning("Coin is already inserted.");
    }
    public void dispense() throws MachineWarning{
        throw new MachineWarning("Dispense button is not pressed.");

    }
    public void pressButton() throws MachineWarning{
        machine.setMachineState(machine.getDispensingState());
    }
}