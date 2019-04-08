/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idirigivel.matheus;

/**
 *
 * @author Matheus Prado
 */
public class IDirigivelMatheus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carro carrinho = new Carro(1,100,"Na casa do joao", "Na casa do matheus", 30);
        
        carrinho.rodar(100);
        carrinho.percurso();

           Minhao caminhao = new Minhao(1,100,"Na casa do joao", "Na casa do matheus", 1000);
           
        System.out.println("\n");
        
        caminhao.rodar(100);
        caminhao.percurso();
        
           System.out.println("\n");
           
            Bike bicicleta = new Bike(1,100,"Na casa do joao", "Na casa do matheus", 5);
            
        bicicleta.rodar(100);
        bicicleta.percurso();
        
        

    }
    
}
