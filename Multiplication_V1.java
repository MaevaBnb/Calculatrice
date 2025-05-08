public class Multiplication extends Operation
{
    //Constructeur pour initialiser les opérandes
    public Multiplication(Nombre valeur1, Nombre valeur2)
    {
        super(valeur1, valeur2); //Appelle le constructeur de la classe parente
    }

    //Implémentation de la méthode abstraite valeur
    public int valeur()
    {
        return operande1.valeur() * operande2.valeur();
    }

    //Implémentation de la méthode abstraite toString
    public String toString()
    {
        return "(" + operande1 + "*" + operande2 + ")";
    }
}
