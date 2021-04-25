package muziekwinkel.domain;

import java.util.ArrayList;
import java.util.List;

public class MuziekWinkel {

    private String naam;
    private String locatie;
    private List<Personen> personen = new ArrayList<>();
    private List<Producten> producten = new ArrayList<>();

    public MuziekWinkel(String naam, String locatie) {
        this.naam = naam;
        this.locatie = locatie;
    }

    public void persoontoevoegen(Personen persoon) {
        personen.add(persoon);
    }
    public void producttoevoegen(Producten product) {
        producten.add(product);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    @Override
    public String toString() {
        return "MuziekWinkel{" +
                "naam='" + naam + '\'' +
                ", locatie='" + locatie + '\'' +
                ", personen=" + personen +
                ", producten=" + producten +
                '}';
    }
}
