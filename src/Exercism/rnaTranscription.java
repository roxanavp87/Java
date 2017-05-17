package Exercism;

/**
 * Created by roxana on 5/17/17.
    Given a DNA strand, return its RNA complement (per RNA transcription).

    Both DNA and RNA strands are a sequence of nucleotides.

    The four nucleotides found in DNA are adenine (A), cytosine (C), guanine (G) and thymine (T).

    The four nucleotides found in RNA are adenine (A), cytosine (C), guanine (G) and uracil (U).

    Given a DNA strand, its transcribed RNA strand is formed by replacing each nucleotide with its complement:

    G -> C
    C -> G
    T -> A
    A -> U
 */


public class rnaTranscription {

    public String transcribe(String DNA) {
        char dna[] = DNA.toCharArray();


        for(int i=0; i<dna.length; i++) {
            switch (dna[i]) {
                case 'C':
                    dna[i] = 'G';
                    break;
                case 'G':
                    dna[i] = 'C';
                    break;
                case 'A':
                    dna[i] = 'T';
                    break;
                case 'U':
                    dna[i] = 'A';
            }
        }
        return new String(dna);
    }
}
