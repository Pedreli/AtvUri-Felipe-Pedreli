/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1960;

import java.util.Scanner;

/**
 *
 * @author f.pereira
 */
public class Uri1960 {
    public static void run() {
        NumeracaoRomana numerosRomanos = new NumeracaoRomana();
        
        System.out.println("Digite um número");
        Scanner input = new Scanner(System.in);
        String num = input.next();
        
        System.out.println(numerosRomanos.getRomanos(num));
    }
}