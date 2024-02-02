package Seminar.zoo;

import java.util.List;

public class noiseZoo {

    private List<Animal> animals;

    public noiseZoo(List<Animal> animals){
        this.animals = animals;
    }

    public void speakAll(){
        for (Animal animal : animals){
            animal.speak();
        }
    }

}
