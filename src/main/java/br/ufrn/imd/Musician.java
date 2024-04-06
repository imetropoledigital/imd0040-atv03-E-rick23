package br.ufrn.imd;

public class Musician extends Person {
    public boolean playClassicalMusic;
    public boolean canImprovise;
    public boolean canCompose;

    public boolean isPlayClassicalMusic() {
        return playClassicalMusic;
    }

    public void setPlayClassicalMusic(boolean playClassicalMusic) {
        this.playClassicalMusic = playClassicalMusic;
    }

    public boolean isCanImprovise() {
        return canImprovise;
    }

    public void setCanImprovise(boolean canImprovise) {
        this.canImprovise = canImprovise;
    }

    public boolean isCanCompose() {
        return canCompose;
    }

    public void setCanCompose(boolean canCompose) {
        this.canCompose = canCompose;
    }

    public void play() {
        // Implementação do método play
    }
}
