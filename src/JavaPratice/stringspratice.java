package JavaPratice;

public class stringspratice {  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int c=0; c<6;c++) {
			for(int d=0; d<6;d++) {
				if(d>=(5-c)) {
					System.out.print(" 0 ");
				}
				else 
					System.out.print("   ");
				}
			
			System.out.println();
		
	}
		System.out.println();
		for(int a=6; a>0;a--) {
			for(int b=0; b<a;b++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		for(int a=0; a<7;a++) {
			for(int b=0; b<a;b++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int c=0; c<6;c++) {
			for(int d=0; d<6;d++) {
				if(d>=c) {
					System.out.print(" * ");
				}
				else 
					System.out.print("   ");
				}
			
			System.out.println();
		
	}
		System.out.println();
		for(int c=0; c<6;c++) {
			for(int d=0; d<6;d++) {
				if(d==c || d== (6-c)) {
					System.out.print(" * ");
				}
				else 
					System.out.print("   ");
				}
			
			System.out.println();
		
	}
		System.out.println();
		for(int c=0; c<7;c++) {
			for(int d=0; d<7;d++) {
				if(d==c || d==(6-c)) System.out.print("   ");
				else System.out.print(" 0 ");
			
			}
			System.out.println();
		}		
			System.out.println();
		
			System.out.println();
			for(int c=0; c<9;c++) {
				for(int d=0; d<9;d++) {
					if(d==c || d==(8-c)|| c==4 || d==4) System.out.print("   ");
					else System.out.print(" V ");
				
				}
				System.out.println();
			}		
				System.out.println();
	
}}
