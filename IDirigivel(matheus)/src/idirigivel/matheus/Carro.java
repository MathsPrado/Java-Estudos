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
public class Carro extends VCMotor implements IDirigivel {
    private int NumLugar;
    
    public Carro(int id, double distancia,String localInicio,String localFinal, int lugares){
        this.setId(id);
        this.rodar(distancia);
        this.setLocalInicio(localInicio);
        this.setLocalFinal(localFinal);
        this.NumLugar = lugares;
    }

    public int getNumLugar() {
        return NumLugar;
    }

    public void setNumLugar(int NumLugar) {
        this.NumLugar = NumLugar;
    }

    
    @Override
    public void percurso() {
        System.out.println("Id do carro" + this.getId() +
                "\n Distancia total:" + this.getDistanciaPercorrida() +
                "\n Lugar de Partida:" + this.getLocalInicio() + 
                "\n Lugar de Chegada:" + this.getLocalFinal() + 
                "\n Numero de pessoas:" + this.getNumLugar());  //To change body of generated methods, choose Tools | Templates.
    }    
}
