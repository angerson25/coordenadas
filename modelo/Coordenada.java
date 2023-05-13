package modelo;

public class Coordenada
{
    private double x;
    private double y;

    public Coordenada() 
    {
        
    }

    public Coordenada(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }

    public double getX() 
    {
        return x;
    }

    public void setX(double x) 
    {
        this.x = x;
    }

    public double getY() 
    {
        return y;
    }

    public void setY(double y) 
    {
        this.y = y;
    }

    //metodo tostring
    public String toString() 
    {
        return "(" + x + "," + y + ")";
    }

    //metodo equals
    public boolean equals(Object d) 
    {
        Coordenada c = (Coordenada) d;
        return (x == c.getX()) && (y == c.getY());
    }

    //metodo para calcular la distancia entre dos puntos
    public double calcularDistancia(Coordenada c) 
    {
        double distanciaX = x - c.getX();
        double distanciaY = y - c.getY();
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }

}
