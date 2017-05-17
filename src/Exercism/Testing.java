package Exercism;

/**
 * Created by roxana on 5/17/17.
 */
public class Testing {
    public static void main(String[] args) {
        rnaTranscription RNA = new rnaTranscription();

        System.out.println(RNA.transcribe("UGCACCAGAAUU"));
        // output: ACGTGGTCTTAA
    }
}
