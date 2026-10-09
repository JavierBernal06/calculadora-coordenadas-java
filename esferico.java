package calculadora;

import javax.swing.*;

public class esferico {
    float rho1,rho2,phi1,phi2,radianes1,recipiente,sen1,sen2,recipiente2,angulof,cosresultado,radianes,radianes2,recipiente3,recipiente4,distancia;

    public float pedirRho1(){
        rho1= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de ρ1(rho) ")));
        return rho1;
    }
    public float pedirRho2(){
        rho2= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de ρ2(rho) ")));
        return rho2;
    }
    public float pedirPhi1(){
        phi1= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de φ1 ")));
        return phi1;
    }
    public float pedirPhi2(){
        phi2= Float.parseFloat((JOptionPane.showInputDialog("Ingrese el valor de φ2 ")));
        return phi2;
    }
    public float distEsferica(float rho1,float rho2,float angulo1,float angulo2,float phi1,float phi2){
        radianes1= (float) Math.toRadians(phi1);
        phi1= (float) Math.cos(radianes1);
        radianes2= (float) Math.toRadians(phi2);
        phi2= (float) Math.cos(radianes2);
        recipiente=phi1*phi2;
        sen1= (float) Math.sin(radianes1);
        sen2= (float) Math.sin(radianes2);
        angulof=angulo2-angulo1;
        radianes= (float) Math.toRadians(angulof);
        cosresultado= (float) Math.cos(radianes);
        recipiente2=sen1*sen2;
        recipiente2=recipiente2*cosresultado;
        recipiente2=recipiente+recipiente2;
        recipiente3=(rho1*rho1)+(rho2*rho2);
        recipiente4=2*rho1*rho2;
        recipiente4=recipiente4*recipiente2;
        recipiente3=recipiente3-recipiente4;
        distancia= (float) Math.sqrt(recipiente3);
        return distancia;

    }
}
