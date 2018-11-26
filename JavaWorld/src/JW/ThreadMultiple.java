package JW;

public class ThreadMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread t1 = new Thread() {
		
		public void run() {
			for(int i = 0; i<1; i++) {
				
				try {
					sleep(2000);
					test();
					ThreadMultiple ts = new ThreadMultiple(1);
					ts.display();
					
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	};
	
	t1.start();
	
	
	
	

}
	
	public static void test() {
		System.out.println("test");
	}
	
    int testno;
    ThreadMultiple(int testno){
    	this.testno = testno;
    }
    
    void display() {
    	System.out.println(testno);
    }
}
