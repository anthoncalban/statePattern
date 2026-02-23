public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine, String item) {
        System.out.println("Machine is out of order.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Machine is out of order.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Machine is out of order.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is already out of order.");
    }
}
