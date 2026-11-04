import java.util.ArrayList;

public class Ecole {
    private ArrayList<Personne> personne;

    public Ecole() {
       personne = new ArrayList<Personne>();
    }

    public void ajouterPersonne (Personne p){
        personne.add(p);
    }


}
