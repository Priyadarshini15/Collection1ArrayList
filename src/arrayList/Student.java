package arrayList;

import java.util.ArrayList;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> rollNo =new ArrayList<>();
		rollNo.add(101);
		rollNo.add(102);
		rollNo.add(103);
		rollNo.add(104);
		rollNo.set(2, 200);
		rollNo.remove(3);
		/*for(int i=0; i<rollNo.size(); i++) {
			System.out.println(rollNo.get(i));
		}*/
		for(Integer num :rollNo) {
			System.out.println(num);
		}
		

	}

}
