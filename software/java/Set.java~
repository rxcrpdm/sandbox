import java.util.ArrayList;

public class Set
{
	private ArrayList<Integer> L;

	public Set()
	{
		L = new ArrayList<Integer>();
	}

	public Integer get(int i)
	{
		return L.get(i);
	}

	public int size()
	{
		return L.size();
	}

	public boolean isMember(int x)
	{
		boolean member = false;
		for (int i = 0; i < L.size(); i++)
		{
			if (L.get(i) == x)
			{
				member = true;
				break;
			}
		}
		return member;
	}

	public boolean isMember(Integer x)
	{
		boolean member = false;
		for (int i = 0; i < L.size(); i++)
		{
			if (L.get(i) == x)
			{
				member = true;
				break;
			}
		}
		return member;
	}

	public boolean isSubset(Set b)
	{
		boolean subset = true;
		for (int i = 0; i < b.size(); i++)
		{
			if (!isMember(b.get(i)))
			{
				subset = false;
				break;
			}
		}
		return subset;
	}

	public void add(int x)
	{
		L.add(x);
	}

	public void add(Integer x)
	{
		L.add(x);
	}

	public void add(int[] x)
	{
		for (int i = 0; i < x.length; i++)
		{
			L.add(x[i]);
		}
	}

	public void add(Integer[] x)
	{
		for (int i = 0; i < x.length; i++)
		{
			L.add(x[i]);
		}
	}

	public void add(ArrayList<Integer> x)
	{
		for (int i = 0; i < x.size(); i++)
		{
			L.add(x.get(i));
		}
	}

	public void copy (Set T)
	{
		for (int i = 0; i < this.L.size(); i++)
		{
			if (T.isMember(this.L.get(i)) == false)
			{
				T.add(this.L.get(i));
			}
		}
	}

	public void print()
	{
		for (int  i = 0; i < L.size(); i++)
		{
			if (i == L.size() - 1)
			{
				System.out.print(L.get(i));
			}

			else
			{
				System.out.print(L.get(i) + ", ");
			}
		}
		System.out.print("\n");

	}


	public void findIntersection (Set S, Set T)
	{
		for (int i = 0; i < L.size(); i++)
		{
			int x = L.get(i);
			if (S.isMember(x))
			{
				T.add(x);
			}
		 
		}
	}

	public void findUnion (Set S, Set T)
	{
		this.copy(T);
		S.copy(T);
	}
	
	public boolean isFound(int x, ArrayList<Integer> L) 
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

	public boolean isNotFound(int x, ArrayList<Integer> L) 
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
}
