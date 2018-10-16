package MelodicMinor4minor_II_V_I;

import java.util.HashMap;

public class WS_Sharp {

    public String getScales(String savel) {

        HashMap<String, String> points = new HashMap<String, String>();
        
        points.put("c","d" );
        points.put("c#","d#" );
        points.put("d","e" );
        points.put("d#","f" );
        points.put("e","f#" );
        points.put("f","g" );
        points.put("f#","g#" );
        points.put("g","a" );
        points.put("g#","a#" );
        points.put("a","b" );
        points.put("a#","c" );
        points.put("b","c#" );
 
        
        return points.get(savel);

    }
}