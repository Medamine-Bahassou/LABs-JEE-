package org.fstt.lsi.demo.ma.fstt.entities;

import java.util.Date;

public class Commande {
    private String id;
    private Date date;
    private String clientId;

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getClientId() { return clientId; }
    public void setClientId(String clientId) { this.clientId = clientId; }

}
