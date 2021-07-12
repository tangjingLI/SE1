
//Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to an upperbound (e.g., 100). 
//Also compute and display the average. The output shall look like:
//The sum is 5050
//The average is 50.5
public class SumAndAverage {
	static int sum = 0;          // store the accumulated sum, init to 0
    static double average;       // average in double
    static int lowerbound = 1;   // the lower bound to sum
    static int upperbound = 100; // the upper bound to sum
    
    public  int calculateSum(int lowerbound,int upperbound){
    	//for loop

        for(int i=1;i<= upperbound;i++){
            sum+=i;
        }
        
    	return sum;
    }

    public  double calculateAverage(int lowerbound,int upperbound){
		//for loop
        for(double j=lowerbound; j<=upperbound;j++) {
        average+=j/(double)(upperbound+1-lowerbound);
        }
    	return average;
    }
    public static void  main (String[] args){
        SumAndAverage A=new SumAndAverage();
      int a=A.calculateSum(lowerbound,upperbound);
      double b=A.calculateAverage(lowerbound,upperbound);
      System.out.println(a);
      System.out.println(b);
    }
//Modify the program to use a "while-do" loop instead of "for" loop.
//Modify the program to use a "do-while" loop.
//What is the difference between "for" and "while-do" loops?
//What is the difference between "while-do" and "do-while" loops?
}
