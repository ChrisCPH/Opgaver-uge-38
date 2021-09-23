class Main{
	static Integer[] intArr = {8, 3, 4};
	static String[] stringArr = {"Hello", "World", "Random"};
	static boolean[] booleanArr = {true, false, false};
	public static void main(String [] args){
		printStrings(stringArr);
		sumOfArray(intArr);
		averageValue(intArr);
		sortedArray(intArr);
	}
	public static void printStrings(String[] a){
		for(int i = 0; i < stringArr.length; i++){
			System.out.println(stringArr[i]);
		}
	}
	public static void sumOfArray(Integer[] b){
		int sum = 0;
		for(int i = 0; i < intArr.length; i++){
			sum = sum + intArr[i];
		}
		System.out.println(sum);
	}
	public static void averageValue(Integer[] c){
		int sum = 0;
		int average = 0;
		for(int i = 0; i < intArr.length; i++){
			 sum = sum + intArr[i];
		}
		average = sum/intArr.length;
		System.out.println(average);
	}
	public static void sortedArray(Integer[] d){
		for(int i = 0; i < intArr.length; i++){
			for(int j = i + 1; j < intArr.length; j++){
				int tmpIntArr = 0;
				if(intArr[i] > intArr[j]){
					tmpIntArr = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = tmpIntArr;
				}
			}
			System.out.println(intArr[i]);
		}
	}
 }