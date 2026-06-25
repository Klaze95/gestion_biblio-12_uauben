
public class Livre {
    private String titre;
    private String auteur;
    private String isbn;
    private boolean disponible;
    private double penalite = 0; // La pénalité est initialisée à 0 par défaut
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
    // Emprunter un livre
    public void emprunter() {
        if (disponible) {
            if (penalite > 0) {
                System.out.println("Attention: penalité de retard de "+ penalite + "Francs CFA à regler avant l'emprunt");
                return;
            }
            disponible = false;
            System.out.println("Le livre a été emprunté avec succès.");
        }
        else {
            System.out.println("Le livre n'est pas disponible pour l'emprunt.");
        }
    }
    public void appliquerPenaliteRetard(int joursDeRetard){
        double tauxParJour = 500; // F CFA par jour de ratard
        this.penalite += joursDeRetard * tauxParJour;
    }
    //Annotation
    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + "', auteur='" + auteur + "', isbn='" + isbn + "'}";
    }
}
