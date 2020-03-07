package clinica;

import javax.xml.crypto.Data;
import java.util.Date;

public class Procedimento {

    private Veterinario vet;
    private Animal animal;
    private Date data;

    public Veterinario getVet() {
        return vet;
    }

    public void setVet(Veterinario vet) {
        this.vet = vet;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
