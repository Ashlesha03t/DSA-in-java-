import java.util.*;
class Order {
	int id;
	String name;
	Order(int id, String name) {
		this.id = id;
		this.name = name;
	 	}
		public String toString() {
		return "[OrderID:" + id + " " + name + "]";
	}
}

public class FIFOOrderProcessing {
    Queue<Order> queue = new LinkedList<>();
	void placeOrder(int id, String name) {
	    queue.add(new Order(id, name));
	    System.out.println("Placed -> " + name);
	    display();
	}
	void serveOrder() {
	    if (!queue.isEmpty()) {
	    Order o = queue.poll();
	    System.out.println("Served -> " + o);
	    } else {
	    System.out.println("No orders to serve");
	    }
	    display();
	    }
	    void display() {
	        System.out.println("Current Queue: " + queue);
	    }
	    public static void main(String[] args) {
	    FIFOOrderProcessing f = new FIFOOrderProcessing();
	    f.placeOrder(1, "Pizza");
	    f.placeOrder(2, "Burger");
	    f.serveOrder();
	}
}
