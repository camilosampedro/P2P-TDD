package co.edu.udea;

import java.util.List;

/**
 * Created by camilo on 7/03/17.
 */
class Estadisticos {
    static double calcularMedia(List<Double> lista) {
        int tamanho = lista.size();
        double suma = 0;
        for(double numero: lista){
            suma += numero;
        }
        return suma / tamanho;
    }

    static double calcularDesviacionEstandar(List<Double> lista) {
        double media = calcularMedia(lista);

        return 0;
    }
}
