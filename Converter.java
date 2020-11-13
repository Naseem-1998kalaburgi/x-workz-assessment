public class Converter{
	
	
	public static void main(String[] values)
	{
		
		System.out.println("JVM invoked main");
		System.out.println("The Program will convert string to number");
		
		String noOfClasses="12";
		byte convertedToByte=Byte.parseByte(noOfClasses);
		System.out.println("converted to Byte : "+convertedToByte);
		
		String marksObtaind="562";
		short convertedToShort=Short.parseShort(marksObtaind);
		System.out.println("converted to short : "+convertedToShort);
		
		
		String salary="62457";
		int convertedSalary=Integer.parseInt(salary);
		System.out.println("converted to int : "+convertedSalary);
		
		String mobileNO="9865432123";
		long convertedToLong=Long.parseLong(mobileNO);
		System.out.println("converted mobileNO into long : "+convertedToLong);
		
		String percentage="98.5";
		float convertedToFloat=Float.parseFloat(percentage);
		System.out.println("converted percentage into float: "+convertedToFloat);
		
		String fuel="876.876";
		double convertedToDouble=Double.parseDouble(fuel);
		System.out.println("converted fuel into double: "+convertedToDouble+ "Ltrs");
		
		
		String javaIsObjectOriented="true";
		boolean convertedToBoolean=Boolean.parseBoolean(javaIsObjectOriented);
		System.out.println("javaIsObjectOriented : "+convertedToBoolean);
		
		
		
		
		
		
		System.out.println("EXIT :: main");
					
	}
	
	
}