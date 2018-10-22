
public class Client {

	public static void main(String[] args) {
		MyInteger obj1 = new MyInteger(2);
		MyInteger obj3 = new MyInteger(31);
		System.out.println(obj1.isPrime(obj3));
		System.out.println(obj1.isEven(obj3));
		System.out.println(obj1.isOdd(obj1));
		System.out.println(obj1.isOdd());
		System.out.println(obj1.equals(obj1));
		System.out.println(MyInteger.parseInt("5"));


	}

}
