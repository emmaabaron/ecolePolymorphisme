import java.util.ArrayList;

public class Professeur extends  Employes{
    private ArrayList<String>listMatiere;

    public Professeur(String email, String age, String prenom, String nom, int salaire,ArrayList<String> listMatiere) {
        super(email, age, prenom, nom, salaire);
        this.listMatiere = listMatiere;
    }

    public void AjouterMatiere(String m){
        listMatiere.add(m);
    }

    @Override
    public String getRole() {
        String affMat = "Enseigne en cours de : ";
        for (int i =0; i<listMatiere.size();i++) {
            affMat += listMatiere.get(i) + ",";
        }
        return (affMat+" son salaire est "+ getSalaire());
    }
}
