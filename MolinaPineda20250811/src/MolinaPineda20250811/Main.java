/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MolinaPineda20250811;

/**
 *
 * @author emers
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    //Variables Globales 
    public static int horaenUnDia = 24;
    public static int segundosEnUnaHora =3600;
    public static int segundosEnMinutos= 60;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VARIABLES LOCALES
        int segundosTotales= 91111;
        
        int dias= calcularDias(segundosTotales);
        //SE ASIGNA EL VALOR DE LOS SEGUNDOS EXCEDENTES O RESTANTES DESPUES DE HABER 
        //CALCULADO LOS DÍAS
        int segundosRestantesDespuesDeExtraerDias = obtenersegundosRestantesDespuesDeExtraerDias (segundosTotales);
        //SE ASIGNA EL VALOR DE LAS HORAS A PARTIR DE LOS SEGUNDOS
        int horas = calcularHoras(segundosRestantesDespuesDeExtraerDias);
        int segundosRestantesDespuesDeExtraerHoras = obtenersegundosRestantesDespuesDeExtraerHoras(segundosRestantesDespuesDeExtraerDias);
        
        int minutos =calcularMinutos(segundosRestantesDespuesDeExtraerHoras);
        int segundosFinales = obtenerSegundosRestantesDespuesDeExtraerMinutos(segundosRestantesDespuesDeExtraerHoras);
        
        System.out.println("Usted ha solicitado los dias, horas, minutos y segundos a partir de un numero mayor a 86400");
        System.out.println("Usted ha indicado el valor actual de segundos como: " +segundosTotales);
        System.out.println("Dias: "+dias);
        System.out.println("Horas:" +horas);
        System.out.println("Minutos:"+minutos);
        System.out.println("Segundos:"+segundosFinales);




        
        
    }
    
    //MÓDULO PARA CALCULAR LA CANTIDAD DE DÍAS
    public static int calcularDias(int segundosTotales){
        return segundosTotales/(Main.horaenUnDia* Main.segundosEnUnaHora);
    }
    //MODULO PARA CALCAULAR LOS SEGUNDOS RESTANTES DESPUES DE EXTRAER LOS DÍAS
    public static int obtenersegundosRestantesDespuesDeExtraerDias(int segundosTotales){
        return segundosTotales % (Main.horaenUnDia * Main.segundosEnUnaHora);
    }
    //MODULO PARA CALCULAR LAS HORAS
    public static int calcularHoras(int segundosRestantes){
        return segundosRestantes/Main.segundosEnUnaHora;
    }
    
    //MODULO PARA CALCULAR LOS SEGUNDOS RESTANTES DESPUES DE EXTARER LAS HORAS
    public static int obtenersegundosRestantesDespuesDeExtraerHoras(int segundosRestantes){
        return segundosRestantes % Main.segundosEnUnaHora;
    }
    
    //MÓDULO PARA CALCULAR LA CANTIDAD DE MINUTOS A PARTIR DE LOS SEGUNDOS RESTANTES
    public static int calcularMinutos(int segundosRestantes){
        return segundosRestantes/Main.segundosEnMinutos;
    }
    
    //MÓDULO PARA CALCULAR LOS SEGUNDODS RESTANTES DE TODA LA OPERACIÓN
    public static int obtenerSegundosRestantesDespuesDeExtraerMinutos(int segundosRestantes){
        return segundosRestantes % Main.segundosEnMinutos;
    }
    
}
