package util;

import java.util.ArrayList;
import java.util.Collections;

public abstract class MisArrays {
	
	/**
	 * Metodo que calcula la media de las notas
	 * @param notas ArrayList de números con decimales entre 0 y 10.
	 * @return La media de la arraylist de notas
	 * @throws IllegalArgumentException Si alguna nota no está entre 0 y 10.
	 */
	
	public static float mediaNotas(ArrayList<Float> notas) {
        verificarNotas(notas);
        float suma = 0;
        for (float nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
	
	/**
	 * 
	 * @param notas ArrayList de números con decimales entre 0 y 10.
	 * @return La media de la arraylist de notas
	 * @throws IllegalArgumentException Si alguna nota no está entre 0 y 10.
	 */
	public static float medianaNotas(ArrayList<Float> notas) {
        verificarNotas(notas);
        Collections.sort(notas);
        int n = notas.size();
        if (n % 2 == 0) {
            return (notas.get(n / 2 - 1) + notas.get(n / 2)) / 2.0f;
        } else {
            return notas.get(n / 2);
        }
    }
	
	/**
     * Obtiene la nota máxima de una lista de notas.
     * 
     * @param notas ArrayList de números con decimales entre 0 y 10.
     * @return La nota máxima.
     * @throws IllegalArgumentException Si alguna nota no está entre 0 y 10.
     */
    public static float maximaNota(ArrayList<Float> notas) {
        verificarNotas(notas);
        return Collections.max(notas);
    }
    
    /**
     * Devuelve la nota mínima en un array.
     * 
     * @param notas El array de notas.
     * @return La nota mínima en el array.
     * @throws IllegalArgumentException, si alguna nota está fuera del rango válido (entre 0 y 10).
     */
    
    public static float minimaNota(ArrayList<Float> notas) {
        verificarNotas(notas);
        return Collections.min(notas);
    }
	
	private static void verificarNotas(ArrayList<Float> notas) {
        for (float nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("Todas las notas deben estar entre 0 y 10.");
            }
        }
    }
}
