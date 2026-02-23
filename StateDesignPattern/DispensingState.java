public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine, String item) {
        System.out.println("Currently dispensing. Please wait.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Currently dispensing. Cannot insert coins.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Item dispensed successfully.");
        machine.setSelectedItem(null);
        machine.setState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(new OutOfOrderState());
        System.out.println("Machine set to OutOfOrder.");
    }
}
