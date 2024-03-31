class Node 
{
    int data;
    Node next;

    public Node(int data) 
	{
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList 
{
    private Node head;

    public CircularLinkedList() 
	{
        this.head = null;
    }

    public void insert(int data) 
	{
        Node newNode = new Node(data);
        if (head == null) 
		{
            head = newNode;
            newNode.next = head; // Make it circular
        } 
		else 
		{
            Node current = head;
            while (current.next != head) 
			{
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head; // Make it circular
        }
        System.out.println(data + " inserted successfully.");
    }

    public void delete(int data) 
	{
        if (head == null) 
		{
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        Node current = head;
        Node prev = null;

        // Find the node to be deleted
        do {
            if (current.data == data) 
			{
                break;
            }
            prev = current;
            current = current.next;
        } 
		while (current != head);

        if (current == head) 
		{
            // Node to be deleted is the head
            if (current.next == head) 
			{
                head = null; // The only node in the list
            } else 
			{
                head = current.next;
                prev.next = head;
            }
        } 
		else 
		{
            // Node to be deleted is not the head
            prev.next = current.next;
        }

        System.out.println(data + " deleted successfully.");
    }

    public void displayList() 
	{
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node current = head;
            System.out.print("List elements: ");
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }
}

public class CircularLinkedListExample 
{
    public static void main(String[] args) 
	{
        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.displayList();

        list.delete(20);

        list.displayList();
    }
}