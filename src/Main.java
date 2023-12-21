import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Employe> listeEmployes = new ArrayList<>();
        Date dateDeNaissance = new Date(90, 0, 1); // Exemple de date de naissance (année, mois, jour)
        // Utilisation du polymorphisme avec la classe de base
        Personne personne = new Personne("John Doe", dateDeNaissance, 1.75);
        personne.afficherElements();
        System.out.println("--------------");
        // Utilisation du polymorphisme avec la classe dérivée
        Employe employe = new Employe("Jane Smith", dateDeNaissance, 1.68, 50000.0, "Développeur");
//        Employe employe1 = new Employe("Jane Smith", dateDeNaissance, 1.68, 50000.0, "Développeur");
        employe.afficherElements();
//        employe1.afficherElements();
        System.out.println("Nombre total d'employés : " + Employe.NombreTotalEmployes());

        Employe employe1 = new Employe("Nom de l'employé", dateDeNaissance, 1.68, 50000.0, "Développeur");
        Employe employe2 = new Employe("Nom de l'employé", dateDeNaissance, 1.78, 40000.0, "codeur");
        Employe employe3 = new Employe("Nom de l'employé", dateDeNaissance, 1.88, 30000.0, "analyste");


        ajouterEmploye(listeEmployes, employe1);
        ajouterEmploye(listeEmployes, employe2);
        ajouterEmploye(listeEmployes, employe3);

        // Affichage de la collection avant le tri
        System.out.println("Liste des employés avant le tri :");
        afficherListeEmployes(listeEmployes);

        // Tri de la collection
        trierListeEmployes(listeEmployes);

        // Affichage de la collection après le tri
        System.out.println("\nListe des employés après le tri :");
        afficherListeEmployes(listeEmployes);

        // Suppression d'un employé de la collection
        supprimerEmploye(listeEmployes, employe2);

        // Affichage de la collection après la suppression
        System.out.println("\nListe des employés après la suppression :");
        afficherListeEmployes(listeEmployes);


        ajouterEmploye(listeEmployes, employe1);
        ajouterEmploye(listeEmployes, employe2);
        ajouterEmploye(listeEmployes, employe3);

        // Affichage de la collection avant le tri
        System.out.println("Liste des employés avant le tri :");
        afficherListeEmployes(listeEmployes);

        // Tri de la collection
        trierListeEmployes(listeEmployes);

        // Affichage de la collection après le tri
        System.out.println("\nListe des employés après le tri :");
        afficherListeEmployes(listeEmployes);

        // Suppression d'un employé de la collection
        supprimerEmploye(listeEmployes, employe2);

        // Affichage de la collection après la suppression
        System.out.println("\nListe des employés après la suppression :");
        afficherListeEmployes(listeEmployes);
    }
    private static void ajouterEmploye(List<Employe> liste, Employe employe) {
        liste.add(employe);
    }

    private static void supprimerEmploye(List<Employe> liste, Employe employe) {
        liste.remove(employe);
    }

    private static void trierListeEmployes(List<Employe> liste) {
        Collections.sort(liste, (emp1, emp2) -> emp1.getNom().compareTo(emp2.getNom()));
    }

    private static void afficherListeEmployes(List<Employe> liste) {
        for (Employe employe : liste) {
            System.out.println(employe.toString());
        }
    }
}



