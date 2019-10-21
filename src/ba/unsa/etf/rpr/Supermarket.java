package ba.unsa.etf.rpr;

public class Supermarket {
    public Artikl[] a = new Artikl[1000];
    public Korpa korpa;
    private String k;
    private int vel = 0;

    public void dodajArtikl(Artikl neki_artikl) {
        if(vel<1000){
            a[vel] = new Artikl(neki_artikl.getNaziv(), neki_artikl.getCijena(), neki_artikl.getKod());
            vel++;
        }
    }

    public Artikl[] getArtikli() {
        return a;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        int n = 0;
        for(int i=0; i<vel; i++) {
            if (a[i].getKod().equals(kod)){
                n = i;
                Artikl artikl = new Artikl(a[i].getNaziv(),a[i].getCijena(),a[i].getKod());
                for(int j = i; j < vel-1; j++){
                    a[j] = a[j+1];
                }
                vel--;
                return artikl;
            }
        }
        //Artikl artikl = a[n];
        return null;
    }


}

