import java.util.ArrayList;

public class Cours {
    protected String nom;
    protected int volumeHoraire;
    private ArrayList<String> competences;
    protected Professeur professeur;

    public Cours(String nom, int volumeHoraire, ArrayList<String> competences) {
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
        this.competences = competences;
    }

    public void definirEnseignant(){

    }
}
