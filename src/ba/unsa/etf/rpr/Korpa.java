package ba.unsa.etf.rpr;

public class Korpa  {
    public  Artikl[] a = new Artikl[50];
    private int vel = 0;
    //private int korpa;

    public boolean dodajArtikl(Artikl artiklic) {
       if(vel<50){
           a[vel] = new Artikl(artiklic.getNaziv(), artiklic.getCijena(), artiklic.getKod());
           vel++;
          // IspisiKorpu();
           return true;
       }
       return false;
    }
    public void IspisiKorpu(){
        for(int i=0; i<vel; i++) {
            System.out.println("Naziv: "+ a[i].getNaziv() + " Cijena: " + a[i].getCijena() + " Kod: " + a[i].getKod());
        }
    }

    public Artikl[] getArtikli() {
       return a;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<vel; i++) {
            if (a[i].getKod().equals(kod)){
                Artikl artikl = new Artikl(a[i].getNaziv(),a[i].getCijena(),a[i].getKod());
                for(int j = i; j < vel-1; j++){
                    a[j] = a[j+1];
                }
                vel--;
                return artikl;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(int i=0; i<50; i++){
            suma += a[i].getCijena();
        }
        return suma;
    }
}
