class AddOrEven{
public static void main(String []args)
{
	
int a[] = new int[100]	;
  for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
for(int i=0; i<a.length ; i++){

  if(a[i]%2== 0){
  System.out.println("The even Number are :" + a[i]);
  
  }
  if(a[i]%2 != 0){
  System.out.println("The odd numbers are :" + a[i]);
  }

}

}
}