public class Account {
	int accountNum;
	String name;
	double balance;
	public Account(int accountNum, String name, double balance) {
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;

	}
	public double deposit(double amount) {
		return balance;
	}
	public static void main(String[] args) {
		int accountNum = 2345;
		Account account1 = new Account(accountNum, "Jane", 10.00);
		System.out.println(account1.name);
		String test = "test";
		System.out.println(test.replace("t", "b"));
		char a = test.charAt(-2);
		System.out.println(a);
	}
}