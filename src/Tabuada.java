
public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tabuada.tabuada(8);
		
		
	}
	
	//
	public static void tabuada(int tabuadaDo) {
		System.out.printf("+-tabuado do "+tabuadaDo+"-+\n");
		for(int i= 1; i <=10; i++) {
			System.out.printf("| %2d X %d = %2d  |\n", i, tabuadaDo, tabuadaDo*i);
		}
		System.out.printf("+--------------+");
	}

}
