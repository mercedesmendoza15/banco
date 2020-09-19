/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg;

import java.util.Scanner;

/**
 *
 * @author Mercedes Mendoza
 */

/*
  Adolfo Emanuel Zepeda Medina 2000135
  Maria Mercedes Mendoza Gomez 2000086
*/
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona per1 = new Persona();
        per1.setCuenta(1);
        per1.setNombre("Emanuel");
        per1.setMonto(1000);
        
        Persona per2 = new Persona();
        per2.setCuenta(2);
        per2.setNombre("Mercedes");
        per2.setMonto(800);
        
        Persona per3 = new Persona();
        per3.setCuenta(3);
        per3.setNombre("Eliana");
        per3.setMonto(1500);
        
        String operacion;
        Double monto;
        int cuenta;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido, ingrese el número de cuenta");
        //cuenta = sc.nextInt();
        cuenta = sc.nextInt();
        
        switch(cuenta){
            case 1:
                operaciones(per1);
                System.out.println("Saldos Clientes");
                System.out.println(per1.getNombre() + " " + per1.getMonto());
                System.out.println(per2.getNombre() + " " + per2.getMonto());
                System.out.println(per3.getNombre() + " " + per3.getMonto());
                break;
            
            case 2:
                operaciones(per2);
                break;
                
            case 3:
               operaciones(per3);
                break;
            default:
                System.out.println("cuenta no registrada");
                System.exit(0);
        
        }
        
        
    }
    
    
    
    private static void operaciones( Persona persona){
       Scanner sc = new Scanner(System.in);
        String operacion;
        Double monto;
        
         System.out.println("Bienvenido " + persona.getNombre());
                System.out.println("Ingrese la operación a realizar");
                System.out.println("A-Depositar");
                System.out.println("B-Retirar");
                System.out.println("C-Saldo");
                operacion = sc.next();
                
                switch(operacion){
                    case "A":
                        System.out.println("Ingrese el monto a depositar");
                        monto = sc.nextDouble();
                        persona.setMonto(persona.getMonto() + monto);
                        System.out.println("El monto final es " + persona.getMonto());
                        
                        break;
                    case "B":
                        System.out.println("Ingrese el monto a retirar");
                        monto = sc.nextDouble();
                        persona.setMonto(persona.getMonto() - monto);
                        System.out.println("El monto final es " + persona.getMonto());
                        break;
                    case "C":
                        System.out.println("El monto final es " + persona.getMonto());
                        break;
                    default:
                        System.out.println("opción no encontrada");
                        System.exit(0);
                }
                
            
    
    }
    
}

    
    

