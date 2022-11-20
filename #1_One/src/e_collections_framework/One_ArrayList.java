package e_collections_framework;

import java.util.*;

public class One_ArrayList {
    public static void main(String[] args) {

        {
            ArrayList<Integer> ide = new ArrayList<Integer>();
            ide.add(44);
            ide.add(35);
            ide.add(1, 78);

            ArrayList<Integer> tx = new ArrayList<Integer>();
            tx.add(909);
            tx.add(78);

            ide.addAll(tx);
            System.out.println(ide.get(4));
            System.out.println(ide.indexOf(4));


            System.out.println("--->");
            for (int x : ide) {
                System.out.println(x);
            }
            System.out.println("-->");
            System.out.println(ide.toString());

            ide.sort(Comparator.naturalOrder());
            ide.sort(Comparator.reverseOrder());
        }


        {
            LinkedList<Integer> lts = new LinkedList<>();
            lts.add(43);
            lts.add(88);
            lts.add(90);
            lts.add(54);
            lts.add(11);
            lts.add(97);
            lts.add(1, 121);
            lts.addFirst(6656);
            lts.addFirst(554);
            lts.addLast(404);
            System.out.println("LinkedList -->\n\n\n");
            System.out.println("-->");
            for (int t : lts) {
                System.out.println(t);
            }
            System.out.println("--->");
            System.out.println(lts.toString());
        }


        // Is an array in which we can insert form both way
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // Hashing /--> Key value pair
        HashMap<Integer,String> hm = new HashMap<>();

        HashSet<Integer> hs = new HashSet<>();


    }
}
