package com.day1.assignments;

public class q1 {

    public static boolean PrimeNumber(int n){
        for(int i=2; i<=(n/2)+1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int fact(int n){
        int p=1;
        if (n==0 || n==1){
            return 1;
        }
        while(n>=1){
            p=p*n;
            n=n-1;
        }
        return p;
    }

    public static int binarySearch(int arr[], int n){
        int l= arr.length;
        int mid=l/2;
        int s=0, d=arr.length-1;
        while(s<=d){
            mid=(s+d)/2;
            if(arr[mid]==n){
                return mid;
            }
            else if(arr[mid]>n){
                d=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }

    public static int[] bubblesort(int arr[]){
        int smallest=arr[0];
        int temp=0;
                for(int i =0 ; i< arr.length; i++){
                    for(int j=0;j<arr.length-i-1;j++)
                   if (arr[j]>arr[j+1]){
                       temp=arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=temp;
                   }
                }
                return arr;
    }

    public static void main(String[] args){
        System.out.println(q1.PrimeNumber( 7));
        System.out.println(q1.fact( 7));
//        int arr[]=
//        int i = 4;
        System.out.println(q1.binarySearch(new int[]{2, 3, 4, 5, 6, 7, 8, 78},4));
        int[] arr=q1.bubblesort(new int[]{78, 2, 3,1, 0, 100, 50,  4, 5, 6, 7, 8});
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
