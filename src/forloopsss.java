
public class forloopsss {

	public static void main(String[] args) {
		
		for(int a=0;a<=5;a++) {
			for(int b=0;b<=7;b++) {
				if(a==0||b==3) {
					System.out.print(" + ");
				}else {
					System.out.print("   ");
				}
				
			}
			System.out.println();	
		

	}
		for(int c=0;c<7;c++){
			for(int h=0;h<7;h++) {
				if(h==0||h==6||c==3) {
					System.out.print(" + ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
			}
		for(int d=0;d<7;d++) {
			for(int x=0;x<7;x++) {
				if(x==(3-d)||x==3+d) {`
					System.out.print(" * ");
				}else {
					System.out.print("   ");
					
				}
			}
			System.out.println();
		}
		}
}
