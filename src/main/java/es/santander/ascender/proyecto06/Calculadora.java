package es.santander.ascender.proyecto06;

public class Calculadora {

    private int resultado = 0;  

    public void sumar(int numeroUno, int numeroDos){
        resultado = numeroUno + numeroDos;
    }

    public int sumar(int numeroTres){
        resultado = getResultado() + numeroTres; 
        return resultado; 
    }
  
    public void restar(int numeroUno, int numeroDos){
        resultado = numeroUno - numeroDos;
    }
  
    public int restar(int numeroTres){
        resultado = getResultado() + numeroTres;  
        return resultado;
    }
 
    public void dividir(int numeroUno, int numeroDos) throws Exception{
        if(numeroDos != 0){
            resultado = numeroUno / numeroDos;  
        } else {
            throw new Exception("No se puede dividir por cero");  
        }
    }

    public int dividir(int numeroTres) throws Exception{
        if(numeroTres != 0){
            resultado = getResultado() / numeroTres;  
            return resultado;
        } else {
            throw new Exception("No se puede dividir por cero");  
        }
    }

    public void multiplicar(int numeroUno, int numeroDos){
        resultado = numeroUno * numeroDos;  
    }

    public int multiplicar(int numeroTres){
        resultado = getResultado() * numeroTres;
        return resultado;  
    }

    public int getResultado(){
        return resultado;  
    }
 
    public void reset(int resultado){
        resultado = 0;  
    }
}
