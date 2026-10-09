package calculadora;

import javax.swing.*;

public class calculadora {
    public static void main(String[] args) {
        String option;
        String dimension="h";
        String sistema , sistemaAtransformar;
        float distancia;
        float x1,x2,y1,y2;
        float z1,z2;
        float r1,r2,angulo1,angulo2;
        float rho,phi;
        float phi1,phi2;
        float rho1,rho2;
       rectangular objeto=new rectangular();
       polar objeto2=new polar();
       Transformaciones objeto3=new Transformaciones();
       esferico objeto4=new esferico();
        sistema=(String) JOptionPane.showInputDialog(null, "Indique su sistema de coordenadas actual", "Seleccione una opcion",JOptionPane.QUESTION_MESSAGE,null, new Object[]{"1) Sistema de coordenadas rectangulares", "2) Sistema de coordenadas polares", "3) Sistema de coordenadas cilindrico", "4) Sistema de coordenadas esferico"}, "selccionar");
        switch(sistema){
            case "1) Sistema de coordenadas rectangulares":
                dimension = (String) JOptionPane.showInputDialog(null, "¿En que dimension desea trabajar?", "Seleccione una opcion",JOptionPane.QUESTION_MESSAGE,null, new Object[]{"1) Una dimension", "2) Dos dimensiones", "3) Tres dimensiones"}, "selccionar");
            break;
            case "2) Sistema de coordenadas polares":
                dimension="2) Dos dimensiones";
                break;
            case "3) Sistema de coordenadas cilindrico":
                dimension="3) Tres dimensiones";
                break;
            case "4) Sistema de coordenadas esferico":
                dimension="3) Tres dimensiones";
                break;
        }
          option= (String) JOptionPane.showInputDialog(null, "¿Que desea realizar?", "Seleccione una opcion",JOptionPane.QUESTION_MESSAGE,null, new Object[]{"1) Calcular distancia entre dos puntos", "2) Convertir a otro sistema de coordenadas"}, "selccionar");
        switch(option){
            case "1) Calcular distancia entre dos puntos":
               if (sistema == "1) Sistema de coordenadas rectangulares"){
                      if (dimension == "1) Una dimension"){
                       x1=  objeto.pedirx1();
                       x2= objeto.pedirx2();
                     distancia=  objeto.dist1dim(x1,x2);
                          JOptionPane.showMessageDialog(null,"La distancia es igual a: " + distancia);
                      }
                    if(dimension == "2) Dos dimensiones"){
                        x1= objeto.pedirx1();
                        x2= objeto.pedirx2();
                        y1= objeto.pediry1();
                        y2= objeto.pediry2();
                        distancia=  objeto.dist2dim(x1,x2,y1,y2);
                        JOptionPane.showMessageDialog(null,"La distancia es igual a: " + distancia);

                      }
                      if(dimension == "3) Tres dimensiones"){
                          x1= objeto.pedirx1();
                          x2= objeto.pedirx2();
                          y1= objeto.pediry1();
                          y2= objeto.pediry2();
                          z1= objeto.pedirz1();
                          z2= objeto.pedirz2();
                          distancia= objeto.dist3dim(x1,x2,y1,y2,z1,z2);
                          JOptionPane.showMessageDialog(null,"La distancia es igual a: " + distancia);

                     }
                  }
               if (sistema== "2) Sistema de coordenadas polares"){
                   r1= objeto2.pedirr1();
                   r2=objeto2.pedirr2();
                   angulo1= objeto2.Pedirangulo1();
                   angulo2= objeto2.Pedirangulo2();
                   distancia= objeto2.distanciapolar(r1,r2,angulo1,angulo2);
                   JOptionPane.showMessageDialog(null,"La distancia es igual a: " + distancia);

               }
               if (sistema== "3) Sistema de coordenadas cilindrico"){
                   r1= objeto2.pedirr1();
                   r2= objeto2.pedirr2();
                   angulo1= objeto2.Pedirangulo1();
                   angulo2= objeto2.Pedirangulo2();
                   z1= objeto2.pedirz1();
                   z2= objeto2.pedirz2();
                   distancia=objeto2.distanciaCilindricca(r1,r2,angulo1, angulo2,z1,z2);
                   JOptionPane.showMessageDialog(null,"La distancia es igual a: " + distancia);

               }
               if (sistema == "4) Sistema de coordenadas esferico"){
                   rho1= objeto4.pedirRho1();
                   rho2= objeto4.pedirRho2();
                   angulo1= objeto2.Pedirangulo1();
                   angulo2= objeto2.Pedirangulo2();
                   phi1= objeto4.pedirPhi1();
                   phi2= objeto4.pedirPhi2();
                   distancia=objeto4.distEsferica(rho1,rho2,angulo1,angulo2,phi1,phi2);
                   JOptionPane.showMessageDialog(null,"La distancia es igual a: " + distancia);

               }
                 break;
               case "2) Convertir a otro sistema de coordenadas":
                   if(sistema == "1) Sistema de coordenadas rectangulares") {
                       if (dimension == "1) Una dimension") {
                           JOptionPane.showMessageDialog(null, "No puedes transformar a otro sistema de coordenadas");
                       }
                       if (dimension == "2) Dos dimensiones") {
                           JOptionPane.showMessageDialog(null, "Se transformara a sistema de coordenadas polar");
                           x1 = objeto3.pedirx();
                           y1 = objeto3.pediry();
                           r1 = objeto3.transfaR(x1, y1);
                           angulo1 = objeto3.transfaAngulo(x1, y1);
                           JOptionPane.showMessageDialog(null, "La coordenada " + "(" + x1 + "," + y1 + ")" + " En sistema polar es igual a: " + "(" + r1 + "," + angulo1 + "°" + ")");

                       }
                       if (dimension == "3) Tres dimensiones") {
                           sistemaAtransformar = (String) JOptionPane.showInputDialog(null, "¿A que sistema desea transformarlo?", "Seleccione una opcion", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"1) Sistema de coordenadas cilindrico", "2) Sistema de coordenadas esferico"}, "Seleccionar");
                           if (sistemaAtransformar == "1) Sistema de coordenadas cilindrico") {
                               x1 = objeto3.pedirx();
                               y1 = objeto3.pediry();
                               z1 = objeto3.pedirz();
                               r1 = objeto3.transfaR(x1, y1);
                               angulo1 = objeto3.transfaAngulo(x1, y1);
                               JOptionPane.showMessageDialog(null, "La coordenada " + "(" + x1 + "," + y1 + "," + z1 + ")" + " En sistema cilindrico es igual a: " + "(" + r1 + "," + angulo1 + "°" + "," + z1 + ")");


                           }
                           if (sistemaAtransformar == "2) Sistema de coordenadas esferico") {

                               x1= objeto3.pedirx();
                               y1= objeto3.pediry();
                               z1= objeto3.pedirz();
                               rho=objeto3.TransfaRho(x1,y1,z1);
                               angulo1=objeto3.transfaAngulo(x1,y1);
                               phi= objeto3.transfaphi(x1,y1,z1);
                               JOptionPane.showMessageDialog(null, "La coordenada " + "(" + x1 + "," + y1 + "," + z1 + ")" + " En sistema esferico es igual a: " + "(" + rho + "," + angulo1 + "°" + "," + phi + "°"+")");

                           }
                       }
                   }
                   if (sistema == "2) Sistema de coordenadas polares") {
                       JOptionPane.showMessageDialog(null, "Se convertira a Sistema de coordenadas rectangulares");
                       r1 = objeto3.pedirR();
                       angulo1 = objeto3.pedirAngulo();
                       x1= objeto3.TransfaX(r1,angulo1);
                       y1= objeto3.TransfaY(r1,angulo1);
                       JOptionPane.showMessageDialog(null, "La coordenada " + "(" + r1 + "," + angulo1 + "°" + ")" + " En sistema de coordenadas rectangular es igual a: " + "(" + x1 + "," + y1 + ")");

                       }

                   if (sistema == "3) Sistema de coordenadas cilindrico"){
                       sistemaAtransformar = (String) JOptionPane.showInputDialog(null, "¿A que sistema desea transformarlo?", "Seleccione una opcion", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"1) Sistema de coordenadas rectangulares", "2) Sistema de coordenadas esferico"}, "Seleccionar");
                       if (sistemaAtransformar == "1) Sistema de coordenadas rectangulares"){
                       r1= objeto3.pedirR();
                       angulo1= objeto3.pedirAngulo();
                       z1= objeto3.pedirz();
                       x1= objeto3.TransfaX(r1,angulo1);
                       y1= objeto3.TransfaY(r1,angulo1);
                       JOptionPane.showMessageDialog(null, "La coordenada " + "(" + r1 + "," + angulo1 + "°" + z1 +")" + " En sistema de coordenadas rectangular es igual a: " + "(" + x1 + "," + y1 + "," + z1 +")");
                       }
                       if (sistemaAtransformar == "2) Sistema de coordenadas esferico"){
                           r1= objeto3.pedirR();
                           angulo1= objeto3.pedirAngulo();
                           z1= objeto3.pedirz();
                           rho= objeto3.TransaRhodecil(r1,z1);
                           phi=objeto3.TransaPhidecil(r1,z1);
                           JOptionPane.showMessageDialog(null, "La coordenada " + "(" + r1 + "," + angulo1 + "°" + "," + z1 +")" + " En sistema de coordenadas esferico es igual a: " + "(" + rho  + "," + angulo1 + "°" + "," + phi + "°"+")");


                       }
                   }

