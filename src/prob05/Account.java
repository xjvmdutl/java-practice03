package prob05;

public class Account {
	private static String accountNo;
	private static int balance;
	public Account(String a) {
		accountNo=a;
		balance=0;
	}
	public void save(int s) {
		balance +=s;
	}
	public void deposit(int d) {
		balance-=d;
	}
	public static String getAccountNo(){
		return accountNo;
	}
	public static int getBalance() {
		return balance;
	}
}
