/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cux27
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(super.getBalance());
    }
    public String history(){
        return this.history.toString();
    }
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }
    @Override
    public double takeFromWarehouse(double amount){
        double actualAmount = super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        return actualAmount;
    }
    public void printAnalysis(){
        System.out.println("Product: " + super.getName() 
                + "\n" + "History: " + this.history.toString()
                + "\n" + "Largest amount of product: " + this.history.maxValue()
                + "\n" + "Smallest amount of product: " + this.history.minValue() 
                + "\n" + "Average: " + this.history.average());
    }
}
