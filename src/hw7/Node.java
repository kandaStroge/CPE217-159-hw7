package hw7;

public class Node {
    double price;
    int investorID;
    int amount;
    long timestamp; // Heap.push() is the only function that modify this variable
    boolean isMinHeap;
    public Node(double price, int investorID, int amount, boolean isMinHeap){
        this.price = price;
        this.investorID = investorID;
        this.amount = amount;
        this.isMinHeap = isMinHeap;
    }
    
    // return true if Priority(thisNode) > Priority(rightNode) and vice versa
    // minHeap: the lower the price, the higher the priority and vice versa
    // maxHeap: the lower the price, the lower the priority and vice versa
    //
    // You may create your own function if you do not understand my code
    public boolean compare(Node rightNode){
        if (this.price == rightNode.price) {
            return true; // FIX THIS
        }else{
            if (isMinHeap){
                return true; // FIX THIS
            }else{
                return false; // FIX THIS
            }
        }
    }
}
