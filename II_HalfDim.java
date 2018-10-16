
package MelodicMinor4minor_II_V_I;

/**
 *
 * @author angervuorisa
 */
public class II_HalfDim {

    public String newRoot4II;
    public String newRoot4MMScale;

    II_HalfDim(String keyNote) {

        String sharpKeys = "d#ega#b";
        String flatKeys = "cfgbb";

        String note2, note3, note4, note5;

        WS_Sharp ws_sharp = new WS_Sharp();
        HS_Sharp hs_sharp = new HS_Sharp();
        WS_Flat ws_flat = new WS_Flat();
        HS_Flat hs_flat = new HS_Flat();

        // Find the root for the II degree       
        // W
        if (sharpKeys.contains(keyNote)
                || keyNote.contains("c#") || keyNote.contains("f#") || keyNote.contains("g#")) {

            //intervalli1 = "W";
            note2 = ws_sharp.getScales(keyNote);

            this.newRoot4II = note2;

        } else if (flatKeys.contains(keyNote)
                || keyNote.contains("db") || keyNote.contains("eb") || keyNote.contains("ab") || keyNote.contains("bb")) {

            //intervalli1 = "W";
            note2 = ws_flat.getScales(keyNote);

            this.newRoot4II = note2;

        } else {

        }

// Find the new root for melodic minor scale used on for Half dim. scale       
        // W W H
        if (sharpKeys.contains(keyNote)
                || keyNote.contains("c#") || keyNote.contains("f#") || keyNote.contains("g#")) {

            //intervalli1 = "W";
            note2 = ws_sharp.getScales(keyNote);

            //intervalli2 = "W";
            note3 = ws_sharp.getScales(note2);

            //intervalli3 = "H";
            note4 = hs_sharp.getScales(note3);

            this.newRoot4MMScale = note4;

        } else if (flatKeys.contains(keyNote)
                || keyNote.contains("db") || keyNote.contains("eb") || keyNote.contains("ab") || keyNote.contains("bb")) {

            //intervalli1 = "W";
            note2 = ws_flat.getScales(keyNote);

            //intervalli2 = "W";
            note3 = ws_flat.getScales(note2);

            //intervalli3 = "H";
            note4 = hs_flat.getScales(note3);

            this.newRoot4MMScale = note4;

        } else {

        }

    }
}
