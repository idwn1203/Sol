package Sol;

import java.io.File;
import java.util.Formatter;

public class file {

	public static void main(String[] args) {

		
/*		String pathName = "file";
		File file1 = new File(pathName);
		String[] strList1 = file1.list();
		Map<Integer, String> map = new HashMap<Integer, String>();
		try {
			int index = 0;
			for (int i = 0; i < strList1.length; i++) {
				Scanner in = new Scanner(
						new FileReader(new File("C:\\Users\\소유자\\Desktop\\test\\priority.pu", strList1[i])));

				while (in.hasNextLine()) {
					String tempLine = in.nextLine();
					if(tempLine.contains("<DOC>")) {
						index++;
					}
				
				}
			}
			System.out.println("총 문서의 수" + index);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
File file =new File("C:\\Users\\소유자\\Desktop\\test");

String name =file.getName();
String list[] = file.list();
System.out.println("name is "+name);
for(int i=0;i<list.length;i++) {
	System.out.println(list[i]);
}
File file1 = new File("C:\\Users\\소유자\\Desktop\\test\\2");
File file2 = new File("C:\\\\Users\\\\소유자\\\\Desktop\\\\test\\\\245");

File file3 =new File(list[0]+50);
file3.mkdir();
if(!file1.renameTo(file2)) {

	System.out.println("test");
}
final Formatter x; 
try {
	x = new Formatter("C:\\Users\\소유자\\Desktop\\test\\tefest.txt");
	System.out.println("test");
}

catch(Exception e) {
	System.out.println("error");
}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
