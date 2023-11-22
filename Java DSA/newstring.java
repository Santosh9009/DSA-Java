class newstring {
    static String names[] = { "Ankit", "Sham", "Ritesh", "Hitesh" };

    public static void main(String[] args) {
        int size = names.length;
        String temp = null;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (names[j].compareTo(names[i]) < 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
