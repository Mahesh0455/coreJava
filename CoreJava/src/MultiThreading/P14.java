package MultiThreading;

public class P14 {
	
	public static void main(String[] args) {
		
		Account acc=new Account();
		
		T14 t1=new T14(acc);
		t1.start();
		T14 t2=new T14(acc);
		t2.start();
		T14 t3=new T14(acc);
		t3.start();
		
		
		
	}

}


class Account{
	
	private static double balance=100.0;
	
	
	
	public double getBalance() {
		return balance;
	}
	
	public synchronized void minusBalance(double d) {
		
		if(balance < 0.0) {
			throw new InsufficientBalance("Balance is less than zero ");
		}else {
			balance=balance-d;
			System.out.println("Remaining Balance is: "+balance);
		}
		
	}
}

class T14 extends Thread{
	Account acc;
	
	T14(Account acc){
		this.acc=acc;
		
	}
	
	public void run() {
		
		acc.minusBalance(70.0);
		
	}
}


class InsufficientBalance extends RuntimeException {
	
	InsufficientBalance(String message){
		super(message);
	}
	
	
	
}
