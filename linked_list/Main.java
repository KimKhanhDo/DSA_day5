package linked_list;

public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		
		list.insertAt(10, 0); 
		list.insertAt(20, 1); 
		list.insertAt(30, 2); 
		list.insertAt(40, 3); 
		list.insertAt(50, 4); 
		list.insertAt(60, 5);

	
		int valueAtIndex = list.getValueAtIndex(1); 
		System.out.println("Value at index 1: " + valueAtIndex);

		
		int indexForValue = list.getIndex(30); 
		System.out.println("Index of value 30: " + indexForValue);


		
		for (int i = 0; i < list.size; i++) {
			System.out.print(list.getValueAtIndex(i) + " ");
		}
	}
}
