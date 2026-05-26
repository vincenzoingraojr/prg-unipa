import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class WordQueue {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Deque<String> q = new LinkedList<>();
		String w;
		
		while (true) {
			w = input.next();
			if(w.endsWith("."))
				break;
			else
				q.addFirst(w);
		}

		PriorityQueue<String> pq = new PriorityQueue<>(q);
		System.out.println(pq);
		
		try {
			while (true) {
				System.out.print(q.removeFirst() + " ");
			}
		} catch (NoSuchElementException exc) {
			System.out.println("\nFine della coda");
			exc.printStackTrace();
		}

		try {
			while (true) {
				System.out.print(pq.remove() + " ");
			}
		} catch (NoSuchElementException exc) {
			System.out.println("\nFine della coda");
			exc.printStackTrace();
		}

		input.close();
	}
}
		
		