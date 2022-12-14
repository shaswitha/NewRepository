package practice;

public class ifelsecondition {

	public static void main(String[] args) {
		displayDesignation(2);   

	}

	static void displayDesignation(int experience)
	{
		if (experience <= 3) 
		{
			System.out.println("I am working as Junior Level Software Engineer");

			System.out.println();
		}
		else if (experience <= 6)
		{
			System.out.println("I am working as Software Engineer");
		} 
		else if (experience <= 9)
		{
			System.out.println("I am working as Senior Level Software Engineer");
		} 
		else
		{
			System.out.println("I am working as Manager");
		}
	}

}
