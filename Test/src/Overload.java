class Main1{
	
	void salary(int amount){
		System.out.println("Salary 1 is : "+amount);
	}
	
	void salary(int amount,int tax){
		int total=amount+tax;
		System.out.println("Salary 2 is : "+total);
	}
}

public class Overload
{
 public static void main(String[] args) {
	 Main1 m = new Main1();
	 m.salary(1200);
	 m.salary(12000, 300);
}
}
