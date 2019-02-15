public class JavaBasicRecap{
	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.print("How many arguments?:"+args.length+"\n"+args[0]+args[1]+args[2]+"\n");
		
		for(int i=0;i<args.length;i++){			
		System.out.println("(index):"+i+":"+ args[i]);
		}
		
		System.out.println("Reverse order of arguments");
		for(int i=args.length-1;i>=0;i--){			
		System.out.println("(index):"+i+":"+ args[i]);
		}
		
		System.out.println("Sum of the numbers is:");
		int a[] ={1,2,4};
		int sum = 0;
		for(int num:a){			
		System.out.print(sum+=num);
		}
		
		System.out.println();
		
		System.out.println("EVEN NUMBERS:");
		
		for(int i = 0; i<10;i++){
			if(i%2==0){	
				System.out.println("EvenNumber:"+i);
			}
		}
		
		System.out.println();
		
		System.out.println("ODD NUMBERS:");
		
		for(int i = 0; i<10;i++){
			if(i%2!=0){	
				System.out.println("EvenNumber:"+i);
			}
		}
		
		
		
	}
}