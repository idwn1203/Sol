package Sol;

import java.io.File;
import java.io.IOException;

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


/*
 * 폴더안에있는 목록대로 폴더 생성
*/
String root ="C:\\Users\\소유자\\Desktop\\test";
String objectroot ="C:\\Users\\소유자\\Desktop\\test\\22";
File file =new File(root);
String[] F_list=file.list();
String temp;
for(int i=0;i<F_list.length;i++) {
	System.out.println("name is "+i+F_list[i]);

	File file12 =new File(F_list[i]);
		file12.mkdir();
	


/*
 * 폴더확인 있으면 안으로 없으면 리스트 출력 
*/



/*String name =file.getName();
String Fo_list[] = file.list();
//file의 리스트 출력 

System.out.println("name is "+name);
for(int i=0;i<Fo_list.length;i++) {
	System.out.println(Fo_list[i]);
}

String Fo_mk = destintion+Fo_list

File file1 = new File("test");
File file2 = new File("C:\\Users\\소유자\\Desktop\\test\\245");
for(int i=0;i<list.length;i++) {
File[] filea =new File[i];
//filea.
}
//file 폴더이름변경
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


*/
	
	
	
	
	
	
/*	string result 
	for() {
		for() {
			
		}	
	}
	
	*/
	
	
	
	}
	}
	
}
