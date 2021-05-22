
class TestTax {

	public static void main(String[] args) {
		
		NJTax t = new NJTax();
		
		t.grossIncome = 50000;
		t.dependents = 2;
		t.state = "NJ";
		
		double yourTax = t.calcTax();
		double totalTax = t.adjustForStudents(yourTax);
		
		System.out.println("Your adjusted tax is " + totalTax);
	}
}
