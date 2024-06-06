//TotalSizeSum-ArraySum

import java.util.Scanner;
class MissingNumber
{
public static void main(String[] args)
{
int i,MissingN,size,ArraySum=0,nSum;
System.out.print("Enter the size of the array:");
Scanner s=new Scanner(System.in);
size=s.nextInt();
System.out.print("Enter the number in a sequential icreasing/decreasing order:");

int a[]=new int[size];

for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<size;i++)
{
System.out.print(a[i]+" ");
ArraySum +=a[i];
nSum=(size*(size+1))/2;
}

MissingN=nSum-ArraySum;
System.out.print("\nArraySum:"+ArraySum);
System.out.print("\nThe missing number is: "+MissingN);
}
}