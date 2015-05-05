package DuplicateElementsInSets;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInSets {

    public static void main(String[] args) {
        Set<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        Set<Integer> B = new HashSet<Integer>();
        B.add(4);
        B.add(5);
        B.add(6);
        Set<Integer> C = new HashSet<Integer>();
        C.add(5);
        C.add(6);
        C.add(7);
        C.add(8);
        System.out.println(duplicateSet(A, B, C).toString());

    }

    @SafeVarargs
    public static Set<Integer> duplicateSet(Set<Integer>... sets) {

        Set<Integer> set = sets[0];
        for (int i = 1; i < sets.length; i++) {
            set.retainAll(sets[i]);
        }
        return set;
    }
}
