public class Main {
    public static void main(String[] args)
    {
        //Bloc pour gérer les exceptions
        try
        {
            //Creation de plusieurs objets Nombre
            Nombre six = new Nombre(6);
            Nombre dix = new Nombre(10);
            Nombre zero = new Nombre(0);

            //Création de plusieurs opérations entre deux nombres
            Operation a = new Addition(dix, six);
            System.out.println(a + "=" + a.valeur());

            Operation s = new Soustraction(dix, six);
            System.out.println(s + "=" + s.valeur());

            Operation m = new Multiplication(dix, six);
            System.out.println(m + "=" + m.valeur());

            Operation d = new Division(dix, six);
            System.out.println(d + "=" + d.valeur());

            //Tentative de division par zéro, qui provoque une exception
            Operation d2 = new Division(dix, zero);
            System.out.println(d2 + "=" + d2.valeur());
            System.out.println(d2 + "=" + d2.valeur());
        }

        //Capture de l'exception liée à la division par zéro
        catch (ArithmeticException e)
        {
            //Affiche l'erreur
            System.out.println("Erreur : " + e);
        }
    }
}