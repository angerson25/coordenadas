package ejecutable;

import modelo.Coordenada;

public class Test
{
    public static void main(String[] args)
    {
        Coordenada c1 = new Coordenada(0.5, 3);
        Coordenada c2 = new Coordenada(2.6, 2);

        System.out.println("Coordena" + c1);
        System.out.println("Coordena" + c2);

        if (c1.equals(c2))
        {
        System.out.println("\nSon iguales");
        }
        else
        {
            System.out.println("\nSon diferentes");
        }

        System.out.println("\nLa distancia entre las coordenadas " +c1+" y " +c2 + " es de: " + c1.calcularDistancia(c2));
    }
}