package SelectionSort;

public class SelectionSort {
    private int[] data;
    public void SelectionSort(){
        int i,j,small;
        int n = this.data.length;
        for (i=0;i<n-1;i++){
            small = i;
            for (j=i+1;j<n;j++){
                if (this.data[j]<this.data[small]){
                    small = j;
                }
            }
            int temp = this.data[small];
            this.data[small] = this.data[i];
            this.data[j]=temp;
        }
    }
    public SelectionSort(){

    }
    public int[] getData(){
        return data;
    }
    public void setData(int[] data){
        this.data =data;
    }
    public void PrintData(){
        for (int datum : this.data){
            System.out.print(datum + " ");
        }
    }

    public void setData() {
    }
}
