package pl.ktrusilo.javaee.zad03.domain;

import java.util.Date;

public class Wardrobe {
    private String name;
    private Date productionDate;
    private boolean isWood;
    private double weight;

    public Wardrobe() {
        super();
    }

    public Wardrobe(String name, Date productionDate, double weight, boolean isWood) {
        this.name = name;
        this.productionDate = productionDate;
        this.weight = weight;
        this.isWood = isWood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProdutionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public boolean isWoodStatus() {
        return isWood;
    }

    public void setVipStatus(boolean isWood) {
        this.isWood = isWood;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
