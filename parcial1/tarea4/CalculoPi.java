//Programa 5
//Calcular Pi usando iteraciones y condiciones de error

import java.util.Scanner;
public class CalculoPi {

    public static void main(String[] args) {
        Iteracion i=new Iteracion();
    }
}

class Iteracion{
    private double n,areaQ,areaC,r,pi;

    public Iteracion(){
        System.out.println("Ingrese la longitud n del cuadrado: ");
        try (Scanner s = new Scanner(System.in)) {
            n=s.nextDouble();
        }
        areaQ=n*n;
        areaC=0;
        r=(n/2);

        calcular();
    }

    public void calcular(){
        for(double y=n/2;y>-n/2-1;y--){
            for (double x=-n/2;x<n/2+1;x++){

                if((x*x)+(y*y)<=r*r){
                    System.out.print("* ");
                    areaC+=1.0;
                }else
                    System.out.print("  ");
            }
            System.out.println();
        }
        pi=(areaC/areaQ)*4;
        System.out.println("area del cuadrado: "+areaQ+"\n area del circulo: "+areaC+"\n pi aproximado: "+pi);

    }
}