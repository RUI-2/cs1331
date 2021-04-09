public class TestBar {
	public static void main(String[] args) {
		Bar bar1 = new Bar("toffee", 5, 5);
		System.out.println(bar1.getPerimeter());
		System.out.println(bar1.getArea());
		System.out.println(bar1.isSquare());
		System.out.println(bar1.calculateCost(5,5));
		System.out.println(bar1.getDetails());
		bar1.drawBar();
		System.out.println("");
		Bar bar2 = new Bar("diABeTEs", 4, 6);
		System.out.println(bar2.getPerimeter());
		System.out.println(bar2.getArea());
		System.out.println(bar2.isSquare());
		System.out.println(bar2.calculateCost(5,10));
		System.out.println(bar2.getDetails());
		bar2.drawBar();
		System.out.println("");
		Bar bar3 = new Bar("oneBiteOfRegret", 12, 14);
		System.out.println(bar3.getPerimeter());
		System.out.println(bar3.getArea());
		System.out.println(bar3.isSquare());
		System.out.println(bar3.calculateCost(2,2));
		System.out.println(bar3.getDetails());
		bar3.drawBar();
		System.out.println("");
		Bar bar4 = new Bar("moreInsulin", 2, 10);
		System.out.println(bar4.getPerimeter());
		System.out.println(bar4.getArea());
		System.out.println(bar4.isSquare());
		System.out.println(bar4.calculateCost(7,8));
		System.out.println(bar4.getDetails());
		bar4.drawBar();
		System.out.println("");
		Bar bar5 = new Bar("fortune", 15, 7);
		System.out.println(bar5.getPerimeter());
		System.out.println(bar5.getArea());
		System.out.println(bar5.isSquare());
		System.out.println(bar5.calculateCost(6,4));
		System.out.println(bar5.getDetails());
		bar5.drawBar();
	}
}