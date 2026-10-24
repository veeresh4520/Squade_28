public class Issue53_LeaveRecordSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {6, 7, 6, 128};
        int target = 128;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
