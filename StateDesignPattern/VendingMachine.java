import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private VendingMachineState state;
    private Map<String, Integer> inventory = new HashMap<>();
    private Map<String, Integer> prices = new HashMap<>();
    private int balance = 0;
    private String selectedItem;

    public VendingMachine() {
        this.state = new IdleState();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public VendingMachineState getState() {
        return state;
    }

    public void setSelectedItem(String item) {
        this.selectedItem = item;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void addBalance(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void deductBalance(int amount) {
        balance -= amount;
    }

    public boolean hasItem(String item) {
        return inventory.getOrDefault(item, 0) > 0;
    }

    public int getItemPrice(String item) {
        return prices.getOrDefault(item, 0);
    }

    public void reduceInventory(String item) {
        inventory.put(item, inventory.get(item) - 1);
    }

    // Delegate actions to current state
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

    // Utility methods to load inventory
    public void addItem(String item, int price, int quantity) {
        inventory.put(item, quantity);
        prices.put(item, price);
    }
}
