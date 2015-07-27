class BinarySearch{
	public static void main(String[] args){
		int[] arr={1,3,5,7,9};
		int index=binarySearch(arr,arr.length,9);
		System.out.println("===1��° ��°�===");
		if(index==-1)
			System.out.println("Ž�� ����");
		else
			System.out.println("target�� index�� "+index+"�Դϴ�");
		index=binarySearch(arr,arr.length,10);
		System.out.println("===2��° ��°�===");
		if(index==-1)
			System.out.println("Ž�� ����");
		else
			System.out.println("target�� index�� "+index+"�Դϴ�");
	}
	static int binarySearch(int[] arr,int length,int target){
		int first=0;
		int last=length-1;
		int mid;
		while(first<=last){
			mid=(first+last)/2;
			if(arr[mid]==target)
				return mid;
			else{
				if(target<arr[mid])
					last=mid-1;
				else
					first=mid+1;
			}
		}
		return -1;
	}
}