import java.util.*;

public class SelectionSortPrices {
    public static void main(String[] args) {
		double[] prices = {250.0, 100.0, 400.0, 200.0};
		System.out.println("Before: " + Arrays.toString(prices));
		for (int i = 0; i < prices.length - 1; i++) {
		int minIdx = i;
		for (int j = i + 1; j < prices.length; j++) {
		if (prices[j] < prices[minIdx]) {
		minIdx = j;
		}
		}
		double temp = prices[i];
		prices[i] = prices[minIdx];
		prices[minIdx] = temp;
		}
		System.out.println("After: " + Arrays.toString(prices));
		}
}
