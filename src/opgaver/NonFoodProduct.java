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
public class NonFoodProduct extends Product {
    
    //Attributer
    private String materialeListe;
    
    //Constructor
    public NonFoodProduct(int vareNummer, String navn, double pris, String liste) {
        super(vareNummer, navn, pris);
        this.materialeListe = liste;
    }
    
    //Metoder
    
    //Setters Getters

    public String getMaterialeListe() {
        return materialeListe;
    }

    public void setMaterialeListe(String materialeListe) {
        this.materialeListe = materialeListe;
    }
    
    
}
