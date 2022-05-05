class Question3{
	int s[];
	int size;
	int top1,top2;
	
	public Question3(int n){
		this.s=new int[n];
		this.size=s.length;
		top1 = n/2 + 1;
		top2 = n/2;
	}
	
	void pushFirst(int x){
		if(top1>=0){
			top1--;
			s[top1]=x;
		}
		else{
			System.out.println("stack Overflow!!");
		}
	}
	void pushSecond(int x){
		if(top2 < size-1){
			top2++;
			s[top2]=x;
		}
		else{
			System.out.println("Overflow!!");
		}
	}
	/*void display(){
		for(int i=0;i<size;i++){
			System.out.print(s[i]+" ");
		}
	}*/
	
	int pop1(){
		if(top1<=size-1){
			int x=s[top1];
			top1++;
			return x;
		}
		else{
			System.out.println("Underflow");
			return -1;
		}
	}
	int pop2(){
		if(top2>=(size/2)+1){
			int x=s[top2];
			top2--;
			return x;
		}
		else{
			System.out.println("Underflow");
			return -1;
		}
		
	}
}
class Question3Demo{
	public static void main(String[]args){
		Question3 q = new Question3(9);
		q.pushFirst(5);
		q.pushSecond(10);	
		q.pushSecond(15);
		q.pushFirst(11);
		q.pushSecond(7);
		q.pushSecond(40);
		
		//q.display();
		System.out.println("Popped element from stack1 is "+q.pop1());
		System.out.println("Popped element from stack2 is "+q.pop2());
		
	}
}