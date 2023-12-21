import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
public class Employe extends Personne {


//    instances
    private static int nombreTotalEmployes = 0;
    private double salaire;
    private String poste;
    private static final double SALAIRE_MINIMUM = 30000.0;
    private static final int LONGUEUR_MAX_NOM = 50;


    //    constructeur
    public Employe(String nom, Date dateNaissance, double taille, double salaire, String poste) {
        super(nom, dateNaissance, taille);
        this.salaire = Math.random() * (5000 - 1000) + 1000;
        this.poste = poste;
        nombreTotalEmployes++;
    }
    public String getNom() {
        return this.nom;
    }


//    methode
    @Override
    public void afficherElements() {
        super.afficherElements();
        System.out.println("Salaire: " + salaire);
        System.out.println("Poste: " + poste);
    }
    public static int NombreTotalEmployes() {
        return nombreTotalEmployes;
    }
    private static String genererNom() {
        String caracteresPermis = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder nom = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(caracteresPermis.length());
            nom.append(caracteresPermis.charAt(index));
        }
        if (nom.length() > LONGUEUR_MAX_NOM) {
            nom.setLength(LONGUEUR_MAX_NOM);
        }
        return nom.toString();
    }

//    methode de surcharge
    public void employeDetails(String nom, double salaire) {
    this.nom = nom;
    this.salaire = salaire;
    }
    public void employeDetails(String nom, Date dateNaissance, String poste) {
        this.nom = nom;
        this.dateNaiss = dateNaissance;
        this.poste = poste;
    }


//tostriing
public String toString() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    return "Employe [Nom: " + nom + ", Date de naissance: " + dateFormat.format(dateNaiss) +
            ", Taille: " + taille + ", Salaire: " + salaire + ", Poste: " + poste + "]";
}
}
