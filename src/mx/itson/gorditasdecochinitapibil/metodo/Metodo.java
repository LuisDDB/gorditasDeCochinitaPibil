/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.gorditasdecochinitapibil.metodo;

/**
 *
 * @author sergi
 * @author LuisD
 */
public class Metodo {
    
    /**
     * Quita los espacios del texto
     * @param oracion Es un String  con el que se trabaja
     * @return Retorna un String sin espacios
     */
    
    public static String quitarEspacios(String oracion){
        return oracion.replace(" ", "").replace("ó", "o")
                .replace("!", "").replace("á", "a")
                .replace("é", "e").replace("í", "i")
                .replace("ú", "u").replace(",", "")
                .replace("¡", "");
    }
    
    /**
     * Iguala todas las letras a minusculas
     * @param oracion Es un String con el que se trabaja
     * @return Retorna un String con puras minusculas
     */
   
    public static String igualarMinusculas(String oracion){
        return oracion.toLowerCase();
      
    }
    
    /**
     * comprueba si es un palindromo
     * @param oracion es un String 
     * @return la comprobacion del palindromo 
     */
    public static boolean comprobarPalindromo(String oracion){
        boolean palindromo=true;
        char[] arrayChar = oracion.toCharArray();
        int longitud = oracion.length();
        for (int i = 0; i <= (longitud - 1); i++) {
            if (!(arrayChar[i] == arrayChar[longitud - i-1])) {
                palindromo = false;
                break;
            }
        }
        return palindromo;
    }
    
    
}
