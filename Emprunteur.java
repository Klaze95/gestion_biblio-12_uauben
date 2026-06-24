
public class Emprunteur {
    private String nom;
    private String prenom;
    private String numeroAdherant;

    public Emprunteur(String nom, String prenom, String numeroAdherant) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroAdherant = numeroAdherant;
    }

    // Getters 
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getNumeroAdherant() {
        return numeroAdherant;
    }
    //Annotation
    @Override
    public String toString() {
        return "Emprunteur{" +
                "nom='" + nom + "', prenom='" + prenom + "', numeroAdherant='" + numeroAdherant + "'}";
    }
}
   

