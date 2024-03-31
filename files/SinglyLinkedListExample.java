import java.util.Scanner;
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

class SinglyLinkedList 
{
    private Node head;

    public SinglyLinkedList() 
	{
        this.head = null;
    }

    public void insert(int data) 
	{
        Node newNode = new Node(data);
        if (head == null) 
		{
            head = newNode;
        } 
		else 
		{
            Node current = head;
            while (current.next != null) 
			{
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println(data + " inserted successfully.");
    }

    public void delete(int data) 
	{
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (head.data == data) 
		{
            head = head.next;
            System.out.println(data + " deleted successfully.");
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.data != data) 
		{
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println(data + " not found in the list. Cannot delete.");
        } else {
            prev.next = current.next;
            System.out.println(data + " deleted successfully.");
        }
    }

    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node current = head;
            System.out.print("List elements: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

public class SinglyLinkedListExample 
{
    public static void main(String[] args) 
	{
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.displayList();

        list.delete(20);

        list.displayList();
    }
}