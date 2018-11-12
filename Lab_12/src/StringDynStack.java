
public class StringDynStack implements StringStack {

	private
	int top;
	private String[] data;

	/**
	 * @param cap
	 * <p> is the size of the array
	 */
	public StringDynStack(int cap) {
		data = new String[cap]; //setting the size
		top = -1;
	}

	@Override
	public String pop() {
		if (empty()) {
			System.out.println("Stack is empty");
			return null;
		}
		else
		return data[top--];
	}

	@Override
	public void push(String x) {
		if (size()==data.length) {
			System.out.println("Stack is full");
		}
		else
			data[++top]= x;
		
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	@Override
	public int size() {
		return top+1;
	}
	
	@Override
	public String toString() {
		String x = "The floowing names are in the stack: ";
		for (int i = 0; i <= top; i++) { // make sure i is less then or equal to top. Because top could be 0 when data has only one elemnet
			x = x + data[i
			             ] + "-->";
		}
		return x;//return all the data
	}
	
}
