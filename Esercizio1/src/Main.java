import it.epicode.be.Dipartimento;
import it.epicode.be.Dipendente;
import it.epicode.be.Livello;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio1");
        Dipendente operaio1 = new Dipendente("matricola1", Dipartimento.PRODUZIONE);
        Dipendente operaio2 = new Dipendente("matricola2", Dipartimento.PRODUZIONE);
        Dipendente impiegato = new Dipendente("matricola3", 1200, 40, Livello.IMPIEGATO, Dipartimento.PRODUZIONE);
        Dipendente dirigente = new Dipendente("matricola4", 2000, 50, Livello.DIRIGENTE, Dipartimento.PRODUZIONE);
        operaio1.promuovi();
        Dipendente[] dipendenti = {operaio1, operaio2, impiegato, dirigente};
        sommaStipendi(dipendenti);


    }

    static void sommaStipendi(Dipendente[] d) {
        double somma = 0;
        for (Dipendente dipendente : d) {
            somma += Dipendente.calcolaPaga(dipendente, 5);
            dipendente.stampaDatiDipendente();

        }
        System.out.println("La somma di tutti gli stipendi è: " + somma);

    }
}