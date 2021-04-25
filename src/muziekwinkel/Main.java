package muziekwinkel;

import muziekwinkel.domain.MuziekWinkel;
import muziekwinkel.domain.personen.Klant;
import muziekwinkel.domain.producten.Drumstel;
import muziekwinkel.domain.producten.Gitaar;

public class Main {
    public static void main(String[] args) {
        Gitaar TCES = new Gitaar(
                "Klassiek",
                249.00,
                "Angel Lopez Mencia"
        );
        Klant Piet = new Klant(
                "Piet van der Vliet",
                "Man",
                10,
                500.00
        );
        Drumstel RM52KH6C = new Drumstel(
                "Klassiek",
                525.00,
                "TAMA Rhythm Mate"
        );
        MuziekWinkel VanAllesWat = new MuziekWinkel(
                "VanAllesWat",
                "Utrecht"
        );
        Klant Arend = new Klant(
                "Arend Beer",
                "Man",
                5.0,
                1000.00
        );

        System.out.println(VanAllesWat);
        VanAllesWat.persoontoevoegen(Piet);
        VanAllesWat.producttoevoegen(TCES);
        VanAllesWat.producttoevoegen(RM52KH6C);
        VanAllesWat.persoontoevoegen(Arend);
        System.out.println(VanAllesWat);

        System.out.println(Piet);
        System.out.println("Piet koopt een gitaar");
        TCES.verkoop(Piet);
        System.out.println("Piet heeft de gitaar gekocht. Het saldo is omlaag en de gitaar is niet meer te koop.");
        System.out.println(Piet);
        System.out.println(TCES);
        System.out.println("Piet wilt ook een drumstel kopen");
        RM52KH6C.verkoop(Piet);
        System.out.println("Piet kan niet een gitaar en drumstel kopen omdat zijn saldo te laag is");
        System.out.println("Arend wilt ook dezelfde gitaar hebben als Piet. Maar Piet heeft het product al gekocht");
        TCES.verkoop(Arend);
        System.out.println(Arend);
        System.out.println("Arend kan het product niet kopen omdat het niet meer beschikbaar is");
    }
}

