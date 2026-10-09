package calculadora;

import javax.swing.*;

public class polar {
    float r1, r2;
    float angulo1,angulo2, angulof;
    float distancia;
    double cosresultado;
    double radianes;
    float z1,z2;

    public float pedirr1(){
        r1= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de r1 ")));
        return r1;
    }
    public float pedirr2(){
        r2= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de r2 ")));
        return r2;
    }
    public float Pedirangulo1(){
        angulo1= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor del angulo 1 ")));
        return angulo1;
    }
    public float Pedirangulo2(){
        angulo2= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de angulo 2 ")));
        return angulo2;
    }
    public float distanciapolar(float r1, float r2, float angulo1, float angulo2){
        angulof=angulo1-angulo2;
        radianes= Math.toRadians(angulof);
        cosresultado=Math.cos(radianes);
        distancia= (float) ((r1)*(r1)+(r2)*(r2)-2*(r1)*(r2)*cosresultado);
        distancia= (float) Math.sqrt(distancia);
        return distancia;

    }
    public float pedirz1(){
        z1= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de z1 ")));
        return z1;
    }
    public float pedirz2(){
        z2= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de z2 ")));
        return z2;
    }
    public float distanciaCilindricca(float r1, float r2, float angulo1, float angulo2, float z1, float z2){
        angulof=angulo1-angulo2;
        radianes= Math.toRadians(angulof);
        cosresultado=Math.cos(radianes);
        distancia=(float) ((r1)*(r1)+(r2)*(r2)-2*(r1)*(r2)*cosresultado + (z2-z1)*(z2-z1));
        distancia= (float) Math.sqrt(distancia);
        return distancia;
    }
}
