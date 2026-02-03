import java.util.Objects;

public class ArrayQueue<E> implements QueueADT<E> {
    private final E[] data;
    private int front = 0;
    private int rear = 0;

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("capacity must be > 0");
        this.data = (E[]) new Object[capacity + 1];
    }

    @Override
    public int size() {
        return (rear - front + data.length) % data.length;
    }

    @Override
    public boolean isEmpty() {
       return front == rear;
    }

    private boolean isFull() {
        return (rear + 1) % data.length == front;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[front];
    }

    @Override
    public void enqueue(E e) {
        Objects.requireNonNull(e, "Null elements are not supported in this assignment.");
        if (isFull()) throw new IllegalStateException("Queue is full");
        
        data[rear] = e;
        rear = (rear + 1) % data.length;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null;
        E answer = data[front];
        data[front] = null; 
        front = (front + 1) % data.length; // Move front past the removed element
        return answer;
    }
    int capacity() { 
        return data.length - 1; 
    }
}
