public class Person{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public Person(Person p) {
		this.name = p.name;
	}
	public static void main(String[] args) {
		Person p = new Person("Harry");
		Person p2 = new Person(p);
		System.out.println(p.name);
		System.out.println(p2.name);
		p2.name = "Ron";
		System.out.println(p.name);
	}
}