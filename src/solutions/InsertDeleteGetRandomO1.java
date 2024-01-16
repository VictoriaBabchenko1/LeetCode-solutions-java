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
            if(set.contains(val)) {
                return false;
            }
            else {
                set.add(val);
                return true;
            }
        }

        public boolean remove(int val) {
            if(set.contains(val)) {
                set.remove(val);
                return true;
            }
            else {
                return false;
            }
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
