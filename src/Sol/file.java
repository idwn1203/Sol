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
						new FileReader(new File("C:\\Users\\������\\Desktop\\test\\priority.pu", strList1[i])));

				while (in.hasNextLine()) {
					String tempLine = in.nextLine();
					if(tempLine.contains("<DOC>")) {
						index++;
					}
				
				}
			}
			System.out.println("�� ������ ��" + index);
		} catch (IOException e) {
			e.printStackTrace();
		}*/


/*
 * �ʱ�ȭ
*/
String root ="C:\\Users\\������\\Desktop\\test";
String objectroot ="C:\\\\Users\\\\������\\\\Desktop\\\\test1";
File file =new File(root);
int T_cnt=0;
int I_cnt=0;
int V_cnt=0;

//����Ʈ ���� 
String[] F_list=file.list();
String[] T_file= new String[F_list.length];
String[] I_file= new String[F_list.length];
String[] V_file= new String[F_list.length];

/*
 * �����ȿ��ִ� ������
*/

for(int i=0;i<F_list.length;i++) {
	//txt�����ϰ��
	if(F_list[i].endsWith("txt")) {
		T_file[T_cnt]=F_list[i];
		T_cnt++;
	}
	//�����ϰ��
	if(F_list[i].endsWith("jpg")||F_list[i].endsWith("png")) {
		I_file[I_cnt]=F_list[i];
		I_cnt++;
		}
	if(F_list[i].endsWith("avi")) {
		V_file[V_cnt]=F_list[i];
		V_cnt++;
	}
}

System.out.println("txt ���ϸ��");
for(int i=0;i<T_cnt;i++) {
	System.out.println(T_file[i]);
}
System.out.println("image����");
for(int i=0;i<I_cnt;i++) {
	System.out.println(I_file[i]);
}
System.out.println("video����");
for(int i=0;i<V_cnt;i++) {
	System.out.println(V_file[i]);
}
/*
 * �����ȿ��ִ� ��ϴ�� ���� ����
*/
for(int i=0;i<F_list.length;i++) {
	File temp =new File(objectroot,F_list[i]);
	temp.mkdir();
	temp.delete();
}


/*
 * ���� ���� ���α׷� 
 * */

String Senten= "Graphinc User Interpace";
String Abbrev= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";





/*
 * ���� ���� ���α׷� 
 * */

for(int i=0;i<Senten.length();i++) {
	for(int j=0;j<Abbrev.length();j++) {
		if(Senten.charAt(i)==Abbrev.charAt(j))
		System.out.print(Abbrev.charAt(j));
	}


}


/*
 * ���ϻ��� 
 * */

File mdfile = new File("C:\\Users\\������\\Desktop\\test1\\test.md");
try {
	mdfile.createNewFile();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


/*
 * Ư���ܾ� ���� ���� ���� ���α׷� 
 * */


/*
 * �����̸� �����ϰ� �����ϱ�
 */




/*
 * ����Ȯ�� ������ ������ ������ ����Ʈ ��� 
*/



/*String name =file.getName();
String Fo_list[] = file.list();
//file�� ����Ʈ ��� 

System.out.println("name is "+name);
for(int i=0;i<Fo_list.length;i++) {
	System.out.println(Fo_list[i]);
}

String Fo_mk = destintion+Fo_list

File file1 = new File("test");
File file2 = new File("C:\\Users\\������\\Desktop\\test\\245");
for(int i=0;i<list.length;i++) {
File[] filea =new File[i];
//filea.
}
//file �����̸�����
if(!file1.renameTo(file2)) {
	System.out.println("test");
}
final Formatter x; 
try {
	x = new Formatter("C:\\Users\\������\\Desktop\\test\\tefest.txt");
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
