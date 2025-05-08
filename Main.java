public class Main {
    public static void main(String[] args)
    {
        try
        {
            /* Les objets sont maintenant de type Expression,
            permettant d'utiliser comme opérande soit un nombre, soit une opération */
            Expression deux = new Nombre(2);
            Expression trois = new Nombre(3);
            Expression dixSept = new Nombre(17);

            Expression a = new Addition(deux, trois);
            System.out.println(a + "=" + a.valeur());

            Expression s = new Soustraction(dixSept, deux);
            System.out.println(s + "=" + s.valeur());

            Expression m = new Multiplication(deux, trois);
            System.out.println(m + "=" + m.valeur());

            //Ici, les opérandes sont des opérations
            Expression d = new Division(s, a);
            System.out.println(d + "=" + d.valeur());
        }

        catch (ArithmeticException e)
        {
            System.out.println("Erreur : " + e);
        }
    }
}