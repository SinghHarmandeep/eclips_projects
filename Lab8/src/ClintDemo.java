
public class ClintDemo {

	public static void main(String[] args) {
		int[] array = {7,3,4,2,6,1,5};
		AnalizeArray obj1 = new AnalizeArray(array);
		obj1.analyze();
		System.out.println(obj1.minmaxAv.average());
	}
}