public class OutOfOrderState implements VendingMachineState {
    public void selectItem(VendingMachine machine, String item) {
        System.out.println("Machine is out of order.");
    }

    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Machine is out of order.");
    }

    public void dispenseItem(VendingMachine machine) {
        System.out.println("Machine is out of order.");
    }

    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is already out of order.");
    }
}
