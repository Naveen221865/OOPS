package program;
public class sumofnumbers {
                   public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		int sum5=0;
		for(int i=1;i<=100;i++) {
			sum1=sum1+i;
		}
		for(int i=1;i<=50;i++) {
			sum2=sum2+i;
		}
		for(int i=1;i<=10;i++) {
			sum3=sum3+i;
		}
		for(int i=50;i<=100;i++) {
			sum4=sum4+i;
		}
		for(int i=1;i<=1;i++) {
			sum5=sum5+i;
		}
    System.out.println("(TC1 1-100 ) Sum : "+sum1);
    System.out.println("(TC2 1-50 ) Sum : "+sum2);
    System.out.println("(TC3 1-10 ) Sum : "+sum3);
    System.out.println("(TC4 50-100 ) Sum : "+sum4);
    System.out.println("(TC5 1-1 ) Sum : "+sum5);
	}
}
