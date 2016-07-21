
public class UniqueNumberInARepeatedArray {
public static void main(String[] args) {
	int[] arr={1,6,2,8,3,8,1,3,2};
	int[] count = new int[arr.length];
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr.length;j++){
			if(arr[i]==arr[j]){
				count[i]++;
			}
		}
	}
	for(int i=0;i<arr.length;i++){
		if(count[i]==1){
			System.out.println(arr[i]+" occurs only once in the array");
			break;
		}
	}
}
}
