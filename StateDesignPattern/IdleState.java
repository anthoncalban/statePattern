public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine, String item) {
        if (machine.hasItem(item)) {
            machine.setSelectedItem(item);
            machine.setState(new ItemSelectedState());
            System.out.println("Item " + item + " selected.");
        } else {
            System.out.println("Item not available.");
        }
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coins before selecting an item.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("No item selected.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(new OutOfOrderState());
        System.out.println("Machine set to OutOfOrder.");
    }
}
