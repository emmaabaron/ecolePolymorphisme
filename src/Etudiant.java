import java.util.ArrayList;

public class Etudiant extends Personne {
    private ArrayList<String> listCours;

    public Etudiant(String email, String age, String prenom, String nom) {
        super(email, age, prenom, nom);
        this.listCours = new ArrayList<String> (listCours);
    }


    public void AjouterCours(String c){
        listCours.add(c);
    }

    public String  AfficherCours(){
        System.out.println("Etudiant inscrit aux cours de : ");
        for (String c : listCours){
            System.out.println(c);
        }
        return "";
    }

    @Override
    public String getRole() {
        return AfficherCours();
    }
}
