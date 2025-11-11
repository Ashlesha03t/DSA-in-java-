import java.util.*;

public class BubbleSortPrices {
    public static void main(String[] args) {
		double[] prices = {200.5, 99.9, 150.0, 300.0};
		System.out.println("Before: " + Arrays.toString(prices));
		for (int i = 0; i < prices.length - 1; i++) {
		for (int j = 0; j < prices.length - i - 1; j++) {
		if (prices[j] > prices[j + 1]) {
		double temp = prices[j];
		prices[j] = prices[j + 1];
		prices[j + 1] = temp;
		}
	  }
	}
	System.out.println("After: " + Arrays.toString(prices));
	}
}
