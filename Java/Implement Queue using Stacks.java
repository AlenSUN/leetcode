class MyQueue {
	private Stack<Integer> s = new Stack<>();
	private Stack<Integer> t = new Stack<>();

	// Push element x to the back of queue.
	public void push(int x) {
		s.push(x);
	}

	// Removes the element from in front of queue.
	public void pop() {
		while (s.size() > 1)
			t.push(s.pop());
		s.pop();
		while (!t.empty())
			s.push(t.pop());
	}

	// Get the front element.
	public int peek() {
		while (s.size() > 1)
			t.push(s.pop());
		int f = s.peek();
		while (!t.empty())
			s.push(t.pop());
		return f;
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return s.empty();
	}
}