import java.util.*;

abstract class Stack{
	abstract void push(int x);
	abstract void pop();
	abstract void display();
}

class StaticStack extends Stack
{
	int a[] = new int[30];
	int t;

	StaticStack()
	{
		t = 0;
	}

	void push(int x)
	{	
		a[t] = x;
		// System.out.println(a[t]+" "+t);
		t+=1;
	}
	void pop()
	{
		System.out.println("Element Pop: " + a[t-1]);
		t-=1;
	}
	void display()
	{
		for(int i=0; i<t;i++)
		{
			System.out.print(a[i] +" ");
		}

		System.out.println();
	}
}

class DyanamicStack extends Stack
{
	ArrayList<Integer> arr = new ArrayList<Integer>();
	void push(int x)
	{
		arr.add(x);
	}
	void pop()
	{
		System.out.println("Element Pop: " + arr.get(arr.size()-1));
		arr.remove(arr.size()-1);
	}
	void display()
	{
		for(int i=0; i<arr.size(); i++)
		{
			System.out.println(arr.get(i));
		}
	}
}

class P2
{
	public static void main(String[] args) 
	{
		// StaticStack s = new StaticStack();
		DyanamicStack s = new DyanamicStack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.display();
		s.pop();
		s.pop();
		s.display();

	}
}