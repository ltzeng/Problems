package maps;

public class EnumsBaby {

    public enum AttributeEnums{
        CaseInsensitive,
        IS,
        The,
        GAME
    }
    
    public static void main(String args[]){
        System.out.println(AttributeEnums.CaseInsensitive.toString());
        System.out.println(AttributeEnums.GAME.toString());
    }
            
}
