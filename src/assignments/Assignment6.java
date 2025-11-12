package assignments;

public class Assignment6 {

	public static void main(String[] args) {
		String[] name = { "Suresh","Mahesh", "Naresh"};
		int[] marks = { 75,80,82};
		
		//Add 10 to eac mark and store in array
		int a = marks[0];
		int b = marks[1];
		int c = marks[2];
		
		int[] increase = { 
				a = a += 10,
				b =  b += 10,
				c = c += 10 
		};
		
		System.out.println ("Updated marks:" );
		System.out.println(name[0] + ":" + increase[0]);
		System.out.println(name[1] + ":" + increase[1]);
		System.out.println(name[2] + ":" + increase[2]);
		
		float Average = ( a+b+c)/3;
		System.out.println ("Average marks:" +Average);
		
		
		

			}
}


