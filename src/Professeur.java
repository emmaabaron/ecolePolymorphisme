import java.util.ArrayList;

public class Professeur extends  Employes{
    private ArrayList<String>matieres;

    public Professeur(String email, String age, String prenom, String nom, int salaire) {
        super(email, age, prenom, nom, salaire);
        this.matieres = new ArrayList<String> (matieres);
    }

    @Override
    public String getRole() {
        return "";
    }
}
