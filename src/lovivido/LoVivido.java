/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

//aqui hacemos el calculo del mes, dia y hora
    
public static int calculoMes(int anho){
        return (anho * 12);
    }
    public static int calculoDia(int anho){
        return (anho * 365);
    }
     public static int calculoHora(int dia){
        return (dia * 24);
    }


n = JOptionPane.showInputDialog ("Escriba su nombre: ");
e = JOptionPane.showInputDialog ("Escriba su edad: ");
 
a = Integer.parseInt (e);
 

 
 JOptionPane.showMessageDialog(null,  "Meses: "  +m,"Numero de meses vividos de " +n,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Días: " +d,"Numero de días vividos de "+n,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Horas: " +h,"Numero de horas vividos de "+n,JOptionPane.INFORMATION_MESSAGE);

   System.exit (0);

}
   

}
