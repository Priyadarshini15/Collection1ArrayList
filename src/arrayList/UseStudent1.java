package arrayList;

import java.util.ArrayList;

public class UseStudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1("Pri",23,201,19000,false);
		Student1 s2=new Student1("Jaya",40,202,50000,false);
		Student1 s3=new Student1("Pradha",35,203,45000,false);
		Student1 s4=new Student1("Ram",22,204,15000,true);
     	Student1 s5=new Student1("Deepak",17,205,35000,true);
     	
     	ArrayList<Student1> studentDetails=new ArrayList<>();
     	studentDetails.add(s1);
     	studentDetails.add(s2);
     	studentDetails.add(s3);
     	studentDetails.add(s4);
     	studentDetails.add(s5);
    
     	
     	/*ArrayList<Student1> idList =new ArrayList<>();
     	for(Student1 s:studentDetails) {
     		if(s.getId()>=202 && s.getId()<=205) {
     			idList.add(s);
     			System.out.println((s));
     		}
     	}*/
     	
     	ArrayList<Student1> maxAge =new ArrayList<>();
     	for(Student1 s :studentDetails) {
     		if(s.getAge()<30) {
     			maxAge.add(s);
     			System.out.println(s);
     		}
     	}
     
     	
     	/*ArrayList<Student1> maxNameLength =new ArrayList<>();
     	for(Student1 s :studentDetails) {
     		if(s.getName().length()>3) {
     			maxNameLength.add(s);
     		}
     	}
     	maxNameLength.forEach(x->System.out.println(x));
     	     	
     	
     	ArrayList<Student1> femaleList =new ArrayList<>();
     	 for(Student1 s : studentDetails) {
     	   if(s.getIsMale() == false) {
     		  femaleList.add(s);	
     		}
     	}
     	femaleList.forEach(x->System.out.println(x));
     	
     	 
     	ArrayList<Student1> moreFees=new ArrayList<>();
     	for(Student1 s : studentDetails) {
     		if(s.getFees()>20000) {
     	       moreFees.add(s);
     		}
     	}
         moreFees.forEach(x->System.out.println(x));
         
     	
          int min =studentDetails.get(0).getName().length();
    	    for(int i=0; i<studentDetails.size(); i++) {
     		   if(studentDetails.get(i).getName().length()<min) {
     			  min=studentDetails.get(i).getName().length();
     			  System.out.println(studentDetails.get(i));
     		   }
     	   }
     	   System.out.println(min);
     	   
    
     		for(int i=0; i<studentDetails.size(); i++){	
     		   if(studentDetails.get(i).getName().startsWith("P")) {
     			  System.out.println(studentDetails.get(i));
     		}
     		
     		
     		for(int i=0; i<studentDetails.size(); i++)
     		      if(studentDetails.get(i).getAge()>18) {
     			    System.out.println(studentDetails.get(i).getName());
     		}
     		}
     		
     		
     		System.out.println(studentDetails.get(i).getName());
	    
     
        
     	
     	for(Student1 s : studentDetails) {
	            System.out.println(s.getName());
         }*/
         //studentDetails.forEach(s -> System.out.println(s));

	}

}
