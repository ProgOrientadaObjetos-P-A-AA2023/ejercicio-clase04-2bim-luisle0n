/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class PasajeUniversitario extends PasajeUrbano {
    private double pasajeFijo;
    public PasajeUniversitario(double pasaje){
        super(pasaje);
        pasajeFijo=pasaje;
               
    }
    
       
    @Override
    public String toString(){
        return String.format("Tipo de pasaje: Universitario\n"
                + "%s",
                super.toString()
                );
    }

    @Override
    public void establecerValorPasaje() {
      valorPasaje=pasajeFijo-(0.30*pasajeFijo);
    }
}