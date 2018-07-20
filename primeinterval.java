import java.util.Scanner;
	public class primeinterval {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n1,n2,count,a,i,j;
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(i=n1+1;i<n2;i++){
			count=0;
			for(j=1;j<=i;j++){
				if(i%j==0){
					count++;
					//a=i;
					}
			}
			if(count==2){
					System.out.println(i);
				}
			
		

}
	}
	}
