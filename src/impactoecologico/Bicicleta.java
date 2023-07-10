/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impactoecologico;

/**
 *
 * @author HP
 */
public class Bicicleta implements ImpactoEcologico {

    private String marca;
    private String tipo;
    private double kmRecorridos;
    private final double emisionC02 = 0.006;//CO2 emitido (kg) por una bicicleta electrica

    public Bicicleta(String marca, String tipo, double kmRecorridos) {
        this.marca = marca;
        this.tipo = tipo;
        this.kmRecorridos = kmRecorridos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "marca=" + marca + ", tipo=" + tipo + ", kmRecorridos=" + kmRecorridos + '}';
    }

    //Para calcular el impacto se multiplica los kilometros recorridos
    // por el valor de C02 que se genera, solo si la bicicleta es electrica.
    @Override
    public void obtenerImpactoEcologico() {
        if (this.tipo.equalsIgnoreCase("Electrica")) {
            System.out.println("EL CO2 generado por la bicicleta es: " + this.kmRecorridos * this.emisionC02 + " kg");
        } else {
            System.out.println("EL CO2 generado por la bicicleta es: 0 kg");
        }

    }

}
