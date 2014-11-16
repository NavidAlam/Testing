package uk.ac.cam.na417.examples;

class PrimitiveInt {
	public static void main (String [] args) {
				
		int a = 5;	 		//assignment operator task
		int b = 8;
		a = b;	  			//assigning a the value of b
		System.out.println(a);

		int j = 10;
		System.out.println(j--);	//will print 10
		System.out.println(j);		//will print 9

		int x = 0x55; 
		x = x >> 4;
		System.out.println(x);

		int y = 0x55;
		y = y << 7;
		System.out.println(y);

		int z = 0x10;
		System.out.println(z);

		System.out.println(is5thBitSet(33));
		System.out.println(is5thBitSet(31));
		System.out.println(is5thBitSet(53));
		System.out.println(is5thBitSet(64));
	}

	static int is5thBitSet(int i)  
	{
		return (0x10 & i) >> 4 ;
	}
	
	
		
}
