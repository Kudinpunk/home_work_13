import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;


public class program {

    public static void main(String[] args) throws FileNotFoundException {
            
        String where = "select * from students where ";
        Map <String,String> json_dictionary = new HashMap<String,String>();
        json_dictionary.put("name", "Ivanov");
        json_dictionary.put("country", "Russia");
        json_dictionary.put("city", "Moscow");
        json_dictionary.put("age", "null");
        StringBuilder temp_result = new StringBuilder();
        for (Map.Entry<String, String> entry : json_dictionary.entrySet()){
            if (entry.getValue() != "null"){
                temp_result.append(entry.getKey() + "=" + entry.getValue() + ", ");
            }
        }
        String result = where  + temp_result.toString().substring(0, temp_result.length() - 2);
        System.out.println("\n" + result + "\n");
    }
}
        
        

