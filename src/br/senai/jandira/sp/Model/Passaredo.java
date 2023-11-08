package br.senai.jandira.sp.Model;

public class Passaredo extends Voo {

    int numeroPassageiros;

    public Passaredo(String numeroVoo, String origem, String destino, String dataPartida, int numeroPassageiros) {
        super(numeroVoo, origem, destino, dataPartida);

        this.numeroPassageiros = numeroPassageiros;

    }

    @Override
    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }
}
