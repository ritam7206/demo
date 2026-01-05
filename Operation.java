class Operation{
double arr[]={1,43,46,23,66,34};
int pointer=0;
 void arrayPrint(){
System.out.printf("Array Traversal: ");
for(int pointer=0;pointer<arr.length;pointer++){
System.out.printf("%.0f ",arr[pointer]);
}
System.out.println();
}
public static void main(String args[])
{
    Operation operation=new Operation();
    operation.arrayPrint();
}
}