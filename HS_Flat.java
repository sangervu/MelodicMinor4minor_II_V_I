package MelodicMinor4minor_II_V_I;

import java.util.HashMap;

public class HS_Flat {

    public String getScales(String savel) {

        HashMap<String, String> points = new HashMap<String, String>();
        
        points.put("c","db" );
        points.put("db","d" );
        points.put("d","eb" );
        points.put("eb","e" );
        points.put("e","f" );
        points.put("f","gb" );
        points.put("gb","g" );
        points.put("g","ab" );
        points.put("ab","a" );
        points.put("a","bb" );
        points.put("bb","b" );
        points.put("b","c" );
        
        return points.get(savel);

    }
}