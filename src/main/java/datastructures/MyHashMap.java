package datastructures;

public class MyHashMap {
    private static final int CAPACITY = 10000;
    private ListNode[] buckets;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        buckets = new ListNode[CAPACITY];
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int index = getIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new ListNode(-1, -1); // Create a dummy node
        }
        ListNode prev = findPrev(buckets[index], key);
        if (prev.next == null) {
            prev.next = new ListNode(key, value);
        } else {
            prev.next.val = value;
        }
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int index = getIndex(key);
        if (buckets[index] == null) {
            return -1;
        }
        ListNode prev = findPrev(buckets[index], key);
        if (prev.next == null) {
            return -1;
        }
        return prev.next.val;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int index = getIndex(key);
        if (buckets[index] == null) {
            return;
        }
        ListNode prev = findPrev(buckets[index], key);
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }

    private int getIndex(int key) {
        return Integer.hashCode(key) % CAPACITY;
    }

    private ListNode findPrev(ListNode bucket, int key) {
        ListNode current = bucket;
        ListNode prev = null;
        while (current != null && current.key != key) {
            prev = current;
            current = current.next;
        }
        return prev;
    }

    private class ListNode {
        int key;
        int val;
        ListNode next;

        public ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
