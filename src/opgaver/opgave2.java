/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;
import java.util.Date;
/**
 *
 * @author rodsur
 */
public class opgave2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductDatabase database = new ProductDatabase();
        
        Date dato = new Date();
        
        FoodProduct product1 = new FoodProduct(01, "gris", 20.0,dato,20);
        NonFoodProduct product2 = new NonFoodProduct(02, "hest", 10.0, "indeholder hest");
        Product product3 = new Product(03, "ko", 15.0);
        
        database.addProduct(product1);
        database.addProduct(product2);
        database.addProduct(product3);
        
        database.makeList();
        System.out.println("varene koster samlet: " + database.returnSum());
        database.removeProduct(2);
        database.makeList();
        System.out.println("varene koster samlet: " + database.returnSum());
    }
    
}
