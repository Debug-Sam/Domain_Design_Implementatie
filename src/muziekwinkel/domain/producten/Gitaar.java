package muziekwinkel.domain.producten;

import muziekwinkel.domain.Producten;
import muziekwinkel.domain.personen.Klant;

public class Gitaar implements Producten {

    private String type;
    private Double prijs;
    private String merk;
    private boolean inStock;

    public Gitaar(String type, Double prijs, String merk) {
        this.type = type;
        this.prijs = prijs;
        this.merk = merk;
        this.inStock = true;
    }

    @Override
    public void inStock() {
        if (this.inStock == false) {
            System.out.println("ERROR : het product is niet meer beschikbaar");
        }
    }

    @Override
    public void verkoop(Klant klant) {
        if (klant.getSaldo() > prijs){
            if (this.inStock == false) {
                inStock();
            }
            else {
                this.inStock = false;
                klant.producttoevoegen(this);
                klant.setSaldo(klant.getSaldo() - (prijs - (prijs / 100 * klant.getKortingspercentage() ) ) );
            }
        } else {
            System.out.println("ERROR: niet hoog genoeg saldo.");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrijs() {
        return prijs;
    }

    public void setPrijs(Double prijs) {
        this.prijs = prijs;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public boolean isStock() {
        return inStock;
    }

    public void setStock(boolean stock) {
        this.inStock = stock;
    }

    @Override
    public String toString() {
        return "Gitaar{" +
                "type='" + type + '\'' +
                ", prijs=" + prijs +
                ", merk='" + merk + '\'' +
                ", stock=" + inStock +
                '}';
    }
}
