package base;


public class Main {
	public static void main(String[] args) {
		Node first = new Node(2);
		Node second = new Node(4);
		Node third = new Node(6);
		Node fourth = new Node(8);
		Node fifth = new Node(10);

		first.nextNode = second;
		second.nextNode = third;
		third.nextNode = fourth;
		fourth.nextNode = fifth;
	}
}
