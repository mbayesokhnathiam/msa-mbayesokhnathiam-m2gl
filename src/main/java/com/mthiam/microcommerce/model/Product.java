package com.mthiam.microcommerce.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "All details about the product.")
public class Product {

    @ApiModelProperty(notes = "Product ID")
    private int id;

    @ApiModelProperty(notes = "Product name")
    private String nom;

    @ApiModelProperty(notes = "Product price")
    private int prix;

    /**
     * No args contructor
     */
    public Product() {
    }



    /**
     * Args contructor
     */
    public Product(int id, String nom, int prix) {
        this.id=id;
        this.nom=nom;
        this.prix=prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom=nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix=prix;
    }

    @Override
    public String toString(){
        return "Product{"+
                "id=" + id +
                ", nom='"+ nom + '\'' +
                ", prix=" + prix+ '}';
    }
}
