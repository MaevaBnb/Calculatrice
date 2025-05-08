public class Nombre extends Expression //La classe Nombre hérite d'Expression
{
    public int valeurNombre;

    public Nombre(int nombre)
    {
        this.valeurNombre = nombre;
    }

    //Implémentation de la méthode abstraite définie dans Expression
    public int valeur()
    {
        return this.valeurNombre;
    }

    public String toString ()
    {
       return "" + this.valeurNombre;
    }
}
