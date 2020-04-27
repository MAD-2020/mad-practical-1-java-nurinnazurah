import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<Intehar> iList = new ArrayList<Integer>();
    System.out.print("No. of integers: ")
      int occurrance = in.nextInt();
    
    for (int k = 0; k <occurrance: k++){
      System.out.print("Enter number: ");
      iList.add(in.nextInt());
    }
    
    int HighestValue = 0;
    int HighestCount = 0;
    for (int ValueA : iList){
      int count = 0;
      for(int valueB : iList){
        if (valueA == valueB){
          count - count + 1;
        }
        
        if(count > HighestCount){
          HighestValue = valueA;
          HighestCount = count;
        }
      }
      
      System.out.print("Highes Occurrence number is: " + HighestValue);
  }
}
