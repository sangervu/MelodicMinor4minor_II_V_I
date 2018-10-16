package MelodicMinor4minor_II_V_I;

import java.util.HashMap;

public class HS_Sharp {

    public String getScales(String savel) {

        HashMap<String, String> points = new HashMap<String, String>();
        
        points.put("c","c#" );
        points.put("c#","d" );
        points.put("d","d#" );
        points.put("d#","e" );
        points.put("e","f" );
        points.put("f","f#" );
        points.put("f#","g" );
        points.put("g","g#" );
        points.put("g#","a" );
        points.put("a","a#" );
        points.put("a#","b" );
        points.put("b","c" );
        
        return points.get(savel);

    }
}