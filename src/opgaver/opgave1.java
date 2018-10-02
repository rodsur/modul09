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
public class opgave1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProductDatabase database = new ProductDatabase();
        
        Product product1 = new Product(02, "gris", 20.0);
        Product product2 = new Product(02, "hest", 10.0);
        Product product3 = new Product(02, "ko", 15.0);
        
        database.addProduct(product1);
        database.addProduct(product2);
        database.addProduct(product3);
        
        database.makeList();
    }
    
}
