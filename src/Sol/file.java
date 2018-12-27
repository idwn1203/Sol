package Sol;

import java.io.File;
import java.io.IOException;

public class file {

	public file(String string) {
		// TODO Auto-generated constructor stub
	}

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
 * 초기화
*/
String root ="C:\\Users\\소유자\\Desktop\\test";
String objectroot ="C:\\\\Users\\\\소유자\\\\Desktop\\\\test1";
File file =new File(root);
int T_cnt=0;
int I_cnt=0;
int V_cnt=0;

//리스트 저장 
String[] F_list=file.list();
String[] T_file= new String[F_list.length];
String[] I_file= new String[F_list.length];
String[] V_file= new String[F_list.length];

/*
 * 폴더안에있는 목록출력
*/

for(int i=0;i<F_list.length;i++) {
	//txt파일일경우
	if(F_list[i].endsWith("txt")) {
		T_file[T_cnt]=F_list[i];
		T_cnt++;
	}
	//사진일경우
	if(F_list[i].endsWith("jpg")||F_list[i].endsWith("png")) {
		I_file[I_cnt]=F_list[i];
		I_cnt++;
		}
	if(F_list[i].endsWith("avi")) {
		V_file[V_cnt]=F_list[i];
		V_cnt++;
	}
}

System.out.println("txt 파일목록");
for(int i=0;i<T_cnt;i++) {
	System.out.println(T_file[i]);
}
System.out.println("image파일");
for(int i=0;i<I_cnt;i++) {
	System.out.println(I_file[i]);
}
System.out.println("video파일");
for(int i=0;i<V_cnt;i++) {
	System.out.println(V_file[i]);
}
/*
 * 폴더안에있는 목록대로 폴더 생성
*/
for(int i=0;i<F_list.length;i++) {
	File temp =new File(objectroot,F_list[i]);
	temp.mkdir();
	temp.delete();
}


/*
 * 축약어 추출 프로그램 
 * */

String Senten= "Graphinc User Interpace";
String Abbrev= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";





/*
 * 축약어 추출 프로그램 
 * */

for(int i=0;i<Senten.length();i++) {
	for(int j=0;j<Abbrev.length();j++) {
		if(Senten.charAt(i)==Abbrev.charAt(j))
		System.out.print(Abbrev.charAt(j));
	}


}


/*
 * 파일생성 
 * */

File mdfile = new File("C:\\Users\\소유자\\Desktop\\test1\\test.md");
try {
	mdfile.createNewFile();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


/*
 * 특정단어 삽입 축약어 추출 프로그램 
 * */


/*
 * 파일이름 변경일괄 변경하기
 */




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
