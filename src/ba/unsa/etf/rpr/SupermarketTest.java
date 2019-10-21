package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void daLiSeIspravnoDodajeArtikl(){
    Supermarket supermarket = new Supermarket();
    supermarket.dodajArtikl(new Artikl("dvojni c", 99, "kod"));
    Artikl[] artikli = supermarket.getArtikli();
    boolean  dodano =false;
    for(int i=0; i<artikli.length; i++ ){
        if(artikli[i]!=null){
            if(artikli[i].getNaziv().equals("dvojni c")){
                dodano = true;
                break;
            }
        }
    }
    assertTrue(dodano);
}

    @Test
    void daLiPrekoracuje(){
            assertDoesNotThrow(
                    () -> {
                        Supermarket supermarket = new Supermarket();
                        for (int i = 0; i < 5000; i++) {
                            supermarket.dodajArtikl(new Artikl("dvojni c", 12, "12"));
                        }
                    }
        );
}

    @Test
    void daLiSeIspravnoIzbacuje(){
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("dvojni c", 12, "c"));
        supermarket.izbaciArtiklSaKodom("c");
        Artikl[] artikli = supermarket.getArtikli();
        boolean nema_artikla_u_korpi = true;
        
        for(int i=0; i<artikli.length; i++){
            if(artikli[i]!=null){
                if(artikli[i].getKod().equals("c")) {
                    nema_artikla_u_korpi = false;
                    break;
                }
            }
        }
        assertFalse(nema_artikla_u_korpi);
}

}