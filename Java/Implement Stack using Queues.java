class MyStack {
	private Queue<Integer> q = new LinkedList<>();
	private Queue<Integer> t = new LinkedList<>();

	// Push element x onto stack.
	public void push(int x) {
		q.add(x);
	}

	// Removes the element on top of the stack.
	public void pop() {
		while (q.size() > 1)
			t.add(q.remove());
		q.remove();
		Queue<Integer> x = q;
		q = t;
		t = x;
	}

	// Get the top element.
	public int top() {
		while (q.size() > 1)
			t.add(q.remove());
		int top = q.element();
		t.add(q.remove());
		while (!t.isEmpty())
			q.add(t.remove());
		return top;
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return q.isEmpty();
	}
}