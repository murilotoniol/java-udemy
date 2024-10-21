package entities;

public class Student {
    public String name;
    public double n1, n2, n3;

    public double notaFinal(){
        return n1+n2+n3;
    }

    public double missingPoints(){
        if (notaFinal() < 60){
            return 60 - notaFinal();
        }else{
            return 0.0;
        }
    }
}
