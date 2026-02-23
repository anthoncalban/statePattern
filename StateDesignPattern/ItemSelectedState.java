public class ItemSelectedState implements VendingMachineState {
    public void selectItem(VendingMachine machine, String item) {
        System.out.println("Item already selected.");
    }

    public void insertCoin(VendingMachine machine, int amount) {
        machine.balance += amount;
        System.out.println("Inserted " + amount + ". Balance: " + machine.balance);
    }

    public void dispenseItem(VendingMachine machine) {
        int price = 50;
        if (machine.balance >= price) {
            machine.sodaCount--;
            machine.balance -= price;
            machine.setState(new DispensingState());
            System.out.println("Dispensing item...");
            machine.getState().dispenseItem(machine);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(new OutOfOrderState());
        System.out.println("Machine set to OutOfOrder.");
    }
}
