import java.util.ArrayList;

public class Professeur extends  Employes{
    private ArrayList<String>listMatiere;

    public Professeur(String email, String age, String prenom, String nom, int salaire) {
        super(email, age, prenom, nom, salaire);
        this.listMatiere = new ArrayList<String> (listMatiere);
    }

    public void AjouterMatiere(String m){
        listMatiere.add(m);
    }
    public String AfficherMatiere(){
        System.out.println("Enseigne en cours de : ");
        for (String m :listMatiere){
            System.out.println(m);
        }
        return"";
    }
    public String getSalaire(){
        System.out.println(Salaire);
        return "";
    }

    @Override
    public String getRole() {
        return (AfficherMatiere()+", son salaire est "+ getSalaire());
    }
}
