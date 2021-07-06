package ExeListas;

public class Question2 {
	public static void main(String[] args) {
		StaticStack<Integer> stackInt = new StaticStack<Integer>(8);
		Queue<Integer> queueInt = new StaticQieue<Integer>(2);
		try {
			for(int i= 10, j= 0; i> -3; i--, j++) {
				queueInt.enqueue(j-i);
				stackInt.push(queueInt.dequeue());
				queueInt.enqueue(stackInt.pop()*-1);
			}
		}catch(UnderflowException e) {
			e.printStackTrace();
		}catch(OverflowException e) {
			e.printStackTrace();
		}
		StaticQieue<String> queueStr = new StaticQieue<String>(stackInt.numElements()+queueInt.numElements());
		while(!stackInt.isEmpty())
			while(!queueInt.isEmpty())
				queueStr.enqueue(stackInt.pop()+ " - "+queueInt.dequeue());
		System.out.println(queueStr);
		
		
		int[] x={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

	      A(x, x.length-1);
	      
	      int a = 0;
	      int b = 4;
	      int d = 0;
	      
	      
	      try { 

	    	  d = a / b; 

	    	  System.out.print("0"); 

	    	  } catch (ArithmeticException ae) { 

	    	  System.out.print("1"); 

	    	  } catch (Exception e) { 

	    	  System.out.print("2"); 

	    	  } finally { 

	    	  System.out.print("0"); 

	    	  }
		
		
	}
	
	public static void A(int[] v, int i){

        if(i > -1){

            if(i % 2 != 0) A(v, i-1);

            else {

                System.out.println(v[i]);

                A(v, i-2);

            }

        }

    }
	

}
