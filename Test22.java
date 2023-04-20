package Testing;
class Test1 {
    public static void main(String[] args) {
        // int a[]={9,8,7,90,80,6,5,4,0};
        int a[]={9,3,8,7,90,80,6,5,4,0,999};
        QuickSort quickSort=new QuickSort();
        quickSort.sort(a, 0, a.length-1);
        for(int i : a)
        {
            System.out.println(i);
        }
    }
    
}
class QuickSort{
    public void sort(int a[], int low, int high){
        if(low<high){
        int partitionIndex=partition(a,low,high);
        sort(a,low,partitionIndex-1);
        sort(a,partitionIndex+1,high);
        }
        }

    private int partition(int[] a, int low, int high) {
        int pivot=a[high];
        int j=high-1;
        int i=low;
        int pidx=low;
        int pivotFlag=0;
        for(int x=i;x<=j;x++)
        {
            
            int flag1=0;
            int flag2=0;
            pivotFlag=0;
            if(a[x]<pivot)
            {
                int temp=a[x];
                a[x]=a[pidx];
                a[pidx]=temp;
                pidx++;
                flag1++;
            }
            if(pidx==j && x==j)
            {
                int temp=a[x];
                a[x]=pivot;
                a[high]=temp;
                flag2++;
            }
            

            if(x==j && flag1==0 && flag2==0)
            {
                int temp=a[pidx];
                a[pidx]=pivot;
                a[high]=temp;
                pivotFlag++;

            }


        }
        if(pidx!=j && pivotFlag == 0)
        {
        int temp=a[pidx];
        a[pidx]=pivot;
        a[high]=temp;
        }
        return pidx;

    }
}