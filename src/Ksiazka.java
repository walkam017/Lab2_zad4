public class Ksiazka {public class Ksiazka {
    // Cechy książki
    private String tytul;
    private String autor;
    private int rokWydania;
    private int liczbaStron;
    private boolean czyWypozyczona;

    // Konstruktor
    public Ksiazka(String tytul, String autor, int rokWydania, int liczbaStron, boolean czyWypozyczona) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.liczbaStron = liczbaStron;
        this.czyWypozyczona = czyWypozyczona;
    }

    // Gettery i settery dla cech książki
    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public boolean isCzyWypozyczona() {
        return czyWypozyczona;
    }

    public void setCzyWypozyczona(boolean czyWypozyczona) {
        this.czyWypozyczona = czyWypozyczona;
    }

    // Metoda do wypożyczenia książki
    public void wypozyczKsiazke() {
        if (!czyWypozyczona) {
            czyWypozyczona = true;
            System.out.println("Książka została wypożyczona.");
        } else {
            System.out.println("Książka jest już wypożyczona.");
        }
    }

    // Metoda do oddania książki
    public void oddajKsiazke() {
        if (czyWypozyczona) {
            czyWypozyczona = false;
            System.out.println("Książka została oddana.");
        } else {
            System.out.println("Książka jest już zwrócona.");
        }
    }

    // Metoda do wyświetlania informacji o książce
    public void wyswietlInfo() {
        System.out.println("Tytuł: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Rok wydania: " + rokWydania);
        System.out.println("Liczba stron: " + liczbaStron);
        System.out.println("Czy wypożyczona: " + (czyWypozyczona ? "Tak" : "Nie"));
    }
}
}
