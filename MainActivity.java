package MelodicMinor4minor_II_V_I;

import java.util.Scanner;

/**
 * @author Sakari Angervuori
 */
public class MainActivity {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input key for the minor II V I progression");
        Scanner key = new Scanner(System.in);
        String keyNote = key.nextLine();
        int jatka = 1;

        while (jatka == 1) {

            if (jatka == 1) {

                System.out.println("1: I (mi Ma7) 2: II (Half.dim) 5: V (Alt) ");
                int valinta = input.nextInt();
                switch (valinta) {

                    case 1:
                        MelodicMinor melodicMinor = new MelodicMinor(keyNote);
                        System.out.println("Melodic minor scale for mi I cord (mi MA7):");
                        System.out.println(" W H W W W W H ");
                        System.out.println(melodicMinor.new_MM_Scale);
                        //define the melodic minor scale used for I
                        System.out.println("Melodic minor scale on " + keyNote);
                        break;

                    case 2:
                        II_HalfDim dim_II = new II_HalfDim(keyNote);
                        //define the key note for II
                        HalfDiminished halfDim = new HalfDiminished(dim_II.newRoot4II);
                        System.out.println("Half diminished scale for II cord (mi7b5)");
                        System.out.println(" W H W H W W W ");
                        System.out.println(halfDim.new_MM_Scale);
                        //define the melodic minor scale used for I
                        System.out.println("Melodic minor scale on " + dim_II.newRoot4MMScale);
                        break;
                    case 5:
                        V_Altered alt_V = new V_Altered(keyNote);
                        //define the key note for V
                        Altered altered = new Altered(alt_V.newRoot4V);
                        System.out.println("Diminished whole tone scale for V cord (7 altered)");
                        System.out.println(" H W H W W W W ");
                        System.out.println(altered.new_MM_Scale);
                        //define the melodic minor scale used for V
                        System.out.println("Melodic minor scale on " + alt_V.newRoot4MMScale);
                        break;

                }
                System.out.println("Jatka, paina 1 ");
                jatka = input.nextInt();
            }
        }
    }
    /*
        points.put("WHWWWWH","mi Ma7 Melodic minor scale" );
        points.put("HWWWWHW","mi7 Dorian b2 scale" );
        points.put("WWWWHWH","Ma7#5 Lydian augmented scale" );
        points.put("WWWHWHW","7 Lydian dom./Acoustic scale" );
        points.put("WWHWHWW","7 Aeolian dom. scale" );
        points.put("WHWHWWW","mi7b5 Half dim. scale" );
        points.put("HWHWWWW","7 Altered scale" );
     */
}
