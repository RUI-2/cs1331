public class TestPuppy {
	public static void main(String[] args) {
		Puppy dog = new Puppy("Doggo");
		Puppy cat = new Puppy("Catty?");
		System.out.println(dog);
		System.out.print(cat);
		System.out.println(dog.canAdopt());
		dog.fetch();
		System.out.println(dog);
		dog.fetch(true);
		System.out.println(dog);
		dog.fetch(25);
		System.out.println(dog);
		Puppy dog2 = new Puppy("Superior Race", 35, 80);
		System.out.println(dog2.canAdopt());
	}
}