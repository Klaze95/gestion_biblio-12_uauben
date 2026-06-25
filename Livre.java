
public class Livre {
    private String titre;
    private String auteur;
    private String isbn;
    private boolean disponible;
// Rendre public mes attributs
    public Livre(String titre, String auteur, String isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = true; // par défaut un livre est disponible
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
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    // Méthode pour emprunter un livre
    public void emprunter() {
        if (disponible) {
            disponible = false;
        System.out.println("Le livre a été emprunté avec succès.");
        } else {
            System.out.println("Le livre n'est pas disponible pour l'emprunt.");
        }
    }
    //Annotation
    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + "', auteur='" + auteur + "', isbn='" + isbn + "'}";
    }
}
