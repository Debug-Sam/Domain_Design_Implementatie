package muziekwinkel.domain.producten;

import muziekwinkel.domain.Producten;
import muziekwinkel.domain.personen.Klant;

public class Drumstel implements Producten {
    private String type;
    private double prijs;
    private String merk;
    private boolean inStock;


    public Drumstel(String type, Double prijs, String merk) {
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
        if (this.inStock == false) {
            inStock();
        }
        if (klant.getSaldo() > prijs){
            this.inStock = false;
            klant.producttoevoegen(this);
            klant.setSaldo(klant.getSaldo() - (prijs - (prijs / 100 * klant.getKortingspercentage() ) ) );
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

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Drumstel{" +
                "type='" + type + '\'' +
                ", prijs=" + prijs +
                ", merk='" + merk + '\'' +
                ", inStock=" + inStock +
                '}';
    }
}
