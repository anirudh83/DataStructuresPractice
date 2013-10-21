package com.anirudh.practise.Queues;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQueues {

	@Test
	public void testArrayQueue() {
		MyQueueArrayImpl<String> queue = new MyQueueArrayImpl<String>();
		testQueueOperations(queue);
	}

	private void testQueueOperations(MyQueue<String> queue) {
		queue.enqueue("first");
		queue.enqueue("second");
		assertEquals(2,queue.size());
		assertEquals("first",queue.dequeue());
	}
	
	@Test
	public void testLinkedListQueue(){
		MyQueueLinkedListImpl<String> queue = new MyQueueLinkedListImpl<String>();
		testQueueOperations(queue);
	}

}
