package sam.out;

public class Sbi extends Hdfc{

	@Override
	public void deposit() {
		System.out.println("deposite 10%");
		
	}
@Override
public void tax() {
	super.tax();
}
public static void main(String[] args) {
Sbi s = new Sbi();
s.deposit();
s.tax();
}
}
