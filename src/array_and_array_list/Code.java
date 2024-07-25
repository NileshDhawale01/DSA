package array_and_array_list;

import java.io.IOException;
import java.util.Scanner;

public class Code {

	public static void main(String[] args) throws IOException {
		
		Code code = new Code();
		code.cmdCommand();
	}
	
	public void cmdCommand() throws IOException {
		
		String command = "help";
		
		ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe","/c",command);
		processBuilder.redirectErrorStream(true);
		
		Process process = processBuilder.start();
		
		Scanner scanner = new Scanner(process.getInputStream()).useDelimiter("\\A");
		
		String output = scanner.hasNext()?scanner.next():"";
		
		System.out.println("Out put is :: "+output);
		
	}
}
