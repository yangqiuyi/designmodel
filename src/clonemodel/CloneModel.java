package clonemodel;


import java.util.ArrayList;
import java.util.List;

class CloneModel {
	
	public static void main(String args[]) {
		WordDecument originDoc = new WordDecument();
		originDoc.setText("����һƪ�ĵ�");
		originDoc.addImage("ͼƬ1");
		originDoc.addImage("ͼƬ2");
		originDoc.addImage("ͼƬ3");
		originDoc.showDecument();
		
		WordDecument doc2 = originDoc.clone();
		doc2.showDecument();
		
		doc2.setText("�����޸ĺ��doc2");
		doc2.showDecument();
		originDoc.showDecument();
	}
	

}
