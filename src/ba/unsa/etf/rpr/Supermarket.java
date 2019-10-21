package ba.unsa.etf.rpr;

private class Supermarket {
    public Artikl[] a = new Artikl[1000];
    public Korpa korpa;
    private String k;
    Supermarket(Artikl[] b, Korpa k, String l){
        for(int i=0; i<1000; i++){
            a[i].naziv_proizvoda = b[i].naziv_proizvoda;
            a[i].cijena = b[i].cijena;
            a[i].kod = b[i].kod;
        }
        korpa = k;
        k = l;
    }
    public void dodajArtikl(Artikl neki_artikl) {
        int i = 0;
        while (a[i] != 0) {
            i++;
        }
        a[i] = neki_artikl;
    }

    public Artikl[] getArtikli() {
        return artikl.naziv_proizvoda, artikl.cijena, artikl.kod;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<1000; i++) {
            if (a[i].kod.equals(a[i].kod)){
                int j = i;
                int n = i;
                while(j!=1000-1) {
                    a[j] = a[j + 1];
                    j++;
                }
            }
        }
        return a[n];
    }


}
}
