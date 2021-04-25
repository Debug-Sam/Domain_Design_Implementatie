package muziekwinkel.domain.personen;


import muziekwinkel.domain.Personen;
import muziekwinkel.domain.Producten;

import java.util.ArrayList;
import java.util.List;

public class Klant extends Personen {

    private double kortingspercentage;
    private double saldo;
    private List<Producten> producten = new ArrayList<>();

    public Klant(String naam, String sex, double kortingspercentage, double saldo) {
        super(naam, sex);
        this.kortingspercentage = kortingspercentage;
        this.saldo = saldo;
    }

    public void producttoevoegen(Producten product) {
        producten.add(product);
    }

    public double getKortingspercentage() {
        return kortingspercentage;
    }

    public void setKortingspercentage(double kortingspercentage) {
        this.kortingspercentage = kortingspercentage;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Producten> getProducten() {
        return producten;
    }

    public void setProducten(List<Producten> producten) {
        this.producten = producten;
    }

    @Override
    public String toString() {
        return "Klant{" +
                "kortingspercentage=" + kortingspercentage +
                ", saldo=" + saldo +
                ", producten=" + producten +
                '}';
    }
}
