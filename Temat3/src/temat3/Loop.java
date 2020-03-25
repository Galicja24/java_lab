package temat3;

public class Loop {

	public static void main(String[] args) {
		
		int x = 10000;
		System.out.println("Loops application started!");
//		while (x < 123) {
//			x += 2;
//			System.out.println("Another loop iteration - variable value = " + x);
//		}
//		System.out.println("Loops application ended!");
//		
//		
//		do {
//			x += 2;
//			System.out.println("Another loop interation - loopcounter value = " + x);
//		} 
//		  while (x < 123);
//		System.out.println("Loops application ended!");
		
		for (int i = 0; i < x; i++) {
			if (i%10 != 0) {
				System.out.println("Another loop iteration - loop counter value = " + i);
				}
		if (i > 4999) {
				break;		
			}
			
		}
		System.out.println("Loops application ended!");
		
		
		

	}

}
