package ba.unsa.etf.rpr;


public class Artikl {
      private String naziv_proizvoda;
      private int cijena;
      private String kod;

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

