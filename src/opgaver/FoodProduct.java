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
public class FoodProduct extends Product {
    
    Date udløb;
    int temperatur;
    
    public FoodProduct(int vareNummer, String navn, double pris, Date udløb, int temperatur) {
        super(vareNummer, navn, pris);
        this.udløb = udløb;
        this.temperatur = temperatur;
    }
    
    public String toString() {
        return getNavn() + " udløber " + udløb.toString();
    }
    
}
