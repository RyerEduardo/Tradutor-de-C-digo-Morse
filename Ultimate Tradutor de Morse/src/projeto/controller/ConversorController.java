package projeto.controller;


import java.util.Scanner;
import projeto.model.Conversor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo
 */
public class ConversorController {
    
    
    public Conversor textoParaMorse(Conversor c){
        String texto = c.getTextoEntrada();
        String codigoMorse = "";
        for ( int i = 0; i < texto.length(); i++ )
         switch ( Character.toUpperCase( texto.charAt( i ) ) ) {
	    case 'A': codigoMorse += "01 "; //".- "
	              break;
	    case 'B': codigoMorse += "1000 ";//"-... "
	              break;
	    case 'C': codigoMorse += "1010 ";//"-.-. "
	              break;
	    case 'D': codigoMorse += "100 ";//"-.. "
	              break;
	    case 'E': codigoMorse += "0 ";//". "
	              break;
	    case 'F': codigoMorse += "0010 ";//"..-. "
	              break;
	    case 'G': codigoMorse += "110 ";//"--. "
	              break;
	    case 'H': codigoMorse += "0000 ";//".... "
	              break;
	    case 'I': codigoMorse += "00 ";//".. "
	              break;
	    case 'J': codigoMorse += "0111 ";//".--- "
	              break;
	    case 'K': codigoMorse += "101 ";//"-.- "
	              break;
	    case 'L': codigoMorse += "0100 ";//".-.. "
	              break;
	    case 'M': codigoMorse += "11 ";//"-- "
	              break;
	    case 'N': codigoMorse += "10 ";//"-. "
	              break;
	    case 'O': codigoMorse += "111 ";//"--- "
	              break;
	    case 'P': codigoMorse += "0110 ";//".--. "
	              break;
	    case 'Q': codigoMorse += "1101 ";//"--.- "
	              break;
	    case 'R': codigoMorse += "010 ";//".-. "
	              break;
	    case 'S': codigoMorse += "000 ";//"... "
	              break;
	    case 'T': codigoMorse += "1 ";//"- "
	              break;
	    case 'U': codigoMorse += "001 ";//"..- "
	              break;
	    case 'V': codigoMorse += "0001 ";//"...- "
	              break;
	    case 'W': codigoMorse += "011 ";//".-- "
	              break;
	    case 'X': codigoMorse += "1001 ";//"-..- "
	              break;
	    case 'Y': codigoMorse += "1011 ";//"-.-- "
	              break;
	    case 'Z': codigoMorse += "1100 ";//"--.. "
	              break;
	    // O espaco em branco nao consta no codigo Morse.
	    // No codigo, o espaco em branco eh representado
	    //    por um intervalo de tempo sem transmissao de
	    //    informacoes.
	    case ' ': codigoMorse += "   ";
	              break;
	    
	    default: // Caracter nao suportado
	             break;
	 } // switch
        
        c.setTextoSaida(codigoMorse);
        return c;
    }
    
    public Conversor morseParaTexto(Conversor c){
        String morse = c.getTextoEntrada();
        String texto = " ";
       String letras = "abcdefghijklmnopqrstuvwxyz ";
        String codigo[] = new String[30];

        codigo[0] = "01"; //a
        codigo[1] = "1000";//b
        codigo[2] = "1010";//c
        codigo[3] = "100";//d
        codigo[4] = "0";//e
        codigo[5] = "0010";//f
        codigo[6] = "110";//g
        codigo[7] = "0000";//h
        codigo[8] = "00";//i
        codigo[9] = "0111";//j
        codigo[10] = "101";//k
        codigo[11] = "0100";//l
        codigo[12] = "11";//m
        codigo[13] = "10";//n
        codigo[14] = "111";//o
        codigo[15] = "0110";//p
        codigo[16] = "1101";//q
        codigo[17] = "010";//r
        codigo[18] = "000";//s
        codigo[19] = "1";//t
        codigo[20] = "001";//u
        codigo[21] = "0001";//v
        codigo[22] = "011";//w
        codigo[23] = "1001";//x
        codigo[24] = "1011";//y
        codigo[25] = "1100";//z
        codigo[26] = " ";//espaço
        
        String frase[] = morse.split(" ");
        int max = frase.length;

        for (int i = 0; i < max; i++){
            for (int j = 0; j < 30; j++){
                if (frase[i].equals(codigo[j])) {
                    texto = texto+letras.charAt(j);
                    break;
                }
            }
        }
        
        c.setTextoSaida(texto);
        return c;
    }
}
