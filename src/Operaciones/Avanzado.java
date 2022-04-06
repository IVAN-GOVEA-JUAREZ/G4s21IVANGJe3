/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author SpaceWolf
 */
public class Avanzado {
    public double potencia(int base, int elevacion){
        return Math.pow(base, elevacion);
    }
    public double rcuadrada(int base){
        return Math.sqrt(base);
    }
    public double rcubica(int base){
        return Math.cbrt(base);
    }
    public double factorial(int num){ 
        long fact = 1;
        for(int i = 2; i <= num; i++){
            fact = fact * i;
        }
        return(fact);    
    }
    public double logaritmo(int num){
        return Math.log10(num);
    }
}
