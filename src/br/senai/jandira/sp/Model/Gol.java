package br.senai.jandira.sp.Model;

public class Gol extends Voo {

    int numeroPassageiros;

    public Gol (String numeroVoo, String origem, String destino, String dataPartida, int numeroPassageiros){
        super (numeroVoo, origem, destino,dataPartida);

        this.numeroPassageiros = numeroPassageiros;
    }

    @Override
    public int getNumeroPassageiros(){
        return numeroPassageiros;

    }
}
