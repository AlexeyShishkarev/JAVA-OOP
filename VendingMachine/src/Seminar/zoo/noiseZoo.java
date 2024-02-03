package Seminar.zoo;

import java.util.List;

public class noiseZoo {

    private List<Speakable> animals;

    public noiseZoo(List<Speakable> animals){
        this.animals = animals;
    }

    public void speakAll(){
        for (Speakable speakable : animals){
            speakable.speak();
        }
    }

}
