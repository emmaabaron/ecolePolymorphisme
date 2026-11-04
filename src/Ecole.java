import java.util.ArrayList;

public class Ecole {
    private ArrayList<Personne> personne;

    public Ecole() {
       personne = new ArrayList<Personne>();
    }

    public void ajouterPersonne (Personne p){
        personne.add(p);
    }

    public void listerPersonne(){
        for (Personne p : personne){
            System.out.println("Nom :"+p.nom+" Prénom :"+p.prenom);
            p.printDesc();
        }
    }

}
