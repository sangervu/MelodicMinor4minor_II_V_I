package MelodicMinor4minor_II_V_I;

import java.util.HashMap;

public class WS_Flat {

    public String getScales(String savel) {

        HashMap<String, String> points = new HashMap<String, String>();
        
        points.put("c","d" );
        points.put("db","eb" );
        points.put("d","e" );
        points.put("eb","f" );
        points.put("e","gb" );
        points.put("f","g" );
        points.put("gb","ab" );
        points.put("g","a" );
        points.put("ab","bb" );
        points.put("a","b" );
        points.put("bb","c" );
        points.put("b","db" );

        
        return points.get(savel);

    }
}
