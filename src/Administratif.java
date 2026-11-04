public class Administratif extends Employes {
    public Administratif(String email, String age, String prenom, String nom, int salaire) {
        super(email, age, prenom, nom, salaire);
    }
    public String getSalaire(){
        System.out.println(Salaire);
        return"";
    }

    @Override
    public String getRole() {
        return ("Personnel administratif, avec un salaire de "+getSalaire());
    }
}
