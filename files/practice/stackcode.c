#include <stdio.h>

#define MAXSIZE 5

int stack[MAXSIZE], top = -1;

void push();
void pop();
void display();

int main() {
    int choice;

    do {
        printf("\n------------Stack---------\n");
        printf("1. Push\n2. Pop\n3. Display\n4. Exit\n");
        printf("--------------------------\n");
        printf("Enter Your Choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: push(); break;
            case 2: pop(); break;
            case 3: display(); break;
            case 4: break;
            default: printf("Invalid Choice\n");
        }
    } while (choice != 4);

    printf("Exiting program.\n");
    return 0;
}

void push() {
    int n;
    if (top == MAXSIZE - 1) {
        printf("\nStack Overflow\n");
    } else {
        printf("Enter an Element: ");
        scanf("%d", &n);
        stack[++top] = n;
        printf("Pushed element: %d\n", n);
    }
}

void pop() {
    if (top == -1) {
        printf("Stack Underflow\n");
    } else {
        printf("Popped element: %d\n", stack[top--]);
    }
}

void display() {
    if (top == -1) {
        printf("Stack is empty\n");
    } else {
        printf("Elements of stack:\n");
        for (int i = top; i >= 0; i--)
            printf("%d\n", stack[i]);
    }
}
