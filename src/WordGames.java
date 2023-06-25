import java.util.Scanner;

/**
 * Autore : Salvatore D'anna
 * Questa è la classe principale dell'esercizio che ho chiamato WordGames
 * la classe permette all'utente di inserire dei dati che verranno poi stampati in console seguiti da dei comandi già
 * preimpostati.
 *
 */
public class WordGames {
    Scanner scanner = new Scanner(System.in);

    /**
     * Il metodo seguente è stato chiamato "addHelloWord", con questo metodo si riceve prima un messaggio che ci invita
     * a inserire del testo, dopodichè stamperà in console il testo da noi inserito preceduto da "Hello".
     */

    void addHelloWord() {
        System.out.println("Just type something");
        String word = scanner.nextLine();
        System.out.println("Hello " + word);

    }

    /**
     * Questo secondo metodo si chiama "getFullName" e ci chiede inizialmente di inserire un nome, seguito poi da un cognome
     * infine stamperà la concatenazione delle due stringhe preceduto da un testo che indica l'interezza del nome completo.
     */
    void getFullName() {
        System.out.println("Type name  ");
        String name = scanner.nextLine();
        System.out.println("\n Type your surname: ");
        String surname = scanner.nextLine();
        System.out.println("Full name is " + name + " " + surname);


    }
}
