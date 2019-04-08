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
public class Bike extends VSMotor implements IDirigivel{
    private int NumeroMarchas ;
    
    
     public Bike(int id, double distancia,String localInicio,String localFinal, int marchas){
        this.setId(id);
        this.rodar(distancia);
        this.setLocalInicio(localInicio);
        this.setLocalFinal(localFinal);
        this.NumeroMarchas = marchas;
    }
    
    @Override
    public void percurso() {
        System.out.println("Id da bike" + this.getId() +
                "\n Distancia total" + this.getDistanciaPercorrida() +
                "\n Lugar de Partida" + this.getLocalInicio() + 
                "\n Lugar de Chegada" + this.getLocalFinal() +
                "\n Numero de marchas" + this.getNumeroMarchas()
                ); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumeroMarchas() {
        return NumeroMarchas;
    }

    public void setNumeroMarchas(int NumeroMarchas) {
        this.NumeroMarchas = NumeroMarchas;
    }
    
    
}
