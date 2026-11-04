//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Etudiant e1 = new Etudiant("baronemma@gmail.com","22","Emma","Baron");
    Etudiant e2 = new Etudiant("mathildebaron@gmail.com","18","Mathilde","Baron");
    Etudiant e3 = new Etudiant("bastidebenjamin@gmail.com","21","Benjamin","Bastide");

    Professeur p1 = new Professeur("chaubaudmartin@gmail.com","45","Martin","Chabaud",1800);

    Administratif a1 = new Administratif("nicolasetienne@gmail.com","46","Nicolas","Etienne",2000);

    Ecole ecole1 = new Ecole();
    ecole1.ajouterPersonne(e1);
    ecole1.ajouterPersonne(e2);
    ecole1.ajouterPersonne(e3);
    ecole1.ajouterPersonne(p1);
    ecole1.ajouterPersonne(a1);

}
