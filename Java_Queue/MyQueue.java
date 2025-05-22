class MyQueue {
    int[] arr;
    int front;
    int rear;
    int maxSize;
    int currSize;

    MyQueue() {
        maxSize = 10; 
        arr = new int[maxSize];
        front = rear = currSize = 0;
    }

    MyQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = 0;
        rear = 0;
        currSize = 0;
    }

    void push(int x) {
        if (currSize == maxSize) {
            System.out.println("Queue already full...");
        } else {
            arr[rear] = x;
            rear = (rear + 1) % maxSize; 
            currSize++;
        }
    }

    int pop() {
        if (currSize == 0) {
            System.out.println("Queue is empty...");
            return -1; 
        } else {
            int x = arr[front];
            front = (front + 1) % maxSize; 
            currSize--;
            return x;
        }
    }
    public static void main(String[] args) {
    MyQueue queue = new MyQueue(5); // Create a queue with maximum size 5

    // Add elements to the queue
    queue.push(1);
    queue.push(2);
    queue.push(3);
    queue.push(4);
    queue.push(5);

    // Try to add an element to a full queue
    queue.push(6);

    // Remove and print elements from the queue
    System.out.println("Popped element: " + queue.pop()); // Output: 1
    System.out.println("Popped element: " + queue.pop()); // Output: 2
    System.out.println("Popped element: " + queue.pop()); // Output: 3
    System.out.println("Popped element: " + queue.pop()); // Output: 4
    System.out.println("Popped element: " + queue.pop()); // Output: 5

    // Try to remove an element from an empty queue
    System.out.println("Popped element: " + queue.pop()); // Output: -1 (error)
}
}