package exercicios;

public class Exercicio {
    public static void main(String[]args){
        String gameRPG = ("Hogwarts legancy");
        String gameIndie = ("Hollow knight");

        int  age = 35;
        int  code = 2368;
        char gender = 'M';

        double princeRPG = 107.80;
        double princeIndie = 46.99;
        double media ;

        System.out.println(gameRPG +",esta custando " + princeRPG);
        System.out.println(gameIndie + "esta custando " + princeIndie);
        System.out.println("O comprador tinha " + age + " anos," + " code" + code +" e genero" );
        System.out.println("Media de valor de " + (double)princeRPG + (double)princeIndie  /2);
        System.out.println("Media de valor arendodado:" + (int)age);
        System.out.printf("a media de valor no padrão americano:" + media);

    }
}
