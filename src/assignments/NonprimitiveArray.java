package assignments;

public class NonprimitiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String[] semseternames = {
				"Sem1",
				"Sem2",
				"Sem3",
				"Sem4",
				"Sem5",
				
		};
		
		String[][] subjectnames = {
		{"Mathematics I","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Eng"},
		{"Mathematics II","Mechanics","EnvironmentalSci.","Basic Electronics","Engineering Physics","Engineering Graphics"},
		{"Data Structures","Discrete Mathematics","DigitalElectronics","Operating Systems","Signals and Systems","Object-Oriented Prog."},
		{"Algorithms","ComputerNetworks","Databasesystems","Microprocessors","Communication Eng.","Software Engineering"},
		{"Probability&Stats","MachineLearning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"},
		};
		
		String[][][] marks = new String[5][6][6];
		//Sem1 Marks
		marks[0][0][0] = "Pass(78)";
		marks[0][1][1] = "Pass(85)";
		marks[0][2][2] = "Fail(21)";
		marks[0][3][3] = "Pass(74)";
		marks[0][4][4] = "Pass(88)";
		marks[0][5][5] = "Pass(79)";
		
		//Sem4 Marks
		marks[3][0][0] = "Pass(91)";
		marks[3][1][1] = "Pass(73)";
		marks[3][2][2] = "Fail(19)";
		marks[3][3][3] = "Pass(80)";
		marks[3][4][4] = "Pass(76)";
		marks[3][5][5] = "Pass(87)";
		
		//From the array:
	// Print Semester 2 Subject 4 and Subject 5 names.
		
		System.out.println("Semester 2 Subject 4 and Subject 5 names:" + subjectnames[1][3]
				+ " and "  + subjectnames[1][4]);
		
		// Print the Status/Marks of Semester 4 Subject 3 and Subject 6.	
		
		System.out.println("Status/Marks of Semester 4 Subject 3 and Subject 6 is " + marks[3][2][2] 
				+ " and " + marks[3][5][5] );

	}

}
