# pro151
class largest
{
public static void main(string[] args)
{
int a[]={31,14,16,11,7},ctr;
size=sizeof(arr)/sizeof(arr[0]);
int temp;
for(ctr=0;ctr<size;ctr++)
{
for(ctr1=ctr+1;ctr1<size;ctr1++)
{
if(arr[ctr]>arr[ctr1])
{
temp=arr[ctr];
arr[ctr]=arr[ctr1];
arr[ctr1]=temp;
}
}
}
for(ctr=0;ctr<size;ctr++)
{
printf("%d",arr[0]);
}
}
}

  
