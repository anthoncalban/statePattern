public class IdleState implements VendingMachineState {
    public void selectItem(VendingMachine machine, String item) {
        if (item.equals("Soda") && machine.sodaCount > 0) {
            machine.selectedItem = item;
            machine.setState(new ItemSelectedState());
            System.out.println("Item " + item + " selected.");
        } else {
            System.out.println("Item not available.");
        }
    }

    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coins before selecting an item.");
    }

    public void dispenseItem(VendingMachine machine) {
        System.out.println("No item selected.");
    }

    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(new OutOfOrderState());
        System.out.println("Machine set to OutOfOrder.");
    }
}
