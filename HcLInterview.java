package hcl;

import java.util.*;

public class HcLInterview
{
	public static void main(String [] args)
	{
		String [] cars= {"bmw", "Tesla", "kia", "Toyota", "honda","benz"};
		List<String> list = Arrays.asList(cars);
		list.stream().filter(i->i.length()>4).forEach(j->System.out.println(j));
	}
}