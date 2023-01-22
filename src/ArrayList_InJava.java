import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_InJava {
// In Array List only objects can be stored.
// It is created inside heap.
/* Operations:
1. Add
2. Get
3. Modify
4. Delete / Remove
5. Iterate / Other operations
 */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Add Elements:
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //Get Elements:
        int element = list.get(0);
        System.out.println(element);

        //Add Element In Between:
        list.add(1, 1);
        System.out.println(list);

        //Set Element:
        list.set(0,5);
        System.out.println(list);

        //Delete Element:
        list.remove(3);
        System.out.println(list);

        //Size:
        int size = list.size();
        System.out.println(size);

        //Loops:
        for(int i =0;i<list .size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //Sorting:
        Collections.sort(list);
        System.out.println(list);
    }
}

