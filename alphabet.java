import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class alphabet{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//control variable
		int size = 0;
		boolean b1 = true;
		while(b1){
			//it is a number
			//number of arrays
			String w = "12345687910";
			System.out.println("How many stacks do you want?");
			String a = sc.next();
			//is or not a number
			if(w.contains(a)){
				//it is
				size = Integer.parseInt(a);
				b1=false;
			}else{
				//it is not
				System.out.println("this is not a number");
			}
		}
		ArrayList<Stackl> tops = new ArrayList<>();
		ArrayList<Queuel> bots = new ArrayList<>();
		sc.nextLine();
		//inisializate the stacks
		for(int i=0;i<size;i++){
			System.out.println("insert t to top or b to button and the letter to start of the stack " + (i+1) + ": ");
			String[] in = sc.nextLine().split(" ");
			if(in[0].toLowerCase().charAt(0) == 't'){
				if (((int)in[1].toUpperCase().charAt(0)) >= 65 && ((int)in[1].toUpperCase().charAt(0)) <= 90){
					Stackl tem = new Stackl(in[1].toUpperCase().charAt(0));
					tops.add(tem);
				}else{
					System.out.println("insert a correct letter");
				}
			}else if(in[0].toLowerCase().charAt(0) == 'b'){
				if (((int)in[1].toUpperCase().charAt(0)) >= 65 && ((int)in[1].toUpperCase().charAt(0)) <= 90){
					Queuel tem = new Queuel(in[1].toUpperCase().charAt(0));
					bots.add(tem);
				}else{
					System.out.println("insert a correct letter");
					i--;
				}
			}else{
				System.out.println("it is not a option");
				i--;
			}
			System.out.println("letter: " +in[1].toUpperCase().charAt(0));
		}


		//full
		//full the tops
		System.out.println("TOPS");
		for (int j=0; j<tops.size();j++ ) {
			int a = (int)((char)tops.get(j).top());
			a++;
			for (int i=0;i<27;i++){
				if(!(a >=65 && a<=90)){
					a =65;
				}
				System.out.println("push: " + (char)a);
				tops.get(j).push((char)a);
				a++;
			}
		}
			
		// full buttons
		System.out.println("BOTS");
		for (int j=0; j<bots.size();j++ ) {
			int a = (int)((char)bots.get(j).front());
			a++;
			for (int i=0;i<27;i++){
				if(!(a >=65 && a<=90)){
					a =65;
				}
				System.out.println("push: " + (char)a);
				bots.get(j).put((char)a);
				a++;
			}
		}

		//print
		System.out.println(Arrays.toString(tops.toArray()));
		for (int i=0;i<tops.size();i++){
			tops.get(i).printhead();
			tops.get(i).print();
		}
		System.out.println(Arrays.toString(bots.toArray()));
		for (int i=0;i<bots.size();i++){
			bots.get(i).printfront();
			bots.get(i).print();
		}
		
		
	}
}

