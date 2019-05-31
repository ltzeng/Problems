package maps;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonPrinting {

    public static void main(String[] args) throws JSONException {
        // TODO Auto-generated method stub

        JSONObject json = new JSONObject();
        json.put("key" , "value");
        
        System.out.println(json);
    }

}
