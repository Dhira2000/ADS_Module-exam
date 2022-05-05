import java.util.Scanner;
class Question1{
	public static void main(String[]args){
		Scanner sc = new Scanner();
		Question1 q = new Question1();
		
		/*
		int d= sc.nextInt();
		int testcase[]=new int[d];
		for(int y=0;y<user.length;y++){
			testcase[y]=new int[sc.nextInt];
		}
		*/
		
		int []a1={1,2,4,5,3};
		int n=a1.length;
		
		for(int i=0;i<n;i++){
			for(int j=n-1;j>0;j--){
				if(a1[n-1]<a1[n-2]){
					int temp=a1[n-1];
					a1[n-1]=a1[n-2];
					}
				}
				System.out.print(a1[i]+" ");
			}
			System.out.println();
		for(int k=0;k<n;k++){
			if(a1[n-2]>a1[n-3]){
				a1[n-2]=a1[n-3];
			}
			System.out.print(a1[k]+" ");
		}
		System.out.println();
		q.display();
		}
		void display(){
			int a2[]={1,2,4,5,3};
			for(int s=0;s<a2.length;s++){
				for(int t=s+1;t<a2.length;t++){
					if(a2[t]<a2[s]){
						int temp=a2[t];
						a2[t]=a2[s];
						a2[s]=temp;
					}
				}
			}
			for(int w=0;w<a2.length;w++){
				System.out.print(a2[w]+" ");
			}
		}
		
		
	}
	