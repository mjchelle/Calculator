package Calculator;

public class IllegalInputException extends CalculatorException{
	private String exceptionType;
	public IllegalInputException() {}
	
	public IllegalInputException(String message) {
		if (message.equals("l"))
			this.exceptionType = "Illegal Token Length";
		if (message.equals("a"))
			this.exceptionType = "Illegal Argument";
		if (message.equals("o"))
			this.exceptionType = "Illegal Operator";
	}
	
	public String getType() {
		return this.exceptionType;
	}

}
