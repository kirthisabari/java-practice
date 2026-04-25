import java.io.*;

public class array1{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
     public int[] gettingarr() throws IOException{
        
      System.out.println("Getting Array");
      System.out.println("No.of terms : ");
      int n=Integer.parseInt(br.readLine());
      int[] arr=new int[n];
      System.out.println("please enter "+n+" elements");
      for(int i=0;i<n;i++){
        arr[i]=Integer.parseInt(br.readLine());

     }
     return arr;
    }
    public void displayarr(int[] arr){
        System.out.println("Array Elements are : ");
        for(int num:arr){
            System.out.println(num);
        }
    }
    public int arraysum(int[] arr){
        int sum=0;
        for(int num : arr){
          sum+=num;
        }
        return sum;
    }
    public int greatestarr(int[] arr,int n){
        int great=arr[0];
        for(int i=0;i<n;i++){
            
            if(arr[i]>great){
                great=arr[i];
            }
            
        }
        return great;

    }
    public int smallestarr(int[] arr){
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
             small=arr[i];
            }
            
        }
        return small;
    }
    public int[] sort(int[] arr){
        int x=0;
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                x=arr[i];
                arr[i]=arr[j];
                arr[j]=x;
            }
           } 
        }
        return arr;

    }
    public void search(int element,int[] arr){
        int i=0;
        for (int num:arr){
        if(num==element){
            i++;

        }
     }  
     if(i==0){
        System.out.println("The number "+element+ " is not found in array");
     }     
     else{
        System.out.println("The number "+ element +" is found at occurences of "+i);
     }
    }
    public static void main(String[] args) throws IOException{
        
        int choice=0;
        char option;
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        array1 arrobj=new array1();
        int[] arrsam=arrobj.gettingarr();
        int n=arrsam.length;
        arrobj.displayarr(arrsam);
        do{
            System.out.println("Array Operations");
            System.out.println("1.Sum Of Array");
            System.out.println("2. Greatest number in array");
            System.out.println("3. Smallest Number in array");
            System.out.println("4. Array Sorting");
            System.out.println("5. Search in Array");
            System.out.println("Enter Your Choice : ");
            choice=Integer.parseInt(br1.readLine());
            switch(choice){
                case 1:
                    int sum=arrobj.arraysum(arrsam);
                    System.out.println("Sum of Array Elements are : "+sum);
                    break;
                case 2:
                    int great=arrobj.greatestarr(arrsam, n);
                    System.out.println("Greatest number of Array "+great);
                    break;
                case 3:
                    int small=arrobj.smallestarr(arrsam);
                    System.out.println("Smallest number in array : "+small);
                    break;
                case 4:
                    System.out.println("Sorting Array");
                    int[] sortarr=arrobj.sort(arrsam);
                    arrobj.displayarr(sortarr);
                    break;
                case 5:
                    System.out.println("Enter NUmber to be Searched : ");
                    int element=Integer.parseInt(br1.readLine());
                    arrobj.search(element, arrsam);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
                }
            System.out.println("Do you want to continue(y/n) : ");
            option=br1.readLine().charAt(0);


        }while(option=='y'||option=='Y');
        System.out.println("Thank you");

       
        
         
         
         

    }

}