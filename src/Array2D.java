import java.util.Scanner;
public class Array2D {

    
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        double [][] myArray = new double [4][5];
        
        
        System.out.println("HELLO DEAR USER!");
        System.out.println("Please Enter the Elements for 2D Array:");
        //this loop to receive the elements from user
        for(int row=0; row<myArray.length; row++)
        {
          for( int column= 0; column<myArray[row].length ; column++)
            {
              //to print the index of rows and columns
              System.out.printf("myArray[" + row + "][" + column + "] = ");
              myArray[row][column] = input.nextDouble();
            }//end inner for
     
           System.out.println("Please Enter the Elements for 2D Array:");
        }//end outer for
        
        
  System.out.println("--------------------------------------------------------------------------------------");
        
        System.out.println("\n*ELEMENTS IN ARRAY BY ROWS:\n");
        printArray(myArray);//calling printArray function
        
        
 System.out.println("--------------------------------------------------------------------------------------");
       
        
        System.out.println("\n*ELEMENTS REVERSE IN ARRAY BY ROWS:\n");
        printReverse(myArray);//calling printReverse function
        
    }//end main
  
    
   public static void printArray(double [][]array) {
   
  //declear array with size 4 bc we have 4 rows and we need to stored the average for each row inside it
     double []ARRAY = new double[4]; 
       
   for(int ROW=0, index=0; ROW<array.length && index<ARRAY.length ; ROW++,index++)
   {
      System.out.printf("Row (%d):", ROW+1);
      
      //assign the average of each row inside ARRAY[index]
      ARRAY[index]= getAvg(array[ROW]);
      
      for(double A :  array[ROW])
      {
        System.out.printf("%10.2f", A);
      }
      
    double avg = getAvg (array[ROW]);//calling the function and stored into avg variable
    System.out.printf("\tTHE AVERAGE = %.2f\n\n", avg);//print the average for each row
     
   }// end outer for
   
  System.out.println("--------------------------------------------------------------------------------------");
   
  leastAvg(ARRAY); //calling function , to print the least average
    
   }
    
  public static double getAvg(double [] caleAvg) {
  
   int total=0;
   
   //sum the elements for one row
   for(double B : caleAvg){
     
       total+=B;
   }
   
   double average = (double)total/ caleAvg.length;//we can replace the(caleAvg.length) to 5
   return  average;
  }
  
  
  public static void leastAvg (double [] minAvg){
      
     
      double lowAvg = minAvg[0];//assume the first element is smallest
     
      for(double M : minAvg){
          
      //if the element is smaller than first element will be assign the smaller element to lowAvg
           if (M<lowAvg)
           {
            lowAvg = M;
           }
         
        }
      
   System.out.printf("\n* THE LEAST AVERAGE = %.2f *\n\n", lowAvg); 
  }
  
  public static void printReverse (double [][]arrRev){
  
      
   for(int i =arrRev.length-1; i>=0 ;i--)//to reverse the rows 
   {
       System.out.printf("Row (%d):\t", i+1);
    for(int j = arrRev[i].length-1; j>=0; j--)//arrRev[i].length is no of columns in each row
      {
        System.out.print(arrRev[i][j]+"\t\t");
      }
    System.out.println();
    System.out.println(); 
   }
    System.out.println();  
 }
  
}//end class
