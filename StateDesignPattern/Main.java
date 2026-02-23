public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.addItem("Soda", 50, 5);
        machine.addItem("Chips", 30, 3);

        System.out.println("=== Scenario 1: Buy Soda ===");
        machine.selectItem("Soda");   
        machine.insertCoin(20);         
        machine.dispenseItem();           
        machine.insertCoin(50);          
        machine.dispenseItem();         

        System.out.println("\n=== Scenario 2: Out of Order ===");
        machine.setOutOfOrder();          
        machine.selectItem("Chips");      
        machine.insertCoin(30);           
        machine.dispenseItem();          

        System.out.println("\n=== Scenario 3: Back to Idle ===");
        machine.setState(new IdleState());
        machine.selectItem("Chips");
        machine.insertCoin(30);
        machine.dispenseItem();
    }
}
