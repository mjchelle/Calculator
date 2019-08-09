package Calculator;





public class Calculator {
    public Calculator(){
        // Constructor does nothing
    }


    public static int compute(String[] tokens) throws CalculatorException{
        // Condition on the number of tokens
    	String s;
    	int n;
        switch(tokens.length){
            case 0:
            	throw new IllegalInputException("l");

            case 1:
            	if (tokens[0].toLowerCase().equals("quit"))
                	throw new QuitException();
            	throw new IllegalInputException("a");
            	
            case 2:
            	try {
                n = Integer.parseInt(tokens[1]);
            	} catch (NumberFormatException e) {
            		throw new IllegalInputException("a");
            	}
                if (tokens[0].equals(("-")))
                	return -1*n;
                throw new IllegalInputException("o");
                

            case 3:
                s = tokens[1];
                if (s.equals("+")) {
                	try {
                		return Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[2]);
                	} catch (NumberFormatException e) {
                		throw new IllegalInputException("a");
                	}
                }
                if (s.equals("/")) {
                	try {
                		return Integer.parseInt(tokens[0]) / Integer.parseInt(tokens[2]);
                	} catch (NumberFormatException e) {
                		throw new IllegalInputException("a");
                	} catch (ArithmeticException e) {
                		throw new DivideByZeroException();
                	}
                }
                
                try {
                	Integer.parseInt(tokens[0]);
                } catch (NumberFormatException e) {
                	throw new IllegalInputException("a");
                }
                
                try {
                	Integer.parseInt(tokens[2]);
                } catch (NumberFormatException e) {
                	throw new IllegalInputException("a");
                }
                
                throw new IllegalInputException("o");
                
                
                                	

            default:
                throw new IllegalInputException("l");
        }

    }

    
    
    
    public static boolean parseAndCompute(String input){
    	boolean b = false;
        String[] tokens = input.split(" ");
        try {
            System.out.println("The result is: " + compute(tokens));
        }
        catch (QuitException e){
            System.out.println("Quitting");
            b = true;
        }
        catch (IllegalInputException e){
            System.out.println("Illegal input: " +  e.getType());
        }
        catch (CalculatorException e){
            System.out.println("Tried to divide by zero");
        }
        finally {
        	
        System.out.println("Input was: " + input);
        }
        
        return b;
    }
}

	
	


