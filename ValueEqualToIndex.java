
public class ValueEqualToIndex {
public static void main(String[] args) {
	int[] arr = {0,3,8};
	for(int i=0;i<arr.length;i++){
		if(arr[i]==i){
			System.out.println("Answer is : "+i);
			break;
		}
	}
}
}
