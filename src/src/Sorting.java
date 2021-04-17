
public class Sorting{
	
	public static void printArray(int x[]){

		for(int i=0;i<x.length;i++){
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}

	public static void heapsort(int[] x){
		int i, parent, child;

		if(x.length == 0)
			return;
		
		// preprocessing phase; create initial heap
		for(i = 1; i < x.length; i++){
			int elt = x[i];
			// pqInsert(x, i, elt)
			// bubble_up
			child = i;
			parent = (child - 1)/2;
			while(child > 0 && x[parent] < elt){
				x[child] = x[parent];
				child = parent;
				parent = (child - 1)/2;
			}
			x[child] = elt;
		}

		System.out.print("Initial heap: \t");
		printArray(x);
		
		// selection phase; repeatedly remove x[0], insert it
		// in its proper position and adjust the heap
		for(i = x.length-1; i > 0; i--){
			// pqMaxDelete(x, i+1)
			// bubble-down

			System.out.print("i=" + i + "  x[i]=" + x[i] + "\t"); printArray(x);
			
			//put x[0] in i-th position
			int iValue = x[i];
			x[i] = x[0];
			
			parent = 0;
			
			//select the large child
			// child = largeChild(0, i-1)
			if(i == 1)
				child = -1;
			else
				child = 1;
			if(i > 2 && x[2] > x[1])
				child = 2;
			while(child >= 0 && iValue < x[child]){
				
				//move child into parent position
				x[parent] = x[child];
				parent = child;
				
				/////// child = largeChild(parent, i-1)				
				child = 2*parent + 1; //first child index
				
				if(child > i-1)  //no child
					break;
				
				//if there is a second child and it is larger
				if(child + 1 <= i-1 && x[child] < x[child+1])
					child = child + 1;  //get second child 				
			}
			x[parent] = iValue;
		}
		System.out.print("\t\t"); printArray(x);
		
	} // end heapsort

		
	public static void main(String args[]){
		int b[] = {75, 3, 4, 83, 51, 45, 67, 72, 11, 78	};       //new int[10];
		int i;

		System.out.print("Numbers:\n");
//		for(i=0; i < b.length; i++){
//			b[i] = new Integer((int)(Math.random()*100));
//		}
		printArray(b);
		
		heapsort(b);
		System.out.println("\nSorted numbers using Heap sort:");
		printArray(b);
		}

}