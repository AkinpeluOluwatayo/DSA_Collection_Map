
import java.util.ArrayList;

    public class Map {

        public static class Entry {
            public int key;
            public int value;

            public Entry(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        public ArrayList<Entry> entries;

        public Map() {
            entries = new ArrayList<>();
        }

        public void put(int key, int value) {
            for (Entry entry : entries) {
                if (entry.key == key) {
                    entry.value = value;
                    return;
                }
            }
            entries.add(new Entry(key, value));
        }

        public Integer get(int key) {
            for (Entry entry : entries) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
            return null;
        }

        public boolean containsKey(int key) {
            for (Entry entry : entries) {
                if (entry.key == key) {
                    return true;
                }
            }
            return false;
        }

        public void remove(int key) {
            entries.removeIf(entry -> entry.key == key);
        }

        public int size() {
            return entries.size();
        }
    }


