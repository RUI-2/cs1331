public class polymorphism{
	public static void main(String[] args) {
		// Sub1 a = new Sub1();
		// //((Sub1)a).func1();
		// if(a instanceof Base) {
		// 	System.out.println("is Base");
		// }
		// Base arr[] = new Base[5];
		// System.out.println(	arr[0]);
		// String a = "Lmao";
		// String b = a.substring(1,4);
		// System.out.println(	b);
		// boolean a = 
		// String a[] = new String[3];
		// System.out.println(a[0]);
		// String arr [][] = {{"A","B","C"},{"a","b","c"}};
		// System.out.println(arr[1][2]);
		int arr[][] = new int[10][];
		for (int i = 0; i < 10; i ++) {
			arr[i] = new int[5];
			for(int j = 0; j <5; j++) {
				arr[i][j] = j;
			}
		}


		Base a = new Sub1();
		Object o = new Object();
		Base b= new Base();
		a.fun2(b);
	}
}


class Base {
	void func1() {
		System.out.println("Hello from Base");
	}
	static void stats() {
		System.out.println("base static");
	}
	Base() {
		System.out.println("Base constructor");
	}
	public void fun2(Object o) {
		System.out.println("fun2 Obj");
	}
	// public void fun2(Base b) {
	// 	System.out.println("fun2 Base");
	// }
}

class Sub1 extends Base {
	void func1() {
		System.out.println("Hello from Sub1");
	}
	static void stats() {
		System.out.println("Sub1 static");
	}
	Sub1() {
		System.out.println(	"Sub1 constructor");
	}
}

class Sub2 extends Sub1 {

	static void stats() {
		System.out.println("Sub2 static");
	}
	Sub2() {
		System.out.println("Sub2 constructor");
	}
}