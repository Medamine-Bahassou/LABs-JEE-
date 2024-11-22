package org.fstt.lsi.demo.ma.fstt.entities;

public class LigneDeCommande {
    private String id;
    private String commandeId;
    private String produitId;
    private int quantity;

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCommandeId() { return commandeId; }
    public void setCommandeId(String commandeId) { this.commandeId = commandeId; }

    public String getProduitId() { return produitId; }
    public void setProduitId(String produitId) { this.produitId = produitId; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

}
