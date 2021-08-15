import java.util.ArrayList;

public class Set
{
    public static void findIntersection (ArrayList<Integer> L1, ArrayList<Integer> L2, ArrayList<Integer> L3)
    {
        for (int i = 0; i < L1.size(); i++)
        {
            int x = L1.get(i);
            if (isFound(x, L2))
            {
                L3.add(x);
            }
         
         }
     }

    public static void findUnion (ArrayList<Integer> L1, ArrayList<Integer> L2)
    {
        for (int i = 0; i < L1.size(); i++)
        {
            int x = L1.get(i);
            if (isNotFound(x, L2))
            {
                L2.add(x);
            }
        }
    }
    
    public static boolean isFound(int x, ArrayList<Integer> L) 
    {
        boolean found = false;
        for (int i = 0; i < L.size(); i++)
        {
            if (L.get(i) == x) 
            {
               found = true; 
               break;
            }
        }
        return found;
    }

    public static boolean isNotFound(int x, ArrayList<Integer> L) 
    {
        boolean found = false;
        for (int i = 0; i < L.size(); i++)
        {
            if (L.get(i) == x) 
            {
               found = true; 
               break;
            }
        }
        return !found;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> L1 = new ArrayList<Integer>();

        L1.add(9);
        L1.add(11); 
        L1.add(15); 
        L1.add(19);
        L1.add(32);
        L1.add(45);
        L1.add(58);
        L1.add(74);

        ArrayList<Integer> L2 = new ArrayList<Integer>();

        L2.add(19);
        L2.add(22);
        L2.add(11); 
        L2.add(28);
        L2.add(32);
        L2.add(74);

        ArrayList<Integer> L3 = new ArrayList<Integer>();


        System.out.print(L1);

        System.out.println(L2);

        findIntersection(L1, L2, L3);

        System.out.println(L3);


        findUnion(L1, L2);

        System.out.println(L2);
    }
}
