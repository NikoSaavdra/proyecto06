package es.santander.ascender.proyecto06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculadora {

   @Test
   public void testCalcular(){
        Calculadora calc = new Calculadora();

        calc.sumar(5, 5);
        int valor = calc.multiplicar(2);
        assertEquals(20, valor);

        calc.reset(valor);      
   }
        
           
    
        
            

    
    
           
    
    
            
    
            
        }
    
    


