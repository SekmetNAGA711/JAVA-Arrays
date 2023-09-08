import java.util.Arrays;

public class referenceTrap {
    public static void main(String[] args) {
      String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
      
//solution using ArrayCopyOf
      String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);

      staffThisYear[1] = "Abby";

     
//Solution to solve reference trap, use a for loop: 
    //   String[] staffThisYear = new String[3];
    //   for(int i = 0; i < staffThisYear.length; i++){
    //     staffLastYear[i] = staffThisYear[i];
    //   }
    //   staffThisYear[1] = "Abby";

    //   String[] staffThisYear = staffLastYear;
    //   staffThisYear[1] = "Abby"; ////This changes staffLastYear
    //   // and staffThisYear ** this is the reference trap. Both variables point to the same array

      System.out.println(Arrays.toString(staffLastYear));
      System.out.println(Arrays.toString(staffThisYear));


    }
}