package calculadora;

import javax.swing.*;

public class Transformaciones {
    float x1,y1,z1,r1,angulo1,angulofinal,atan,radianes,rho,phi,angulofinal2,recipiente,radianes2;

    public float pedirx(){
        x1= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de x ")));
        return x1;
    }
    public float pediry() {
        y1 = Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de y ")));
        return y1;
    }

    public float transfaR(float x1,float y1){
        r1= (x1)*(x1) + (y1)*(y1);
        r1= (float) Math.sqrt(r1);
        return r1;
    }
    public float transfaAngulo(float x1,float y1){
        angulofinal= y1/x1;
        atan= (float) Math.atan(angulofinal);
        angulo1= (float) Math.toDegrees(atan);
        if (x1<0 && y1<0 || x1<0 && y1>0){
            angulo1=angulo1+180;
        }
        return angulo1;
    }
    public float pedirz(){
        z1= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de z ")));
        return z1;
    }
    public float pedirR(){
        r1= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de r ")));
        return r1;
    }
    public float pedirAngulo(){
        angulo1= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor del angulo ")));
        return angulo1;
    }
    public float TransfaX(float r1,float angulo1){
        radianes= (float) Math.toRadians(angulo1);
      angulofinal = (float) Math.cos(radianes);
        x1= r1*angulofinal;
        return x1;
    }
    public float TransfaY(float r1,float angulo1){
        radianes= (float) Math.toRadians(angulo1);
        angulofinal = (float) Math.sin(radianes);
        y1= r1*angulofinal;
        return y1;
    }
    public float pedirrho(){
        rho= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de ρ(rho) ")));
         return rho;
    }
    public float pedirphi(){
        phi= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de φ ")));
        return phi;
    }
    public float TransfaRho(float x1,float y1,float z1){
        rho= (x1)*(x1) + (y1)*(y1)+(z1)*(z1);
        rho= (float) Math.sqrt(rho);
        return rho;
    }
    public float transfaphi(float x1,float y1,float z1){
        angulo1= (x1)*(x1) + (y1)*(y1);
        angulo1=(float) Math.sqrt(angulo1);
        angulo1= angulo1/z1;
        atan= (float) Math.atan(angulo1);
        phi= (float) Math.toDegrees(atan);
        return phi;

    }
    public float TransfaXdecil(float rho,float phi,float angulo1){
        radianes= (float) Math.toRadians(phi);
        angulofinal = (float) Math.sin(radianes);
        recipiente= rho*angulofinal;
        radianes2=(float) Math.toRadians(angulo1);
        angulofinal2 = (float) Math.cos(radianes2);
        x1=recipiente*angulofinal2;
        return x1;
    }
    public float TransfaYdecil(float rho,float phi,float angulo1){
        radianes= (float) Math.toRadians(phi);
        angulofinal = (float) Math.sin(radianes);
        recipiente= rho*angulofinal;
        radianes2=(float) Math.toRadians(angulo1);
        angulofinal2 = (float) Math.sin(radianes2);
        y1=recipiente*angulofinal2;
        return y1;
    }
    public float TransfaZdecil(float rho,float phi){
        radianes= (float) Math.toRadians(phi);
        angulofinal = (float) Math.sin(radianes);
        z1= rho*angulofinal;
        return z1;
    }
    public float TransaRhodecil(float r1,float z1){
        rho=(r1)*(r1)+(z1)*(z1);
        rho=(float) Math.sqrt(rho);
        return rho;
    }
    public float TransaPhidecil(float r1,float z1){
        angulofinal= r1/z1;
        atan= (float) Math.atan(angulofinal);
        phi= (float) Math.toDegrees(atan);
       // if (x1<0 && y1<0 || x1<0 && y1>0){
           // phi=phi+180;
       // }
        return phi;
    }
    public float TransaRdeesf(float rho, float phi){
        radianes= (float) Math.toRadians(phi);
        r1=(float) Math.sin(radianes);
        r1=rho*r1;
        return r1;
    }
    public float TransaZdeesf(float rho,float phi){
        radianes= (float) Math.toRadians(phi);
        z1=(float) Math.cos(radianes);
        z1=rho*z1;
        return z1;
    }

}
