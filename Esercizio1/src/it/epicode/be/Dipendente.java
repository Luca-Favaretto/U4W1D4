package it.epicode.be;

public class Dipendente {
    private static double stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;

    private Dipartimento dipartimento;


    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = Dipendente.stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }

    public static double getStipendioBase() {
        return stipendioBase;
    }

    public static double calcolaPaga(Dipendente dipendente) {
        return dipendente.getStipendio();
    }

    public static double calcolaPaga(Dipendente dipendente, double ore) {
        return dipendente.getStipendio() + (ore * dipendente.getImportoOrarioStraordinario());
    }


    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Livello getLivello() {
        return livello;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void stampaDatiDipendente() {
        System.out.printf("Dipendente " +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                "%n");
    }

    public void promuovi() {
        switch (this.livello) {
            case OPERAIO -> {
                this.livello = Livello.IMPIEGATO;
                this.stipendio = stipendioBase * Livello.IMPIEGATO.getValore();
                break;
            }
            case IMPIEGATO -> {
                this.livello = Livello.QUADRO;
                this.stipendio = stipendioBase * Livello.QUADRO.getValore();
                break;
            }
            case QUADRO -> {
                this.livello = Livello.DIRIGENTE;
                this.stipendio = stipendioBase * Livello.DIRIGENTE.getValore();
                break;
            }
            default -> {
                System.out.println("Sei già dirigente");
                break;
            }

        }


    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }
}
