package sam.out;

import java.sql.Savepoint;

public class Money implements Iob{

	@Override
	public void deposit() {
		System.out.println("deposit 12%");
		
	}

	@Override
	public void sav() {
		System.out.println("savings 14%");
		
	}
	private void Sav() {
		System.out.println("savings 14%");
	
	}
	public static void main(String[] args) {
		Money m = new Money();
		m.deposit();
		m.sav();
				
	}
}
