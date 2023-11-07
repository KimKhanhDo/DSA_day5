package linked_list;

public class LinkedList {

	Node head;
	Node tail;
	int size;


	public int getValueAtIndex(int index) {
		if (size == 0) {
			System.out.println("List is empty");
			return -1;
		} else if (index < 0 || index >= size) {
			System.out.println("Out of range index");
			return -1;
		} else {
			Node temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp.data;
		}
	}

	public int getIndex(int value) {
		Node temp = head;
		int index = 0;

		while (temp != null) {
			if (temp.data == value) {
				return index;
			}
			temp = temp.next;
			index++;
		}

		return -1;
	}

	public void insertAt(int value, int position) {
		if (position < 0 || position > size) {
			System.out.println("Invalid position");
		}

		Node newNode = new Node(value);

		if (position == 0) {
			newNode.next = head;
			head = newNode;

			if (size == 0) {
				tail = newNode;
			}
		} else {
			Node temp = head;
			for (int i = 0; i < position - 1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;

			if (position == size) {
				tail = newNode;
			}
		}

		size++;

	}
}
