import java.util.*;

class Job {
    int id;
    String name;
    int pages;
    Job(int id, String name, int pages) {
        this.id = id;
        this.name = name;
        this.pages = pages;
    }
    public String toString() {
        return "[JobID:" + id + " " + name + " Pages:" + pages + "]";
    }
}

public class PrintJobProcessing {
    Queue<Job> queue = new LinkedList<>();
	void enqueue(Job j) {
	queue.add(j);
	System.out.println("Enqueued: " + j);
	}
	void processJobs() {
	while (!queue.isEmpty()) {
	Job j = queue.poll();
	System.out.println("Processing " + j);
	for (int i = 1; i <= j.pages; i++) {
	System.out.println(" Printing page " + i);
	}
	System.out.println("Completed " + j);
	}
	}
	public static void main(String[] args) {
	PrintJobProcessing p = new PrintJobProcessing();
	p.enqueue(new Job(1, "Doc1", 3));
	p.enqueue(new Job(2, "Doc2", 2));
	p.processJobs();
	}
}
