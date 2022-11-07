
public class Assignment_BS_3_of_2 {
	
			public static void main(String[] args) {
		int[] arr= {10,30,20,40,50,3,4,1};
		int temp = 0;

      for(int i=0; i <arr.length; i++){  
              for(int j=0; j < arr.length-1; j++){  
                       if(arr[j] > arr[j+1]){    
                              temp = arr[j];  
                              arr[j] = arr[j+1];  
                              arr[j+1] = temp;  
                              }
                      }  
              }
      for(int i=0;i<arr.length;i++) {
    	  System.out.println(arr[i]);
      }
}

}
