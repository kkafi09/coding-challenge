public class bubbleShort{
	public static void main(String[] args) {
		int[] angka = {1,3,4,5,6,3,2,6,5,3,7,4,3,2};
		bubbleShortAlgorithm(angka);

		for(int i =0; i < angka.length; i++){
			System.out.print(angka[i] + " ");
		}
	}

	public static void bubbleShortAlgorithm(int[] number){
		// for(int i = 0; i < number.length; i++){
		// 	for(int j = 0; j < number.length -1; j++){
		// 			if (number[j] > number[(j + 1)]){
		// 			int temp = number[j];
		// 			number[j] = number[j + 1];
		// 			number[j + 1] = temp;
		// 		}
		// 	}
		// }
		for (int i = 0; i < number.length - 1; i++){
			if (number[i] > number[(i + 1)]){
				int temp = number[i];
				number[i] = number[i + 1];
				number[i + 1] = temp;

				i = -1;
			}
		}
	}
}