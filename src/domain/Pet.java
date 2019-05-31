package domain;

public class Pet {

    public Pet(String name) {
        this.name=name;
    }
    
    public String name;
    public String animal;
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAnimal() {
        return animal;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    
    
}
