package Selenium_Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Interview_Question_Sort_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Unsorted = 987654332;

		String AfterSort = "";
		String NewUnsort = Integer.toString(Unsorted);

		ArrayList<Character> NewList = new ArrayList<Character>();

		for (int i = 0; i < NewUnsort.length(); i++)

		{

			NewList.add(NewUnsort.charAt(i));
		}

		//System.out.println(NewList);

		Collections.sort(NewList);

		// Collections.sort(NewList, Collections.reverseOrder());

		// System.out.println(NewList);

		for (int j = 0; j < NewList.size(); j++)

		{
			// System.out.println(Integer.parseInt(String.valueOf(NewList.get(j))));
			AfterSort = AfterSort + NewList.get(j);
		}
		System.out.println(AfterSort);
		System.out.println(AfterSort.getClass().getSimpleName());

		System.out.println(((Object) Integer.parseInt(AfterSort)).getClass().getSimpleName());
		System.out.println(AfterSort);
	}

}
