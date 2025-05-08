public class Division extends Operation
{
    public Division(Expression valeur1, Expression valeur2)
    {
        super(valeur1, valeur2);
    }

    public int valeur()
    {
        if (getOperande2().valeur() == 0)
        {
            throw new ArithmeticException("Division par zéro interdite");
        }

        return getOperande1().valeur()/getOperande2().valeur();
    }

    public String toString()
    {
        return "(" + operande1 + "/" + operande2 + ")";
    }
}
