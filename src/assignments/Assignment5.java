package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {
	
			
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	 // create a map (key,value ) pair for first row of the table		 
	 Map<String ,String > strow1= new HashMap<String, String>();
	 strow1.put("Name", "John doe");
	 strow1.put("Age", "Twenty");
	 strow1.put("Gender", "Male");
	 strow1.put("RollNumber", "SBA12345");
	 strow1.put("Grade", "A++");
	 strow1.put("Major", "Computer Science");
	 strow1.put("GPA", "A3.8");
	 strow1.put("Email", "john@example.com");
	 strow1.put("PAN Number", "SDF6543210");
	 strow1.put("Address", "123 Elm St");
	 
	// create a map (key,value ) pair for second row of the table
	 Map<String , String> strow2= new HashMap<String, String>();
	 strow2.put("Name", "Jane Smith");
	 strow2.put("Age", "Twenty One");
	 strow2.put("Gender", "Female");
	 strow2.put("RollNumber", "SBA12346");
	 strow2.put("Grade", "B+");
	 strow2.put("Major", "Mathematics");
	 strow2.put("GPA", "A3.5");
	 strow2.put("Email", "jane@example.com");
	 strow2.put("PAN Number", "REW6543211");
	 strow2.put("Address", "456 Oak St");
	 
	// create a map (key,value ) pair for third row of the table
	 Map<String , String> strow3= new HashMap<String, String>();
	 strow3.put("Name", "Mike Brown");
	 strow3.put("Age", "Twenty Two");
	 strow3.put("Gender", "Male");
	 strow3.put("RollNumber", "SBA12347");
	 strow3.put("Grade", "A+");
	 strow3.put("Major", "Physics");
	 strow3.put("GPA", "A3.9");
	 strow3.put("Email", "mike@example.com");
	 strow3.put("PAN Number", "TYR6543212");
	 strow3.put("Address", "789 Pine St");
	 
	 
	 
	 List<Map<String, String>>studentTable=new ArrayList<Map<String,String>>();
	 studentTable.add(strow1);
	 studentTable.add(strow2);
	 studentTable.add(strow3);
	 
	 
	// create a map (key,value ) pair for first row of the table
			 Map<String ,String > pdrow1= new HashMap<String, String>();
			 pdrow1.put("Product ID", "P001");
			 pdrow1.put("Name", "Laptop");
			 pdrow1.put("Category", "Electronics");
			 pdrow1.put("Price", "12K Pounds");
			 pdrow1.put("Stock Quantity", "Not Available");
			 pdrow1.put("Supplier", "Tech Supplies");
			 pdrow1.put("Warranty", "2 years");
			 pdrow1.put("Rating", "4.5 Stars");
			 pdrow1.put("Manufacturing Date", "Aug 2023");
			 pdrow1.put("Expiry Date", "Aug 2028");
			 
			// create a map (key,value ) pair for second row of the table
			 Map<String ,String > pdrow2= new HashMap<String, String>();
			 pdrow2.put("Product ID", "P002");
			 pdrow2.put("Name", "Desk Chair");
			 pdrow2.put("Category", "Furniture");
			 pdrow2.put("Price", "150K Pounds");
			 pdrow2.put("Stock Quantity", "Two");
			 pdrow2.put("Supplier", "Office Depot");
			 pdrow2.put("Warranty", "1 year");
			 pdrow2.put("Rating", "4 Stars");
			 pdrow2.put("Manufacturing Date", "Sep 2024");
			 pdrow2.put("Expiry Date", "N/A");
			 
			// create a map (key,value ) pair for third row of the table		 
			 Map<String ,String > pdrow3= new HashMap<String, String>();
			 pdrow3.put("Product ID", "P003");
			 pdrow3.put("Name", "Coffee Maker");
			 pdrow3.put("Category", "Kitchen");
			 pdrow3.put("Price", "75 Pounds ");
			 pdrow3.put("Stock Quantity", "Two Hundred");
			 pdrow3.put("Supplier", "KitchenWorld");
			 pdrow3.put("Warranty", "6 months");
			 pdrow3.put("Rating", "4.2 Stars");
			 pdrow3.put("Manufacturing Date", "Jan 2025");
			 pdrow3.put("Expiry Date", "Jan 2027");
			 
			 List<Map<String, String>> productTable= new ArrayList<Map<String,String>>();
			 productTable.add(pdrow1);
			 productTable.add(pdrow2);
			 productTable.add(pdrow3);
			 
			// create a map (key,value ) pair for first row of the table
				Map<String, String> erow1=new HashMap<String, String>();
				erow1.put("Employee ID", "E001");
				erow1.put("Name", "Alice Green");
				erow1.put("Age", "Thirty");
				erow1.put("Gender", "Female");
				erow1.put("Department", "Engineering");
				erow1.put("Position", "Software Engineer");
				erow1.put("Salary", "75K Pounds");
				erow1.put("Email", "alice@example.com");
				erow1.put("PAN Number", "SDF6543210");
				
				// create a map (key,value ) pair for second row of the table
				Map<String, String> erow2=new HashMap<String, String>();
				erow2.put("Employee ID", "E002");
				erow2.put("Name", "Bob Johnson");
				erow2.put("Age", "Thirty Five");
				erow2.put("Gender", "Male");
				erow2.put("Department", "Marketing");
				erow2.put("Position", "Marketing Manager");
				erow2.put("Salary", "85K Pounds");
				erow2.put("Email", "bob@example.com");
				erow2.put("PAN Number", "REW6543211");
				
				// create a map (key,value ) pair for third row of the table
				Map<String, String> erow3=new HashMap<String, String>();
				erow3.put("Employee ID", "E003");
				erow3.put("Name", "Carol White");
				erow3.put("Age", "Twenty Eight");
				erow3.put("Gender", "Female");
				erow3.put("Department", "Sales");
				erow3.put("Position", "Sales Executive");
				erow3.put("Salary", "65K Pounds");
				erow3.put("Email", "carol@example.com");
				erow3.put("PAN Number", "TYR6543212");
				
				List<Map<String, String>>employeeTable=new ArrayList<Map<String,String>>();
				employeeTable.add(erow1);
				employeeTable.add(erow2);
				employeeTable.add(erow3);
				//System.out.println(employeeList);
				
				Map<String, List<Map<String, String>>> linkUp= new HashMap<String, List<Map<String,String>>>();
				linkUp.put("studentDetails", studentTable);
				linkUp.put("ProductDetails", productTable);
				linkUp.put("employeeDetail", employeeTable);
				
				System.out.println("Product table  Supplier name is :" +linkUp.get("ProductDetails").get(1).get("Supplier"));
		
		
		
	}

}
