package pt.c02oo.s02classe.s03lombriga;

public class Animacao {
    String sequencia;
    int AA, LL, PP;
    int n;
    int indProxPasso;
    AquarioLombriga aquarioLombriga;

    Animacao (String sequencia) {
        this.sequencia = sequencia;
        AA = Character.getNumericValue(sequencia.charAt(0)) + Character.getNumericValue(sequencia.charAt(1));
        LL = Character.getNumericValue(sequencia.charAt(2)) + Character.getNumericValue(sequencia.charAt(3));
        PP = Character.getNumericValue(sequencia.charAt(4)) + Character.getNumericValue(sequencia.charAt(5));
        indProxPasso = 6;
        n = sequencia.length() - 6;
        aquarioLombriga = new AquarioLombriga(AA, LL, PP);
    }

    String apresenta() {
        return aquarioLombriga.apresenta();
    }

    void passo() {
        if (sequencia.charAt(indProxPasso) == 'C')
            aquarioLombriga.crescer();
        else if (sequencia.charAt(indProxPasso) == 'M')
            aquarioLombriga.mover();
        else
            aquarioLombriga.virar();
        indProxPasso++;
    }
}