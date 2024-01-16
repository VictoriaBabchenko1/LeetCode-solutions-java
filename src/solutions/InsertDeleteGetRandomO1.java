package solutions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class InsertDeleteGetRandomO1 {
    class RandomizedSet {

        private final HashSet<Integer> set;
        private final Random random;

        public RandomizedSet() {
            set = new HashSet<>();
            random = new Random();
        }

        public boolean insert(int val) {
            return set.add(val);
        }

        public boolean remove(int val) {
            return set.remove(val);
        }

        public int getRandom() {
            int randomIndex = random.nextInt(set.size());

            Iterator<Integer> iterator = set.iterator();
            for (int i = 0; i < randomIndex; i++) {
                iterator.next();
            }

            return iterator.next();
        }
    }
}
