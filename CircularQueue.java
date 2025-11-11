public class CircularQueue {
    int[] queue;
	int front, rear, size, capacity;
	CircularQueue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
		front = size = 0;
		rear = capacity - 1;
		}
		boolean isFull() { 
            return size == capacity; 
        }
		boolean isEmpty() { 
            return size == 0; 
        }
		void enqueue(int item) {
			if (isFull()) {
				System.out.println("Queue is full");
				return;
			}
			rear = (rear + 1) % capacity;
			queue[rear] = item;
			size++;
			display();
		}
		void dequeue() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return;
			}
			front = (front + 1) % capacity;
			size--;
			display();
		}
		void display() {
			System.out.print("Queue: ");
			for (int i = 0; i < size; i++) {
				System.out.print(queue[(front + i) % capacity] + " ");
			}
			System.out.println();
		}
		public static void main(String[] args) {
			CircularQueue q = new CircularQueue(3);
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(30);
			q.dequeue();
			q.enqueue(40);
		}
}
