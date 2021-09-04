import java.util.ArrayList;

public class SetTest
{
    public static void main(String[] args)
    {
        Set a = new Set();
        // ArrayList<Integer> L1 = new ArrayList<Integer>();

        a.add(9);
        a.add(11); 

	Integer[] y = {15, 19};
        a.add(y); 

	int[] x = {32, 45, 58, 74};
        a.add(x);

        Set b = new Set();
        ArrayList<Integer> z = new ArrayList<Integer>();

        z.add(19);
        z.add(22);
        z.add(11); 
        z.add(28);
        z.add(32);
        z.add(74);

	b.add(z);

        // ArrayList<Integer> L3 = new ArrayList<Integer>();


	System.out.print("a = ");
        a.print();

	System.out.print("b = ");
        b.print();

        Set c = new Set();
        a.findIntersection(b, c);

	System.out.print("c = ");
        c.print();

        Set d = new Set();
        a.findUnion(b, d);

	System.out.print("d = ");
        d.print();


        Set e = new Set();
	e.add(9);
	e.add(11);

	System.out.print("e = ");
        e.print();

	if (a.isSubset(e))
	{
		System.out.println("e is a subset of a");
	}

	else
	{
		System.out.println("e is not a subset of a");
	}
    }
}
