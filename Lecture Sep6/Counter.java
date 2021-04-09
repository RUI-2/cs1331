class Counter {
	public int count = 0;
	Counter() {
		count = 0;
	}
	void click() {
	    count++;
	}
	int getCount() {
	    return count;
	}
}
public class CounterTest{
	public static void main(String args[]) {
	Counter counter1 = new Counter();
	Counter counter2 = new Counter();
	System.out.println(counter1.getCount());	
    }
}
		