public class Addition extends Operation
{
    //Constructeur pour initialiser les opérandes
    public Addition(Nombre valeur1, Nombre valeur2)
    {
        super(valeur1, valeur2); //Appelle le constructeur de la classe parente Operation
    }

    //Implémentation de la méthode abstraite valeur
    public int valeur()
    {
        return operande1.valeur() + operande2.valeur(); //Retourne la somme des valeurs
    }

    //Implémentation de la méthode abstraite toString
    public String toString()
    {
        return "(" + operande1 + "+" + operande2 + ")"; //Affiche la somme des valeurs
    }
}