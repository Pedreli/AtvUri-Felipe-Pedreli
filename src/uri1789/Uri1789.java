/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1789;

import java.util.Scanner;

/**
 *
 * @author f.pereira
 */
public class Uri1789 {
    public static void run() {
        int quantidade, veloz;
        Scanner input = new Scanner(System.in);
        CorridadeLesmas corridaLesmas = new CorridadeLesmas();
        System.out.println("Digite o número de lesmas nesse grupo:");
        quantidade = input.nextInt();
        int[] lesmas = new int[quantidade];
        lesmas = corridaLesmas.cadastrarLesmas(quantidade);
        
        System.out.println("A lesmas mais veloz do grupo é nível: " + corridaLesmas.verificarVelocidades(lesmas));
    }
}
