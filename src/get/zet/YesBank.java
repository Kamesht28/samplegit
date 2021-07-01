package get.zet;

public class YesBank implements AmericaBank{

	@Override
	public void deposit() {
	System.out.println("deposit 15%");
	}

	@Override
	public void sav() {
		System.out.println("savings 12%");
	}
public static void main(String[] args) {
	YesBank y = new YesBank();
	y.deposit();
	y.sav();
}
}