                   if (sistema == "4) Sistema de coordenadas esferico") {
                       sistemaAtransformar = (String) JOptionPane.showInputDialog(null, "¿A que sistema desea transformarlo?", "Seleccione una opcion", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"1) Sistema de coordenadas rectangulares", "2) Sistema de coordenadas cilindrico"}, "Seleccionar");
                       if (sistemaAtransformar== "1) Sistema de coordenadas rectangulares") {
                           rho = objeto3.pedirrho();
                           angulo1 = objeto3.pedirAngulo();
                           phi = objeto3.pedirphi();
                           x1 = objeto3.TransfaXdecil(rho, phi, angulo1);
                           y1 = objeto3.TransfaYdecil(rho, phi, angulo1);
                           z1 = objeto3.TransfaZdecil(rho, phi);
                           JOptionPane.showMessageDialog(null, "La coordenada " + "(" + rho + "," + angulo1 + "°" + "," + phi + "°)" + " en sistema rectangular es igual a " + "(" + x1 + "," + y1 + "," + z1 + ")");
                       }
                       if (sistemaAtransformar == "2) Sistema de coordenadas cilindrico"){
                           rho = objeto3.pedirrho();
                           angulo1= objeto3.pedirAngulo();
                           phi = objeto3.pedirphi();
                           r1=objeto3.TransaRdeesf(rho, phi);
                           z1=objeto3.TransaZdeesf(rho,phi);
                           JOptionPane.showMessageDialog(null, "La coordenada " + "(" + rho  + "," + angulo1 + "°" + "," + phi + "°"+")" + " En sistema de coordenadas cilindrico es igual a: " +  "(" + r1 + "," + angulo1 + "°" + "," + z1 +")");



                       }
                   }



                    break;

         }

    }
}
