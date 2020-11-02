package View;


import Model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean isArrayEmpty = true;
        boolean keepRunning = true;
        OperationToProduct operation = new OperationToProduct();
        DoublyLinkedList<Product> productMyList = new DoublyLinkedList<>();
        MyStack<Product> productMyStack = new MyStack<>();
        MyQueue<Product> productMyQueue = new MyQueue<>();
        while (keepRunning) {
            // menu
            System.out.println("\n-------------- Product list --------------");
            System.out.println("\t1 - Load data from file and display");
            System.out.println("\t2 - Input & add to the end");
            System.out.println("\t3 - Display data");
            System.out.println("\t4 - Save product list to file");
            System.out.println("\t5 - Search by ID");
            System.out.println("\t6 - Delete by ID");
            System.out.println("\t7 - Sort by ID");
            System.out.println("\t8 - Convert to Binary");
            System.out.println("\t9 - Load to stack and display");
            System.out.println("\t10- Load to queue and display");
            System.out.println("\t0 - Exit");
            System.out.print("Enter your choice (1, 2, 3..., 8, 9, 10 or 0): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    operation.getAllItemsFromFile("product", productMyList);
                    break;

                case 2:
                    String productName;
                    String productId;
                    int productQuantity;
                    double productPrice;
                    boolean isEmptyId = true;
                    System.out.print("Input Product ID (Require):");
                    productId = scanner.nextLine();
                    System.out.print("Input Product Name:");
                    productName = scanner.nextLine();
                    System.out.print("Input Product Quantity");
                    productQuantity = scanner.nextInt();
                    System.out.print("Input Product Price");
                    productPrice = scanner.nextDouble();
                    // Add product add last of list product
                    operation.addLast(productMyList, operation.createProduct(productId, productName, productQuantity, productPrice));
                    System.out.println("Success add new product");
                    break;

                case 3:
                    operation.displayAll(productMyList);
                    break;

                case 4:
                    operation.writeAllItemsToFile("Filename", productMyList);
                    break;

                case 5:
                    operation.searchByCode(productMyList, "");
                    break;

                case 6:
                    operation.deleteByCode(productMyList, "");
                    break;

                case 7:
                    operation.sortByCode(productMyList);
                    break;

                case 8:
                    operation.convertBinary(0);
                    break;

                case 9:
                    operation.getAllItemsFromFile("", productMyStack);
                    break;

                case 10:
                    operation.getAllItemsFromFile("", productMyQueue);
                    break;
                default:
                    keepRunning = false;
            }
        }
        scanner.close();

    }

}
