package it.epicode.be;

public enum Livello {
    OPERAIO(1),
    IMPIEGATO(1.2),
    QUADRO(1.5),
    DIRIGENTE(2);

    private final double valore;

    Livello(double valore) {
        this.valore = valore;
    }

    public double getValore() {
        return valore;
    }

}
