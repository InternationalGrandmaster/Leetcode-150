import java.util.HashSet;

class Main {
    public static boolean containsDuplicate(int[] nums){
        // create a HashSet to store elements from the array
        HashSet<Integer> seenNumbers = new HashSet<Integer>();
        
        // Iterate through each element in the array
        for(int num : nums){
            // check if the element is already in the HashSet
            if(seenNumbers.contains(num)){
                return true; //duplicate found
            }
            // Add the element to the HashSet
            seenNumbers.add(num);
        }
        
        return false; // No duplicates found
    }
    public static void main(String[] args) {
        int[] arrUnique = { 1, 2, 3, 4, 5 };
        int[] arrDup = { 1, 4, 1, 7, 9};
        System.out.println(containsDuplicate(arrUnique)); // should be false
        System.out.println(containsDuplicate(arrDup)); // should be true
    }
}