import java.util.Scanner;
public class FirstOccurrence {
    
        // TODO: Read N and K
        // TODO: Read array elements
        // TODO: Find the position (1-based index) of the first occurrence of K
        // TODO: Print the position or -1 if not found
    
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int N= sc.nextInt();
		int K= sc.nextInt();
		int[] arr= new int[N];

		for(int i=0;i<N;i++){

			arr[i]= sc.nextInt();

		}
		int pos=-1;
		for(int i=0;i<N;i++){

			if(arr[i]==K){

				pos=i+1;
				break;

			}

		}
		System.out.println(pos);

	}
}
