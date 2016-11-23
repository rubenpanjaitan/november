package net.myinfosys.novembertraining.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = 1; i <= 5; i++){
			queue.add(i);
		}
		//before
		System.out.println("before\n"+queue.toString());
		
		while(!(queue.isEmpty())){
			queue.remove();
		}
		//after
		System.out.println("after\n"+queue.toString());
		
		//priorityQueue
		
	}

}
