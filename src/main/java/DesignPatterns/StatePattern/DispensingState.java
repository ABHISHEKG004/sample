package DesignPatterns.StatePattern;

/**
 * Created by abhishek.gupt on 17/03/18.
 */

public class DispensingState implements State{
    VendingMachine machine ;
    DispensingState(VendingMachine machine) {
        this.machine = machine;
    }
    public void insertCoin() throws MachineWarning {
        throw new MachineWarning("wait ... previous order is processing");
    }
    public void pressButton() throws MachineWarning {
        throw new MachineWarning("wait ... previous order is processing");
    }
    public void dispense() throws MachineWarning {
        machine.setMachineState(machine.getNoCoinInsertedState());
    }
}