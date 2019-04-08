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
public class Minhao extends VCMotor implements IDirigivel{
    private double VolumeTransportado;

    public double getVolumeTransportado() {
        return VolumeTransportado;
    }

    public void setVolumeTransportado(double VolumeTransportado) {
        this.VolumeTransportado = VolumeTransportado;
    }
      public Minhao(int id, double distancia,String localInicio,String localFinal, double volume){
        this.setId(id);
        this.rodar(distancia);
        this.setLocalInicio(localInicio);
        this.setLocalFinal(localFinal);
        this.VolumeTransportado = volume;
    }
    
    
    @Override
    public void percurso() {
        System.out.println("Id do Minhao" + this.getId() +
                "\n  Distancia total:" + this.getDistanciaPercorrida() +
                "\n Lugar de Partida" + this.getLocalInicio() + 
                "\n Lugar de Chegada" + this.getLocalFinal()+
                "\n Volume trasnportado:"+ this.getVolumeTransportado());  //To change body of generated methods, choose Tools | Templates.
    }  
}
