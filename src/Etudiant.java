import java.util.ArrayList;

public class Etudiant extends Personne {
    private ArrayList<String> listCours;

    public Etudiant(String email, String age, String prenom, String nom,ArrayList<String> listCours) {
        super(email, age, prenom, nom);
        this.listCours = listCours;
    }

    public void AjouterCours(String c){
        listCours.add(c);
    }


    @Override
    public String getRole() {
        String affCours ="Etudiant inscrit aux cours de : ";
        for (int i =0; i<listCours.size();i++) {
            affCours += listCours.get(i) + ",";
        }
        return affCours;
    }

}
