public class TowerOfHanoi {
    public static void main(String[] args) {
        int numDiscs = 3; // Change this to the number of discs you want to use
        towerOfHanoi(numDiscs, 'A', 'C', 'B');
    }

    public static void towerOfHanoi(int numDiscs, char source, char destination, char auxiliary) {
        if (numDiscs == 1) {
            System.out.println("Move disc 1 from " + source + " to " + destination);
            return;
        }
        
        // Move (numDiscs-1) discs from source to auxiliary peg using destination as the auxiliary peg
        towerOfHanoi(numDiscs - 1, source, auxiliary, destination);
        
        // Move the nth disc from source to destination
        System.out.println("Move disc " + numDiscs + " from " + source + " to " + destination);
        
        // Move the (numDiscs-1) discs from auxiliary peg to destination using source as the auxiliary peg
        towerOfHanoi(numDiscs - 1, auxiliary, destination, source);
    }
}
