public class Nombre
{
    //Declaration pour stocker la valeur du nombre
    public int valeurNombre;

    //Constructeur qui initialise valeurNombre avec la valeur donnée
    public Nombre(int nombre)
    {
        this.valeurNombre = nombre;
    }

    //Methode qui retourne la valeur du nombre
    public int valeur()
    {
        return this.valeurNombre;
    }

    //Affiche la valeur du nombre sous forme de chaine de caractères
    public String toString ()
    {
       return "" + this.valeurNombre;
    }
}
