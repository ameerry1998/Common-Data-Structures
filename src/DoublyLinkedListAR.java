
public class DoublyLinkedListAR<T> {
	private T data1;
	private DoublyLinkedListAR<T> next;
	private DoublyLinkedListAR<T> previous;
	private DoublyLinkedListAR<T> head;
	private DoublyLinkedListAR<T> tail;
	private int length;

	public DoublyLinkedListAR(T data) {
		this.data1 = data;
		this.next = null;
		this.previous = null;
		head = this;
		tail = this;
		length = 1;

	}

	public DoublyLinkedListAR<T> get_next() {
		return next;
	}

	public DoublyLinkedListAR<T> get_previous() {
		return previous;
	}

	public Object get_data() {
		return null;
	}
	
	public int get_length() {
		return length;
	}

	public void set_next(DoublyLinkedListAR<T> next) {
		if (next != null) {
			length += next.get_length();
			if (next.tail != null) {
				this.tail = next.tail;
				next.head = this.head;
			} else {
				this.tail = next;
				next.head =  this.head;
			}
		}
		next.previous = this;
		this.next = next;
	}

	public void set_previous(DoublyLinkedListAR<T> previous) {
		if (previous != null) {
			length += previous.get_length();
			if (previous.head != null) {
				head = previous.head;
				previous.tail = this.tail;
			} else {
				this.head = previous;
				previous.tail = this.tail;
			}
		}
		this.previous = previous;
	}

	public void set_data(T data) {
		this.data1 = data;
	}
	
	public void append(T data) {
		if(this.next == null) {
			DoublyLinkedListAR<T> appended = new DoublyLinkedListAR<T>(data);
			this.set_next(appended);
			appended.set_previous(this);
		}
		else {
			DoublyLinkedListAR<T> temp = this.next;
			DoublyLinkedListAR<T> appended = new DoublyLinkedListAR<T>(data);
			this.set_next(appended);
			appended.set_previous(this);
			appended.set_next(temp);
			temp.set_previous(appended);
			
		}
	}
	
	public String toString() {
		String str = "";
		DoublyLinkedListAR<T> node = this;
		while(node != null) {
			str += "[ " + node.data1.toString() + " ] -->";
			node = node.get_next();
		}
		//delete the last -->
		return str;
	}

}
