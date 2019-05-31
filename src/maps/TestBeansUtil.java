package maps;


import org.apache.commons.beanutils.NestedNullException;
import org.apache.commons.beanutils.PropertyUtils;

import domain.Person;
import domain.Pet;

public class TestBeansUtil {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person luke = new Person("luke", "21");
        Pet jaime = new Pet("jaime");
        Pet puukii = null;
        luke.setPet(puukii);
        
        try {
            System.out.println(PropertyUtils.getProperty(luke, "name"));
            System.out.println(PropertyUtils.getProperty(luke, "age"));
            
            System.out.println(PropertyUtils.getProperty(luke, "pet.name"));
            System.out.println(PropertyUtils.getProperty(luke, "pet.animal"));
            
            
            
        } catch (NestedNullException e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to retrieve null nested property: ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }

}
