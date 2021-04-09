public class Testuser {
	public static void main(String args[]) {
		System.out.println(User.getWelcomeMessage());
		User user1 = new User("Bob", 12345);
		System.out.println(User.getWelcomeMessage());
		System.out.println(user1.getUsername());
		System.out.println(user1.validLogin("Bob",123));
		User user2 = new User("Karen" ,123);
		User.setDisplayNewest(false);
		System.out.println(User.getWelcomeMessage());
		System.out.println(user1.validLogin("Karen",123));
	} 
}