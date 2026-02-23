public class VendingMachine {
    private VendingMachineState state;
    public int sodaCount = 5;
    public int balance = 0;
    public String selectedItem;

    public VendingMachine() {
        state = new IdleState();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public VendingMachineState getState() {
        return state;
    }

    public void selectItem(String item) {
        state.selectItem(this, item);
    }

    public void insertCoin(int amount) {
        state.insertCoin(this, amount);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }

    public void setOutOfOrder() {
        state.setOutOfOrder(this);
    }
}
