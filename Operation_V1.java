public abstract class Operation
{
    //Declaration pour stocker les opérandes
    Nombre operande1;
    Nombre operande2;

    //Methode abstraite qui sera redéfinie dans les sous-classes
    public abstract int valeur();

    //Constructeur qui initialise les opérandes
    public Operation(Nombre valeur1, Nombre valeur2)
    {
        this.operande1 = valeur1;
        this.operande2 = valeur2;
    }

    //Retourne la valeur de la premiere opérande
    public Nombre getOperande1()
    {
        return this.operande1;
    }

    //Retourne la valeur de la seconde opérande
    public Nombre getOperande2()
    {
        return this.operande2;
    }

    //Méthode abstraite qui sera redéfinie dans les sous-classes
    public abstract String toString ();
}
