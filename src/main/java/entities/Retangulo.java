package entities;

public class Retangulo {
    public double width, height;

    public double area(){
        double area = (width * height);
        System.out.println("Area = " + area);
        return 0;
    }

    public double perimeter(){
        double perimeter = (width * 2) + (height * 2);
        System.out.println("Perimeter = " + perimeter);
        return 0;
    }

    public double diagonal(){
        double diagonal = (width + height - 2);
        System.out.println("Diagonal = " + diagonal);
        return 0;
    }
}
