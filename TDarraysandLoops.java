import java.util.Arrays;

public class TDarraysandLoops {
    public static void main(String[] args) {
        int [][] grades = {
            {72, 74,76, 78},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };

        //nested loop on 2D array ****** using a switch statement to print the 
    for(int i = 0; i < grades.length; i++){

           switch (i) {
            case 0: System.out.println("\tHarry: "); break;
            case 1: System.out.println("\tRon "); break;
            case 2: System.out.println("\tHermione ");
                
    
           }



        for(int j = 0; j < grades[i].length; j++) {
            System.out.println(grades[i][j] + " ");
        }
    }




        // for(int j = 0; j < grades[0].length; j++) {
        //     System.out.println(grades[0][j]);  // loops through harry's
        // }

        //    for(int j = 0; j < grades[1].length; j++) {
        //     System.out.println(grades[1][j]);  // loops through ron's
        // }
        // for(int j = 0; j < grades[2].length; j++) {
        //     System.out.println(grades[2][j]);  // loops through hermione's
        // }

        // grades[0][0] = 72;
        // grades[0][1] = 74;
        // grades[0][2] = 76;
        // grades[0][3] = 78;

        // grades[1][0] = 65;
        // grades[1][1] = 64;
        // grades[1][2] = 61;
        // grades[1][3] = 67;

        // grades[1][0] = 95;
        // grades[1][1] = 98;
        // grades[1][2] = 99;
        // grades[1][3] = 100;
      
        System.out.println("\tharry: "+ grades[0][0] + " " + grades[0][1] + " " +grades[0][2]);
        System.out.println("\tron: " + Arrays.toString(grades[1]));
        System.out.println("\thermione: " + Arrays.toString(grades[2]));
    }
}
