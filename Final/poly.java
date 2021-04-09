public class poly{
	public static void main(String[] args) {
		//Base b =new Base();
		Base s1 = new Sub2();
		//Sub2 s2 = new Sub2();
		///System.out.println(b.rating);
		// System.out.println(s1.rating);
		// System.out.println(s1.getRating());
		//System.out.println(s2.rating);
		if(s1 instanceof Sub1) {
			System.out.println("yes");
		}
	}
}

class Base {
	public int rating = 25;
	public Base() {
		rating = 25;
	}
	public int getRating() {
		return rating;
	}
}

class Sub1 extends Base{
	public int rating;
	public Sub1() {

		rating = 50;
		//System.out.println(super.rating);
	}
	public int getRating() {
		return rating;
	}
}

class Sub2 extends Sub1{
	//public int rating;
	public Sub2() {
		//rating = 75;
	}
}