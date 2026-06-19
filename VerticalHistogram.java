class VerticalHistogram{
    static void verticalHistogram(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
         if(max<arr[i])
            max=arr[i];
        }
        for(int i=max;i>=1;i--){
            for(int j=0;j<arr.length;j++){
                if(j%2==0 && i<=arr[j])
                    System.out.print("*");
                else if(j%2!=0 && i<=arr[j])
                    System.out.print((char)(64+i));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
     int arr[]={5,8,3,6,5};
    verticalHistogram(arr);
    }
}