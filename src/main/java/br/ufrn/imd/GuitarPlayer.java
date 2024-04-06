package br.ufrn.imd;

public class GuitarPlayer extends Musician {
    public int howManyYears;
    public boolean playEletronicGuitar;
    public boolean playAcousticGuitar;

    public int getHowManyYears() {
        return howManyYears;
    }

    public void setHowManyYears(int howManyYears) {
        this.howManyYears = howManyYears;
    }

    public boolean isPlayEletronicGuitar() {
        return playEletronicGuitar;
    }

    public void setPlayEletronicGuitar(boolean playElectronicGuitar) {
        this.playEletronicGuitar = playElectronicGuitar;
    }

    public boolean isPlayAcousticGuitar() {
        return playAcousticGuitar;
    }

    public void setPlayAcousticGuitar(boolean playAcousticGuitar) {
        this.playAcousticGuitar = playAcousticGuitar;
    }

    public void playGuitar() {
        // Implementação do método playGuitar
    }
}
