package learningSession4;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4.1 Declare and Create Array in java
		String[] backpack = {"Sabit", "Water Can", "Axe", "Celurit", "Granat"};
		String backpack2[] = {"Sabit", "Water Can", "Axe"};
		String[] mybackpack = new String[3];
		int[] myList = {1,2,13,7,5};
		int[] copyList = new int[myList.length];
		// 4.1.1 Access Array in java
//		System.out.println(backpack[0]);
//		System.out.println(backpack2[1]);
//		System.out.println(mybackpack);
		
		// 4.2 Array Size in java
//		System.out.println(backpack.length);
//		System.out.println(myList.length);
		
		// 4.3 Processing Array
		// 4.3.1 display all of array element
//		for (int i=0; i<backpack.length; i++) {
//			System.out.println(backpack[i]);
//		}
		
		// 4.3.2 Counting All the element array
//		int total = 0;
//		for (int i=0; i<myList.length; i++) {
//			total += myList[i];
//		}
//		System.out.println(total);
		
		// 4.3.3 Display the maximum value of array
//		int max = myList[0];
//		for (int i = 1; i < myList.length; i++) {
//			if (myList[i] > max) {
//				max = myList[i];
//			}	
//		}
//		
//		System.out.println(max);
		
//		4.4 For Each element of array
//		for (String el: backpack) {
//			System.out.println(el);
//		}
		
//		4.5 Copy Array Element
		for (int i=0; i<myList.length;i++) {
			copyList[i] = myList[i];
		}
		
		for (int el: copyList) {
			System.out.println(el);
		}
		
		
		
		
	}

}
