import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne {


//    instances
    public String nom;
    public Date dateNaiss;
    public double taille;


//    constructeur
    public Personne(String nom, Date dateNaiss, double taille){
        this.nom = nom;
        this.dateNaiss = dateNaiss;
        this.taille = taille;
    }
    public void afficherElements() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nom: " + nom);
        System.out.println("Date de naissance: " + dateFormat.format(dateNaiss));
        System.out.println("Taille: " + taille);
    }


//    tostring
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Personne [Nom: " + nom + ", Date de naissance: " + dateFormat.format(dateNaiss) + ", Taille: " + taille + "]";
    }
}

