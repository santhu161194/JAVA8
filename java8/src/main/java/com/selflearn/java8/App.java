package com.selflearn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
	@Override
	public boolean equals(Object a)
	{	
		if(a!=null&&this!=null) {
			if(a==this)
				return true;
			else if(a.equals(this))
				return true;
		}
		return false;
		
	}
	
	int sum=0;
    public static void main( String[] args )
    {
    	App app=new App();
       List<Integer> arr1=Arrays.asList(12,13,14,15,45,48);
       arr1.forEach(app::add);
       List<Integer> str =arr1.stream().filter(arr->arr<14).collect(Collectors.toList());
       System.out.println(str.toString());
    }
    private void add(int x) {
    	sum+=x;
    }
}
