package day19;

public class Hsbc  implements Bank{

	
	public static void main(String[] args) {
		Hsbc h=new Hsbc();
		h.debit();
		
		System.out.println(minBalance);
		
	}
	
	public void debit() {
		System.out.println("debiting process");
	}
	
	public void credit() {
		System.out.println("credit procedure");
		
	}

	public void moneyTransfer() {
		System.out.println("Money transfer policy");
	}

}
