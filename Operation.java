public abstract class Operation extends Expression //La classe Operation hérite d'Expression
{
    /* Les opérandes sont maintenant de type Expression,
    permettant d'y stocker aussi bien un nombre qu'une autre opération */
    Expression operande1;
    Expression operande2;

    public Operation(Expression valeur1, Expression valeur2)
    {
        this.operande1 = valeur1;
        this.operande2 = valeur2;
    }

    public Expression getOperande1()
    {
        return this.operande1;
    }

    public Expression getOperande2()
    {
        return this.operande2;
    }

    public abstract String toString();
}
