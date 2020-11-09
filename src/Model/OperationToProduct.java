package Model;

import java.io.*;
import java.util.LinkedList;

public class OperationToProduct {

    //  Search index of element of product in Linked list, if not found then return-1
    public int index(Product p, DoublyLinkedList<Product> list) {

        return -1;
    }

    //Create a product have:(ID, name, quantity, price) that input from keyboard
    public Product createProduct(String id, String name, int quantity, double price) {
        return new Product(id, name, quantity, price);
    }

    // Write all product of Linked List to file
    public void writeAllItemsToFile(String fileName, DoublyLinkedList<Product> list) {
        for (int i = 0; i < list.size(); i++) {
            try {
                FileOutputStream fileOut = new FileOutputStream(fileName);
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
                objectOut.writeObject(list.getAt(i));
                objectOut.close();
                System.out.println("The Object  was successfully written to a file");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    // Read all products from file and save to Linked List ( Insert at tail of Linked List), information of a product in a line (
    public void getAllItemsFromFile(String fileName, DoublyLinkedList<Product> list) {
        boolean cont = true;
        while (cont) {
            try {
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream input = new ObjectInputStream(fis);
                Product product = (Product) input.readObject();
                if (product != null) {
                    list.add(product);
                } else {
                    cont = false;
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void getAllItemsFromFile(String fileName, MyStack<Product> stack) {

    }

    public void getAllItemsFromFile(String fileName, MyQueue<Product> queue) {

    }


    // Add a new product into tail of Linked List
    public void addLast(DoublyLinkedList<Product> list, Product product) {
        list.addLast(product);
    }

    // Add new product to head of Linked list
    public void addFirst(DoublyLinkedList<Product> list, Product product) {
        list.addFirst(product);
    }

    // Display information of all product on Linked list
    public void displayAll(DoublyLinkedList<Product> list) {
        list.printData(list);
    }

    // Search first element by ID
    public void searchByCode(DoublyLinkedList<Product> list, String key) {

    }

    // Delete first element by ID (=ID)
    public void deleteByCode(DoublyLinkedList<Product> list, String key) {
        boolean isExist = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.getAt(i).productID.equals(key)) {
                list.removeAt(i);
                isExist = true;
                System.out.println("Delete success!");
            }
        }
        if(!isExist){
          System.out.println(key + " is not exist in database");
        }
    }

// Sort by ID
    public void sortByCode(DoublyLinkedList<Product> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.getAt(i).productID.compareTo(list.getAt(j).productID)>0) {
                    Product temp = list.getAt(i);
                    list.getAt(i) = list.getAt(j);
                    names[j] = temp;
                }
            }
        }
    }

    // Convert to binary
    public void convertBinary(int i) {

    }

    //Delete element at position k
    public void deletePosition(DoublyLinkedList<Product> list, int index) {
        list.removeAt(index);
    }

}


