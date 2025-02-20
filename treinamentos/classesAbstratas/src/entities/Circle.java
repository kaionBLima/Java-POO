package entities;

import enums.Colors;

public class Circle extends Shape{

    private double raio;

    public Circle() {
        super();
    }

    public Circle(Colors color, Double raio) {
        super(color);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

}
