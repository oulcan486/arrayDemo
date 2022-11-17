package arraysDemo;

public class recapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers= {2.3,5.6,10.9,8.5,1.4};
		double toplam=0;
		double max=numbers[0];
		for (double number : numbers) {
			if(max<number){
				max=number;
			}
			toplam=toplam+number;
			System.out.println(number);
		}
		System.out.println("Toplam değer :"+toplam);
		System.out.println("En büyük  değer :"+max);

	}

}
