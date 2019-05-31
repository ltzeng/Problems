package domain;

public class Person {

    public Person(String name, String address) {
        this.name=name;
        this.address=address;
    }
    public Person() {
    }
    
    public String name;
    public String address;
    public String age;
    public String funFact;
    public Pet pet;
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getFunFact() {
        return funFact;
    }
    public void setFunFact(String funFact) {
        this.funFact = funFact;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
    
}
