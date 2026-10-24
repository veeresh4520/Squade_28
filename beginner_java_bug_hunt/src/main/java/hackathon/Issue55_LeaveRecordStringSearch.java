public class Issue55_LeaveRecordStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A28", "B28", "C28"};
        String target = new String("B28");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
