import java.util.Scanner;

public class TowerOfHanoi 
{
	public static void solveTowerOfHanoi(int n, char source, char destination, char auxiliary) 
	{
        if (n == 1) 
		{
            System.out.println("Move disc 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 discs from source to auxiliary peg using destination as the auxiliary peg
        solveTowerOfHanoi(n - 1, source, auxiliary, destination);

        // Move the nth disc from source to destination
        System.out.println("Move disc " + n + " from " + source + " to " + destination);

        // Move the n-1 discs from auxiliary peg to destination peg using source as the auxiliary peg
        solveTowerOfHanoi(n - 1, auxiliary, destination, source);
    }
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of discs: ");
        int numberOfDiscs = scanner.nextInt();
        System.out.println("Steps to solve the Tower of Hanoi with " + numberOfDiscs + " discs:");
        solveTowerOfHanoi(numberOfDiscs, 'A', 'C', 'B');
        scanner.close();
    }

    
}