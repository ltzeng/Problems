package maps;

import domain.Person;

public class HachCodes {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Person p = new Person();
        System.out.println(p.hashCode());
        Person p2 = new Person();
        System.out.println(p2.hashCode());
    }

}
