package dataStructuresFolder;

    public class HashMap {
        private int capacitySize = 10;
        private Entry[] capacity;
        private int size = 0;

        public HashMap() {
            capacity = new Entry[capacitySize];
        }

        private int hash(String key) {
            return Math.abs(key.hashCode() % capacitySize);
        }

        public int size() {
            return size;
        }

        public void put(String key, String value) {
            int index = hash(key);
            Entry currentElement = capacity[index];

            while (currentElement != null) {
                if (currentElement.key.equals(key)) {
                    currentElement.value = value;
                    return;
                }
                currentElement = currentElement.nextElement;
            }

            Entry newEntry = new Entry(key, value);
            newEntry.nextElement = capacity[index];
            capacity[index] = newEntry;
            size++;
        }

        public String get(String key) {
            int index = hash(key);
            Entry currentElement = capacity[index];

            while (currentElement != null) {
                if (currentElement.key.equals(key)) {
                    return currentElement.value;
                }
                currentElement = currentElement.nextElement;
            }

            return null;
        }

        public void printMap() {
            System.out.println("Map Contents:");
            for (int count = 0; count < capacitySize; count++) {
                Entry currentElement = capacity[count];
                while (currentElement != null) {
                    System.out.println(currentElement.key + " = " + currentElement.value);
                    currentElement = currentElement.nextElement;
                }

            }
        }
    }
