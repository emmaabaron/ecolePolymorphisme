import java.util.ArrayList;

public class Etudiant extends Personne {
    private ArrayList<String> cours;

    public Etudiant(String email, String age, String prenom, String nom) {
        super(email, age, prenom, nom);
        this.cours = new ArrayList<String> (cours);
    }
    @Override
    public String getRole() {
        return "";
    }
}
