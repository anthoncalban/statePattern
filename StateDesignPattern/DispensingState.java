public class DispensingState implements VendingMachineState {
    public void selectItem(VendingMachine machine, String item) {
        System.out.println("Currently dispensing.");
    }

    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coins while dispensing.");
    }

    public void dispenseItem(VendingMachine machine) {
        System.out.println("Item dispensed.");
        machine.selectedItem = null;
        machine.setState(new IdleState());
    }

    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(new OutOfOrderState());
        System.out.println("Machine set to OutOfOrder.");
    }
}
