import java.util.*;

class prac8{
	
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter string s: ");
		String s = inp.nextLine();
		System.out.print("Enter string s1: ");
		String s1 = inp.nextLine();
		System.out.println(s.equals(s1));
		
		System.out.print("Concated String: ");
		System.out.println(s.concat(s1));
		
		System.out.print("Lowercased string: ");
		System.out.println(s1.toLowerCase());
		
		System.out.print("Uppercased string: ");
		System.out.println(s.toUpperCase());
		
		System.out.print("Enter string s2: ");
		String s2=inp.nextLine();
		System.out.println("Is the string Empty?");
		System.out.println(s2.isEmpty());
		}
	}