/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impactoecologico;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un auto con los atributos Marca,Modelo,Año,Tipo de combustible,Kilometros recorridos;
        Auto auto = new Auto("Chevrolet", "Captiva", 2010, "GASOLINA", 5000);

        //Creamos un edificio con los atributos numeros de pisos, ciudad
        Edificio edificio = new Edificio("1", "IBARRA");

        //Agregamos consumo de luz en kwh;
        edificio.setConsumoElectricidad(150);

        //Agregamos consumo de gas en metros cubicos valor de un tanque normal;
        edificio.setConsumoGas(7.65);

        //Creamos una biclicleta con los atributos Marca,Tipo y kilometros recorridos
        Bicicleta bicicleta = new Bicicleta("Honda", "Electrica", 200);

        //Creamos la lista de objetos
        ArrayList<ImpactoEcologico> impacto = new ArrayList<>();

        impacto.add(auto);
        impacto.add(edificio);
        impacto.add(bicicleta);

        //Iteramos sobre la lista para mostrar los valores
        for (ImpactoEcologico impactoEcologico : impacto) {
            if (impactoEcologico instanceof Auto) {
                System.out.println((Auto) impactoEcologico);
                impactoEcologico.obtenerImpactoEcologico();
            }
            if (impactoEcologico instanceof Edificio) {
                System.out.println((Edificio) impactoEcologico);
                impactoEcologico.obtenerImpactoEcologico();
            }
            if (impactoEcologico instanceof Bicicleta) {
                System.out.println((Bicicleta) impactoEcologico);
                impactoEcologico.obtenerImpactoEcologico();
            }

            System.out.println("=======================================");

        }

    }

}
