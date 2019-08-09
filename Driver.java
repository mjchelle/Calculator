package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();
            if(Calculator.parseAndCompute(input)) {
            	break;
            }

        }

        // Close out the buffered reader
        br.close();
    }
}
