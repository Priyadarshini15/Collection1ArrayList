package arrayList;

import java.util.ArrayList;
import java.util.List;

public class UseProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	    ArrayList <Programmer> employees =new ArrayList<>();
	   employees.add(new Programmer("Priya","Developer","Java",false)); 
	   employees.add(new Programmer("Ravi","Developer","Java",true));
	   employees.add(new Programmer("Jaya","Developer","Java",false));
	   employees.add(new Programmer("Deepak","Engineer","Python",true));
	   employees.add(new Programmer("Ram","Engineer","Python",true));
	   employees.add(new Programmer("Rekha","Engineer","Python",false));
	   employees.add(new Programmer("Divya","Designer","C#",false));
	   employees.add(new Programmer("Surya","Designer","C#",true));
	   employees.add(new Programmer("Raj","Designer","C#",true));
	   
	   List<Programmer> devops=new ArrayList<>();
	   List<Programmer> engineer=new ArrayList<>();
	   List<Programmer> designer=new ArrayList<>();
	   
	   for(Programmer p :employees) {
		   if(p.getRole().equalsIgnoreCase("Engineer")) {
			   engineer.add(p);
			   
		   }
		   else if(p.getRole().equalsIgnoreCase("Designer")) {
			   designer.add(p);
		   }
		   else if(p.getRole().equalsIgnoreCase("Developer")) {
			   devops.add(p);
		   }
	   }
	   System.out.println("Devops");
	   devops.forEach(x->System.out.println(x));
	   System.out.println("Engineer");
	   engineer.forEach(x->System.out.println(x));
	   System.out.println("Designer");
	   designer.forEach(x->System.out.println(x));
	   
	}

}
