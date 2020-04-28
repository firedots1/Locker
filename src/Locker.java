public class Locker {
    public static void main (String args[]) {
        String[] lockers = new String[100];
        int num = lockers.length;
        for (int i = 0; i < num; i++) {
            lockers[i] = "Closed";
        }
        for (int i = 0; i < num; i++) {
            lockers[i] = "Open";
        }
        for (int i = 2; i <= num; i++) {
            for (int x = i - 1; x < num; x += i) {
                if (lockers[x].equals("Open")) {
                    lockers[x] = "Close";
                } else {
                    lockers[x] = "Open";
                }
            }
        }
        for (int i = 0; i < num; i++) {
            if (lockers[i].equals("Open")) {
                System.out.printf("Locker %d are Open ", (i + 1));
            }
        }
    }
}