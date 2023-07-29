package HashMap;

import java.util.ArrayList;

public class MyHashMap <K,V>{

	private class Node
	{
	   K key;
	   V value;
	   Node next;
	   
	   Node(K key, V val)
	   {
		   this.key=key;
		   this.value=val;
	   }
	}
	
	ArrayList<Node> bucket;
	int size=0;
	static final int th=2;
	
	public MyHashMap()
	{
		this(4);
	}

	public MyHashMap(int bucketSize)
	{
		
		bucket = new ArrayList<>();
		for(int i =0; i < bucketSize; i++)
		{
			bucket.add(null);
		}
		
	}	
		
	private int hashFn(K key)
	{
		int bn = key.hashCode()%bucket.size();
		if(bn<0)
		  return bn+bucket.size();
		return bn;
	}
		
	public void put(K key, V value)
	{
		int bn = hashFn(key);
		Node temp = bucket.get(bn);
		while(temp != null)
		{
//			if(temp.key)
				
				
				
		}
	}
		
		
		
		
		
		
		
	}
	
	


