package ba.unsa.etf.rpr;


public class Artikl {
      public String naziv_proizvoda;
      public int cijena;
      public String kod;

    Artikl(String naziv, int c, String k) {
        naziv_proizvoda = naziv;
        cijena = c;
        kod = k;
    }
       public String getNaziv(){
            return this.naziv_proizvoda;
        }

       public int getCijena(){
            return this.cijena;
        }

       public String getKod(){
            return this.kod;
        }
    }

