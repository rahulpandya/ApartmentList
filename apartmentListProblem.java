//import java.util.regex;

public class apartmentListProblem {

	public void normalize(String filepath){
		if (!(filepath.contains("/../")) && !(filepath.contains("/./")) ){
			System.out.println(filepath);
		}
		else if (filepath.contains("/./")){
			while(filepath.contains("/./")){
				int x = filepath.indexOf("/./");
				String sub1 = filepath.substring(0, x);
				String sub2 = filepath.substring(x+2);
				filepath = sub1 + sub2;
			}
			System.out.println(filepath);
		}
		else {
			while (filepath.contains("/../")){
				int x = filepath.indexOf("/../"); //assumes need parent directory for two-dot implementation
				String sub1 = filepath.substring(0, x);
				String sub2 = filepath.substring(x+3);
				int y = sub1.lastIndexOf("/");
				sub1 = sub1.substring(0,y);
				filepath = sub1 + sub2;
			}
			System.out.println(filepath);

		}
	}


	public static void main (String[] args){
		apartmentListProblem p1 = new apartmentListProblem();
		/*
		String example1 = "foo//bar"; //base case, no dots
		String example2 = "foo/./bar"; //one-dot case, occurs once
		String example3 = "foo/bar/../baz"; //two-dot case, occurs once
		String example4 = "foo/./bar/./baz"; //one-dot case, occurs more than once
		String example5 = "foo/bar/../baz/../qux/asd/../";  //two-dot, occurs more than once
		String example6 = "/./asdf/asdf/asdf"; //one-dot at beginning of string
		*/
		System.out.println("The filepath '" + args[0] + "' is normalized to... ");
		p1.normalize(args[0]);
		/*
		System.out.println("Test 2: " + example2 + " is normalized to... ");
		p1.normalize(example2);
		System.out.println("Test 3: " + example3 + " is normalized to... ");
		p1.normalize(example3);
		System.out.println("Test 4: " + example4 + " is normalized to... ");
		p1.normalize(example4);
		System.out.println("Test 5: " + example5 + " is normalized to... ");
		p1.normalize(example5);
		System.out.println("Test 6: " + example6 + " is normalized to... ");		
		p1.normalize(example6);
		*/
	}



}