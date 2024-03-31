import java.util.Scanner;

class CircularQueue 
{
    private int front, rear, size;
    private int[] queue;

    public CircularQueue(int size) 
	{
        this.size = size;
        this.front = this.rear = -1;
        this.queue = new int[size];
    }

    public boolean isFull() 
	{
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }

    public boolean isEmpty() 
	{
        return front == -1;
    }

    public void enqueue(int data) 
	{
        if (isFull()) 
		{
            System.out.println("Queue is full. Cannot enqueue.");
        } 
		else 
		{
            if (front == -1) 
			{
                front = 0;
            }
            rear = (rear + 1) % size;
            queue[rear] = data;
            System.out.println(data + " enqueued successfully.");
        }
    }

    public void dequeue() 
	{
        if (isEmpty()) 
		{
            System.out.println("Queue is empty. Cannot dequeue.");
        } 
		else 
		{
            int dequeuedData = queue[front];
            System.out.println(dequeuedData + " dequeued successfully.");

            if (front == rear) 
			{
                // Last element in the queue, reset front and rear
                front = rear = -1;
            } 
			else 
			{
                front = (front + 1) % size;
            }
        }
    }

    public void displayQueue() 
	{
        if (isEmpty()) 
		{
            System.out.println("Queue is empty.");
        } 
		else 
		{
            System.out.print("Queue elements: ");
            int i = front;
            do 
			{
                System.out.print(queue[i] + " ");
                i = (i + 1) % size;
            } 
			while (i != (rear + 1) % size);
            System.out.println();
        }
    }
}

public class CircularQueueExample 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the circular queue: ");
        int size = scanner.nextInt();
        CircularQueue circularQueue = new CircularQueue(size);

        while (true) 
		{
            System.out.println("1. Enqueue (Insert)  2. Dequeue (Remove)  3. Display  4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) 
			{
                case 1:
                    System.out.print("Enter the data to enqueue: ");
                    int data = scanner.nextInt();
                    circularQueue.enqueue(data);
                    break;
                case 2:
                    circularQueue.dequeue();
                    break;
                case 3:
                    circularQueue.displayQueue();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}