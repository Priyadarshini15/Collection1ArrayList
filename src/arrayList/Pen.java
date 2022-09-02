package arrayList;

import java.util.ArrayList;

public class Pen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> penBrand =new ArrayList<>();
		penBrand.add("Camlin");
		penBrand.add("Reynolds");
		penBrand.add("Cello");
		penBrand.add("Doms");
		penBrand.add("Rorito");
		
		int max=0; String brand="";
		
		for(int i=0 ;i<penBrand.size(); i++){
		
			System.out.println(penBrand.get(i).charAt(i));
		}
						
			/*if(penBrand.get(i).length()>max) {
				max=penBrand.get(i).length();
				brand=penBrand.get(i);
				
			}
			
			//System.out.println(penBrand.get(i).charAt(penBrand.get(i).length()-1));
		}
		//System.out.println(brand);
		
		 
		
		/*for(String brands : penBrand) {
			System.out.println(brands);
		}*/
		//penBrand.forEach(p->System.out.println(p));
	}

}
