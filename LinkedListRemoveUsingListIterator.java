import java.util.*;

public class LinkedListRemoveUsingListIterator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        // Input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original List: " + list);

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        // -------- FORWARD DELETION (delete next element) --------
        LinkedList<Integer> forwardList = new LinkedList<>(list);
        ListIterator<Integer> it = forwardList.listIterator();

        boolean foundForward = false;

        while (it.hasNext()) {
            int value = it.next();

            if (value == target) {
                if (it.hasNext()) {
                    it.next();   // move to next element
                    it.remove(); // delete that element
                }
                foundForward = true;
                break;
            }
        }

        if (foundForward)
            System.out.println("After Forward Deletion: " + forwardList);
        else
            System.out.println("Target not found for Forward Deletion");

        // -------- BACKWARD DELETION (delete previous element) --------
        LinkedList<Integer> backwardList = new LinkedList<>(list);
        ListIterator<Integer> it2 = backwardList.listIterator();

        boolean foundBackward = false;

        while (it2.hasNext()) {
            int value = it2.next();

            if (value == target) {
                if (it2.hasPrevious()) {
                    it2.previous(); // go back to target
                    if (it2.hasPrevious()) {
                        it2.previous(); // move to previous element
                        it2.remove();   // delete it
                    }
                }
                foundBackward = true;
                break;
            }
        }

        if (foundBackward)
            System.out.println("After Backward Deletion: " + backwardList);
        else
            System.out.println("Target not found for Backward Deletion");

        sc.close();
    }
}