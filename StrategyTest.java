interface Strategy {
	public void sort(int abc[]);
}
class BubbleSort implements Strategy {

	@Override
	public void sort(int[] abc) {
		// TODO Auto-generated method stub
		System.out.println("Bubble Sort coding");
	}

}
class InsertionSort implements Strategy{

	@Override
	public void sort(int[] abc) {
		// TODO Auto-generated method stub
		System.out.println("Insertion sort coding...");
	}

}
class MergeSort implements Strategy {

	@Override
	public void sort(int[] abc) {
		// TODO Auto-generated method stub
		System.out.println("Merge Sort coding...");
	}

}
class QuickSort implements Strategy {

	@Override
	public void sort(int[] abc) {
		// TODO Auto-generated method stub
		System.out.println("Quick Sort coding...");
	}

}
class Context {
	private Strategy strategy;
	Context(Strategy str) {
		strategy = str;	
	}
	public void arrange(int num[]) {
		strategy.sort(num);
	}
}

public class StrategyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={5,3,6,8,2};
		Context mergeSort = new Context(new MergeSort());
		mergeSort.arrange(num);
		Context bubbleSort = new Context(new BubbleSort());
		bubbleSort.arrange(num);
		Context quickSort = new Context(new QuickSort());
		quickSort.arrange(num);
	}

}
