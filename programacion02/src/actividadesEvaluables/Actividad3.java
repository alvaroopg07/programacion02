package actividadesEvaluables;

public class Actividad3 {

	public static void main(String[] args) {
		System.out.println(digitosRec(6));    
        System.out.println(digitosRec(345)); 
	}
	
	public static int digitosRec(int n) {
		if (n>=0 && n<10) {
			return 1;
		}
		return 1 + digitosRec(n/10);
		
	}

}
