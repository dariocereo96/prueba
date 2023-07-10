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
public class Edificio implements ImpactoEcologico {

    private String numeroPisos;
    private String ubicacion;
    private double consumoElectricidad;//Consumo mensual de electricidad (kwh) en el hogar
    private double consumoGas;//Consumo mensual de gas (metros cubicos) en el hogar
    private final double emisionElectricidadCO2 = 0.40;//Valor de emision (kg) de C02 por cada kwh de electricidad
    private final double emisionGasCO2 = 2.03;  //Valor de emision (kg) de de C02 por cada metro cubico de gas

    public Edificio(String numeroPisos, String ubicacion) {
        this.numeroPisos = numeroPisos;
        this.ubicacion = ubicacion;
    }

    public String getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(String numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getConsumoElectricidad() {
        return consumoElectricidad;
    }

    public void setConsumoElectricidad(double consumoElectricidad) {
        this.consumoElectricidad = consumoElectricidad;
    }

    public double getConsumoGas() {
        return consumoGas;
    }

    public void setConsumoGas(double consumoGas) {
        this.consumoGas = consumoGas;
    }

    public double getEmisionElectricidadCO2() {
        return emisionElectricidadCO2;
    }

    public double getEmisionGasCO2() {
        return emisionGasCO2;
    }

    @Override
    public String toString() {
        return "Edificio{" + "numeroPisos=" + numeroPisos + ", ubicacion=" + ubicacion + ", consumoElectricidad=" + consumoElectricidad + ", consumoGas=" + consumoGas + '}';
    }

    //Se multiplica el consumo de energia y gas por sus valores correspondientes
    // en generacion de co2, para la electricidad se calcula pr kwh y para el gas
    // en metros cubicos. Luegos se procede a sumar los valores.
    @Override
    public void obtenerImpactoEcologico() {
        double CO2kg = (this.consumoElectricidad * this.emisionElectricidadCO2) + (this.consumoGas * this.emisionGasCO2);
        System.out.println("El CO2 Generado por el edificio es: " + CO2kg + " kg");
    }

}
