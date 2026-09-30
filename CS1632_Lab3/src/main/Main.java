package main;

import java.util.Scanner;

public class Main {
    private static Node head = null;
    private static Node tail = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Doubly Linked List CLI ===");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Node (to end)");
            System.out.println("2. Search Value");
            System.out.println("3. Print Forward");
            System.out.println("4. Print Reverse");
            System.out.println("5. Exit");
            System.out.print(">  ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add:\n>  ");
                    int valueToAdd = sc.nextInt();
                    addNode(valueToAdd);
                    System.out.println("Added " + valueToAdd + " to the list.");
                    break;

                case 2:
                    System.out.print("Enter value to search:\n>  ");
                    int valueToSearch = sc.nextInt();
                    int position = searchNode(valueToSearch);
                    if (position != -1) {
                        System.out.println("Value " + valueToSearch + " found at 0-based index: " + position);
                    } else {
                        System.out.println("Value " + valueToSearch + " not found in the list.");
                    }
                    break;

                case 3:
                    printForward();
                    break;

                case 4:
                    printReverse();
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Adds a new node to the end of the list and updates head/tail references
    private static void addNode(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Searches for a value and returns its 0-based index position (-1 if not found)
    private static int searchNode(int value) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == value) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    // Prints forward from head to tail
    private static void printForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Forward: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // Prints backward from tail to head
    private static void printReverse() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Reverse: ");
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.prev != null) {
                System.out.print(" <-> ");
            }
            temp = temp.prev;
        }
        System.out.println();
    }
}