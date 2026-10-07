public class Administratif extends Employes {
    public Administratif(String email, String age, String prenom, String nom, int salaire) {
        super(email, age, prenom, nom, salaire);
    }

    @Override
    public String getRole() {
        return "";
    }
}
