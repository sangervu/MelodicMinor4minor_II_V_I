package MelodicMinor4minor_II_V_I;

/**
 *
 * @author angervuorisa
 */
public class HalfDiminished {

    public String new_MM_Scale;

    public HalfDiminished(String minorKey) {
        String note2, note3, note4, note5, note6, note7, note8;

        String sharpKeys = "d#ega#b";
        String flatKeys = "cfgb";

        WS_Sharp ws_sharp = new WS_Sharp();
        HS_Sharp hs_sharp = new HS_Sharp();
        WS_Flat ws_flat = new WS_Flat();
        HS_Flat hs_flat = new HS_Flat();

        if (sharpKeys.contains(minorKey)
                || minorKey.contains("c#") || minorKey.contains("f#") || minorKey.contains("g#")) {

            //System.out.println("Half diminished scale for II cord (mi7b5)");
            //System.out.println(" W H W H W W W ");
            //intervalli1 = "W";
            note2 = ws_sharp.getScales(minorKey);

            //intervalli2 = "H";
            note3 = hs_sharp.getScales(note2);

            //intervalli3 = "W";
            note4 = ws_sharp.getScales(note3);

            //intervalli4 = "H";
            note5 = hs_sharp.getScales(note4);

            //intervalli5 = "W";
            note6 = ws_sharp.getScales(note5);

            //intervalli6 = "W";
            note7 = ws_sharp.getScales(note6);

            //intervalli7 = "W";
            note8 = ws_sharp.getScales(note7);

            this.new_MM_Scale = minorKey + " " + note2 + " " + note3 + " " + note4 + " " + note5 + " " + note6 + " " + note7 + " " + note8;

        } else if (flatKeys.contains(minorKey)
                || minorKey.contains("db") || minorKey.contains("eb") || minorKey.contains("ab") || minorKey.contains("bb")) {

            // System.out.println("Half diminished scale for II cord (mi7b5)");
            //System.out.println(" W H W H W W W ");
            //intervalli1 = "W";
            note2 = ws_flat.getScales(minorKey);

            //intervalli2 = "H";
            note3 = hs_flat.getScales(note2);

            //intervalli3 = "W";
            note4 = ws_flat.getScales(note3);

            //intervalli4 = "H";
            note5 = hs_flat.getScales(note4);

            //intervalli5 = "W";
            note6 = ws_flat.getScales(note5);

            //intervalli6 = "W";
            note7 = ws_flat.getScales(note6);

            //intervalli7 = "W";
            note8 = ws_flat.getScales(note7);

            this.new_MM_Scale = minorKey + " " + note2 + " " + note3 + " " + note4 + " " + note5 + " " + note6 + " " + note7 + " " + note8;

        } else {
            System.out.println("This is not a valid key");

        }
    }

}
