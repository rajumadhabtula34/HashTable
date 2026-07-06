public class HashTableMain {

    public static void main(String[] args) {

        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        MyHashTable<String, Integer> hashTable = new MyHashTable<>();

        String[] words = paragraph.toLowerCase().split(" ");

        for (String word : words) {
            hashTable.add(word, 1);
        }

        System.out.println("Before Removal");

        hashTable.printFrequency();

        hashTable.remove("avoidable");

        System.out.println("\nAfter Removal");

        hashTable.printFrequency();
    }
}