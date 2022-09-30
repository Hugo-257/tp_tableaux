package judges;

import java.util.Arrays;

public class Marks {
    int[][] marks;
    /*
     * int nbrJuges;
     * int criteres;
     */
    int maxNote;

    public Marks(int nbrJuges, int nbrCriteres, int maxNote) {
        this.marks = new int[nbrJuges][nbrCriteres];
        this.maxNote = maxNote;
    };

    public float average(int numeroCritere) {
        int[] tmp = new int[marks.length];

        // Retrieving marks per judge
        for (int i = 0; i < marks.length; i++) {
            tmp[i] = this.marks[i][numeroCritere];
        }

        // Sorting the marks
        Arrays.sort(tmp);
        int sum = 0;
        for (int i = 1; i < tmp.length - 1; i++) {
            sum += tmp[i];
        }

        return (float) sum / (tmp.length - 2);

    }

    public float globalAverage() {
        float[] averages = new float[marks[0].length];
        //Calculate all averages
        for (int i = 0; i < this.marks[0].length; i++) {
            averages[i] = average(i);
        }
       
        /* Calculating overall average */
        float sumAverages = 0;
        for (int i = 0; i < averages.length; i++) {
            sumAverages += averages[i];
        }

        return sumAverages / averages.length;
    }

    // Accesseurs
    public int getMark(int numeroJuge, int numeroCritere) {
        return this.marks[numeroJuge][numeroCritere];
    }

    public void setMark(int numeroJuge, int numeroCritere, int note) {
        this.marks[numeroJuge][numeroCritere] = note;
    }

}