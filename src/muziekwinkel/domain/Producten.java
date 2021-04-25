package muziekwinkel.domain;

import muziekwinkel.domain.personen.Klant;

public interface Producten {

    void inStock();

    void verkoop(Klant klant);
}
