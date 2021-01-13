import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoublyLinkedListARTest {


	@Test
	void test() {
		DoublyLinkedListAR<String> First = new DoublyLinkedListAR<String>("hi");
		First.append("two");
		for(int i=0; i<5;i++) {
			First.append(String.valueOf(i));
		}
		System.out.println(First);
	}

}
