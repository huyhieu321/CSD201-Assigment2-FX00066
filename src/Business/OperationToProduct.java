package Business;

import Model.Product;

public class OperationToProduct {

    //  Search index of element of product in Linked list, if not found then return-1
    public int index(Product p, MyList<Product> list) {

        return -1;
    }

    //Create a product have:(ID, name, quantity, price) that input from keyboard
    public Product createProduct(String id, String name, int quantity, double price) {
        return new Product(id, name, quantity, price);
    }

    // Read all products from file and save to Linked List ( Insert at tail of Linked List), information of a product in a line (
    public void getAllItemsFromFile(String fileName, MyList<Product> list) {

    }

    public void getAllItemsFromFile(String fileName, MyStack<Product> stack) {

    }

    public void getAllItemsFromFile(String fileName, MyQueue<Product> queue) {

    }


    // Add a new product into tail of Linked List
    public void addLast(MyList<Product> list, Product product) {

    }

    // Display information of all product on Linked list
    public void displayAll(MyList<Product> list) {


    }

    // Write all product of Linked List to file
    public void writeAllItemsToFile(String fileName, MyList<Product> list) {

    }

    // Search first element by ID
    public void searchByCode(MyList<Product> list, String key) {


    }

    // Delete first element by ID (=ID)
    public void deleteByCode(MyList<Product> list, String key) {

    }

// Sort by ID

    public void sortByCode(MyList<Product> list) {

    }

    // Add new product to head of Linked list
    public void addFirst(MyList<Product> list) {

    }

    // Convert to binary
    public void convertBinary(int i) {

    }

    //Delete element at position k
    public void deletePosition(MyList<Product> list) {


    }

}


