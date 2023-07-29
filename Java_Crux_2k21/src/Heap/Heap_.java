package Heap;

import java.util.ArrayList;

public class Heap_ {
	
	static ArrayList<Integer> data = new ArrayList<>();
	
	public void add(int item)
	{
		data.add(item);
		upheapify(data.size()-1);
	}

	private void upheapify(int ci) 
	{
		int pi = (ci-1)/2;
		if(data.get(ci) < data.get(pi))
		{
			swap(pi, ci);
			upheapify(pi);
		}
		
	}
	private void swap(int i , int j)
	{
		int ith = data.get(i);
		int jth = data.get(j);
		
		data.set(i, jth);
		data.set(j, ith);
	}
	
	public static void display()
	{
		System.out.println(data);
	}
	
	public int size()
	{
		return this.data.size();
	}
	
	public boolean isEmpty()
	{
		return this.size()==0;
	}
	
	
	
	
	
	
	
	
	

}
