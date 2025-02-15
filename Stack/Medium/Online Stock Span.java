import java.util.Stack;

class StockSpanner {
    private Stack<Pair<Integer, Integer>> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        
        while (!stack.isEmpty() && stack.peek().getKey() <= price) {
            span = span + stack.pop().getValue();
        }
        
        stack.push(new Pair<>(price, span));
        return span;
    }

    // Helper class to represent a pair of price and span
    private static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
