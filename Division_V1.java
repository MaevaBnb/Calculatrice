public class Division extends Operation
{
    //Constructeur pour initialiser les opérandes
    public Division(Nombre valeur1, Nombre valeur2)
    {
        super(valeur1, valeur2); //Appelle le constructeur de la classe parente
    }

    //Implémentation de la méthode abstraite valeur
    public int valeur()
    {
        //Verifie si le diviseur est zero
        if (operande2.valeur() == 0)
        {
            //Lance une exception en cas d'erreur
            throw new ArithmeticException("Division par zéro interdite");
        }

        return operande1.valeur()/operande2.valeur(); //Retourne le résultat de la division
    }

    //Implémentation de la méthode abstraite toString
    public String toString()
    {
        return "(" + operande1 + "/" + operande2 + ")";
    }
}
