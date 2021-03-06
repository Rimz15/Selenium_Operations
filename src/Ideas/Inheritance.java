package Ideas;

class sum1{
	static int x;
	static int y;
	void set(int r,int j){
		x=r;
		y=j;
	}
}
	
	class sum2 extends sum1{
		static int total;
		static void sum(){
			total=x+y;
		}
	}
	
	public class Inheritance{
		public static void main(String[] args){
			sum2 ob = new sum2();
			ob.set(10, 15);
			ob.sum();
			System.out.println(ob.total);
		}
	}

