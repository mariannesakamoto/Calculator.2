public class Calculator2 {
    public double tax = 0.05;
    public double tip = 0.15;
    public double originalPrice = 0;
    
    public void findTotal() {
        // Calculate total amount including tax and tip
        double total = originalPrice * (1 + tax + tip);
        
        // Print the total
        System.out.println("Total amount including tax and tip: " + total);
    }

    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();
        calculator.originalPrice = 50; // Assign some value to original price
        calculator.findTotal();
    }
}
