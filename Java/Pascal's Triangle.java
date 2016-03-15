public class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> listOfList = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		if (numRows == 0)
			return listOfList;

		list1.add(1);
		listOfList.add(list1);
		if (numRows == 1)
			return listOfList;

		list2.add(1);
		list2.add(1);
		listOfList.add(list2);
		if (numRows == 2)
			return listOfList;

		int n = 2;
		while (true) {
			list1 = list2;
			list2 = new ArrayList<>();
			list2.add(1);
			for (int i = 0; i < list1.size() - 1; i++)
				list2.add(list1.get(i) + list1.get(i + 1));
			list2.add(1);
			listOfList.add(list2);
			if (++n == numRows)
				return listOfList;
		}
	}
}