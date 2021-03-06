package Ideas;

interface example{
	public void sleep();
	public void sound();
}

 class animal implements example{
	public void sleep(){
		System.out.println("refer");
		
	}
	
	public void sound(){
		System.out.println("refer1");
	}
 }
 class TestSuper1{
	 public void main(String[] args){
		 animal a = new animal ();
		 a.sleep();
		 
	 }
 }

