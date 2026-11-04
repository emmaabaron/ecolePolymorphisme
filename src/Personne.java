public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected String age;
    protected String email;

    public Personne(String email, String age, String prenom, String nom) {
        this.email = email;
        this.age = age;
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getBasDesc(){
        return (nom+", " +prenom +", "+age+ " ,"+email);
    }

    public void printDesc(){
        System.out.println(getBasDesc() + " - " + getRole());
    }
    public abstract String getRole();
}
