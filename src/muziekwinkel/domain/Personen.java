package muziekwinkel.domain;

public class Personen {

    private String naam;
    private String sex;

    public Personen(String naam, String sex) {
        this.naam = naam;
        this.sex = sex;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
