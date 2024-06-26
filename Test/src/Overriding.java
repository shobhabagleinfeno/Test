class Main2{
	
	void salary(int amount){
		System.out.println("Salary is : "+amount);
	}
}

class child extends Main2{

	@Override
	void salary(int amount) {
		System.out.println("Salary is:"+amount);
	}
	
}

public class Overriding {
	public static void main(String[] args){
		Main2 m2=new Main2();
		m2.salary(12000);
		m2.salary(3000);
	}
}
