
public class Livre {
    private String titre;
    private String auteur;
    private String isbn;

    public Livre(String titre, String auteur, String isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
    }

    // Getters 
    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public String getIsbn() {   
        return isbn;
    }
    //Annotation
    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + "', auteur='" + auteur + "', isbn='" + isbn + "'}";
    }
}
