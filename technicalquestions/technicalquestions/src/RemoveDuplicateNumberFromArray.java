public class RemoveDuplicateNumberFromArray {
    public static void main(String args[]){
        int num[]={1,3,2,4,5,3,1,7,6,7};
        int newArr[] = new int[num.length];
        int size=0;

        for (int i=0;i< num.length;i++){
            boolean isDuplicated = false;
            for (int j =0;j<size;j++){
                if (num[i] == newArr[j]){
                    isDuplicated=true;
                    break;
                }
            }
            if(!isDuplicated){
                newArr[size++] = num[i];
            }
        }
        for (int i=0;i<size;i++){
            System.out.println(newArr[i]+" ");
        }
    }
}
