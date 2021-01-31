
public class ArrayDemo {
	public static void main(String[] args) {
		
		int[][] arr = new int[2][2];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=i+j+1;
			}
		}
		System.out.println("arrays elements are as follows");
		
		for(int a[]:arr) {
			for(int i:a) {
				System.out.println(i+"\t");
			}
			System.out.println();
		}
		int ar[][]=new int [2][];
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
	}

}
