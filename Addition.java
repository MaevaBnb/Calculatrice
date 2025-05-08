public class Addition extends Operation
{
    public Addition(Expression valeur1, Expression valeur2)
    {
        super(valeur1, valeur2);
    }

    public int valeur()
    {
        //Appel recursif sur les opérandes
        return getOperande1().valeur() + getOperande2().valeur();
    }

    public String toString()
    {
        return "(" + operande1 + "+" + operande2 + ")";
    }
}