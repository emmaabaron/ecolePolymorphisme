public abstract class Employes extends Personne{
    protected int Salaire;

    public Employes(String email, String age, String prenom, String nom, int salaire) {
        super(email, age, prenom, nom);
        Salaire = salaire;
    }
}
