package New;

public class Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OS s = new OS();
		// Test number 1
		String filename = "Ahmad", resultFileName = "result_Ahmad";
		int number_of_process = 100;
		s.Simulation(filename, resultFileName, number_of_process);
		// Test number 2
		filename = "Ahmad1";
		resultFileName = "result_Ahmad1";
		number_of_process = 50;
		s.Simulation(filename, resultFileName, number_of_process);
	}

}
