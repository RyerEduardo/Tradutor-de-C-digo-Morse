/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.model;

/**
 *
 * @author Eduardo
 */
public class Conversor {
    
    private String textoEntrada;
    private String textoSaida;

    public Conversor(String textoEntrada, String textoSaida) {
        this.textoEntrada = textoEntrada;
        this.textoSaida = textoSaida;
    }

    public Conversor() {
        
    }

    public String getTextoEntrada() {
        return textoEntrada;
    }

    public void setTextoEntrada(String textoEntrada) {
        this.textoEntrada = textoEntrada;
    }

    public String getTextoSaida() {
        return textoSaida;
    }

    public void setTextoSaida(String textoSaida) {
        this.textoSaida = textoSaida;
    }
    
    
    
}
