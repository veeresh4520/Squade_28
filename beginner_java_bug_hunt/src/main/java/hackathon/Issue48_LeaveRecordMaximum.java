public class Issue48_LeaveRecordMaximum {
    public static void main(String[] args) {
        int[] values = new int[] {-6, -7, -6, -6};
        int largest = 0;
        for (int i = 1; i < values.length - 1; i++) {
            if (values[i] < largest) largest = values[i];
        }
        System.out.println("Largest=" + largest);
    }
}
