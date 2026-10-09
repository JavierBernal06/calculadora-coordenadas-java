package calculadora;

import javax.swing.*;
import java.util.Scanner;

public class rectangular {
    Scanner sc = new Scanner(System.in);
    float distancia;
    float x1, x2;
    float y1, y2;
    float z1, z2;
    public float dist1dim(float x1, float x2) {
        distancia= x2-x1;
        return distancia;
    }
    public float pedirx1(){
        x1= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de x1 ")));
        return x1;
    }
    public float pedirx2(){
        x2= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de x2 ")));
        return x2;
    }
    public float pediry1(){
        y1= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de y1 ")));
        return y1;
    }
    public float pediry2(){
        y2= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de y2 ")));
        return y2;
    }
    public float dist2dim(float x1, float x2, float y1, float y2) {
        distancia=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);

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
   public float dist3dim(float x1, float x2,float y1, float y2,float z1, float z2) {
       distancia=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)+(z2-z1)*(z2-z1);
       distancia= (float) Math.sqrt(distancia);
       return distancia;
   }
}
