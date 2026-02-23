public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine, String item) {
        System.out.println("Item already selected. Cannot select another.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        machine.addBalance(amount);
        System.out.println("Inserted " + amount + " coins. Current balance: " + machine.getBalance());
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        if (machine.getBalance() >= machine.getItemPrice(machine.getSelectedItem())) {
            machine.reduceInventory(machine.getSelectedItem());
            machine.deductBalance(machine.getItemPrice(machine.getSelectedItem()));
            machine.setState(new DispensingState());
            System.out.println("Dispensing item...");
            machine.getState().dispenseItem(machine); 
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(new OutOfOrderState());
        System.out.println("Machine set to OutOfOrder.");
    }
}
