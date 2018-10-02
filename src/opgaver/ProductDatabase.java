/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

/**
 *
 * @author rodsur
 */
public class ProductDatabase {
    
    //Variabler
    private Product[] productDatabase;
    
    //Constructore
    public ProductDatabase() {
        this.productDatabase = new Product[0];
    }
    
    //Metoder
    public void addProduct(Product product) {
        expandDatabase();
        productDatabase[productDatabase.length-1] = product;
    }
    
    public void makeList() {
        for(int i = 0; i<productDatabase.length;i++) {
            System.out.println(productDatabase[i].getNavn());
        }
    }
    
    private void expandDatabase() {
        Product[] newDatabase;
        newDatabase = new Product[this.productDatabase.length+1];
        for (int i = 0; i<productDatabase.length; i++) {
            newDatabase[i] = productDatabase[i];
        }
        productDatabase = newDatabase;
    }
    
    //Getters Setters
    
}
