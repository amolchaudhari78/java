import java.util.Scanner;
class AntiClockwiseEle{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int i,n,z;
    System.out.println("Enter Size");
    n=sc.nextInt();
    int a[]=new int[n];

    System.out.println("Enter Element");
for(i=0;i<a.length;i++){
     a[i]=sc.nextInt();
    }

    z=a[a.length-1];
  
for(i=a.length-1;i>0;i--){
      a[i]=a[i-1];
    }

   a[0]=z;
  
    System.out.println("Anticlockwise Rotation");
for(i=0;i<a.length;i++){
     System.out.println(a[i]);
    }
  }
}


   
  
