package com.genspark.quickreferencerest.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_references")
public class Reference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int referenceId;

    private String name;
    private String symbol;
    private String description;

    public Reference() {
    }

    public Reference(String name, String symbol, String description) {
        this.name = name;
        this.symbol = symbol;
        this.description = description;
    }

    public int getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(int referenceId) {
        this.referenceId = referenceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
