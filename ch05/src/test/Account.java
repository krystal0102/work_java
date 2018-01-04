package test;

public class Account {
	
	private String owner;
	private long balance;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public long deposit(long amount) {
		return this.balance += amount;
	}
	
	public long withdraw(long amount) {
		return this.balance -= amount;
	}
	
	public static void main(String[] args) {
		
		Account aaa = new Account("홍길동", 1000000);
		System.out.println("현재 잔액 : "+aaa.deposit(1500000));
		System.out.println("현재 잔액 : "+aaa.withdraw(5000));
		
	}

}
