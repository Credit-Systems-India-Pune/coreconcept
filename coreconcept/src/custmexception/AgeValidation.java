package custmexception;

public class AgeValidation {

	void validate(int age) throws AgeBar{
			if(age>18)
		{
			System.out.println("u can vote");
		}
		else
		{
			throw new AgeBar("sorry,\n u can not vote");
		}
	}

	public static void main(String[] args) throws AgeBar  {
		AgeValidation ag=new AgeValidation();
		ag.validate(13);
		
		
	}

}

