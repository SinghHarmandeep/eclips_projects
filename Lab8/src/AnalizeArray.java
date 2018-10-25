
public class AnalizeArray {
	
	int[] data;
	
	public AnalizeArray(int[] n) {
		data = n;
	}
	public AnalizeArray() {
		
	}
	MinMaxAv minmaxAv = new MinMaxAv();
	public void analyze() {
		System.out.println(minmaxAv.min());
		System.out.println(minmaxAv.max());
		System.out.println(minmaxAv.average());
	}
	
	
	public class MinMaxAv{ //inner classes
		public MinMaxAv(){
			
		}
		int min() {
			int min = 100;
			for(int x = 0; x < data.length; x++) {
				if(data[x]<min) {
					min =data[x];
				}
			}
			return min;
		}
		int max() {
			int max = 0;
			for(int x = 0; x<data.length; x++) {
				if(data[x]>max) {
					max = data[x];
				}
			}
			return max;
		}
		int average() {
			int average;
			int sum = 0;
			for(int x =0; x < data.length; x++) {
				sum = sum + data[x];
			}
			average = sum/data.length;
			return average;
		}
	}
}