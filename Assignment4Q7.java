package lambdaAssignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment4Q7 {
	public static void main(String[] args)
	{ }
	
    public String convertKeyValueToString(HashMap<String, Integer> map) 
    {
        StringBuilder str = new StringBuilder();

        for(Map.Entry mapElement:map.entrySet()){
            str.append(mapElement.getKey());
            str.append(mapElement.getValue());
        }

        return str.toString();
    }
	}
