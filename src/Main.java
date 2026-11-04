//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ArrayList<String> cours = new ArrayList<>();
    cours.add("Java");
    cours.add("Php");
    cours.add("Python");

    Etudiant e1 = new Etudiant("baronemma@gmail.com","22 ans","Emma","Baron",cours);
    Etudiant e2 = new Etudiant("mathildebaron@gmail.com","18 ans","Mathilde","Baron",cours);
    Etudiant e3 = new Etudiant("bastidebenjamin@gmail.com","21 ans","Benjamin","Bastide",cours);

    Professeur p1 = new Professeur("chaubaudmartin@gmail.com","45 ans","Martin","Chabaud",1800,cours);

    Administratif a1 = new Administratif("nicolasetienne@gmail.com","46 ans","Nicolas","Etienne",2000);

    Ecole ecole1 = new Ecole();
    ecole1.ajouterPersonne(e1);
    ecole1.ajouterPersonne(e3);
    ecole1.ajouterPersonne(p1);
    ecole1.ajouterPersonne(a1);

    e1.printDesc();
    e2.printDesc();
    e3.printDesc();
    p1.printDesc();
    a1.printDesc();

}
