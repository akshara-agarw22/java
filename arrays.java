public class arrays {
    /*
     * public static void update(int marks[]) {
     * for (int i = 0; i < marks.length; i++) {
     * marks[i] = marks[i] + 1;
     * }
     * }
     * 
     * public static void main(String args[]) {
     * int marks[] = { 97, 98, 99 };
     * update(marks);
     * for (int i = 0; i < marks.length; i++) {
     * System.out.print(marks[i] + " ");
     * }
     * System.out.println();
     * }
     */
   /* public static int linearsearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
                return -1;
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 11;
        int index = linearsearch(num, key);
        if (index == -1) {
            System.out.println("key not fount");
        } else {
            System.out.println("key found at index:" + index);
        }
    } */
   /*public static int getlargest(int n[]){
      int largest=Integer.MIN_VALUE; // -infinity
      int smallest=Integer.MAX_VALUE; //+infinity
        for(int i=0;i<n.length;i++){
            if(largest<n[i]){
                largest=n[i];
            }
            if(smallest>n[i]){
                smallest=n[i];
            }
        }
        System.out.println("the smallest numner of the arry is:"+smallest);
        return largest; 
   }
   public static void main(String args[]){
    int n[]={1,2,3,4,5,10,6,7,8,9,11};
    System.out.println("The largest number in the array is:"+getlargest(n));
   }*/
 /* public static int binarysearch(int n[],int key){
    int start=0,end=n.length-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(n[mid]==key){
            return mid;
        }
        if(n[mid]>key){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return -1;
  }
  public static void main(String args[]){
    int n[]={2,4,6,8,10,12,14};
    int key=11;
    System.out.println("key is found at index:"+binarysearch(n, key));
  }*/
  /*public static void reverse(int n[]){
    int start=0,last=n.length-1;
    while(start<last){
       //reverses the array
        int temp=n[last]; 
        n[last]=n[start];
        n[start]=temp;
        start++;
        last--;
    }
  }
  public static void main(String args[]){
    int n[]={2,4,6,8,10};
    reverse(n); //calling the reverse function
    // to print the reversed array
    for(int i=0;i<n.length;i++)
    {
        System.out.print(n[i]+" ");
    }
    System.out.println();
  }*/
}
