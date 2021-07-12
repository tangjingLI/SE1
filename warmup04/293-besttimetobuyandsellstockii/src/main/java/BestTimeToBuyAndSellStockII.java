
public class BestTimeToBuyAndSellStockII {

	  public static int maxProfit(int[] prices) {
	  	int input=0;
	  	for(int i=1;i<prices.length;i++){
	  		if(prices[i-1]<prices[i])
	  			input+=prices[i]-prices[i-1];
		}
	  	return input;
	    
	  }

}
