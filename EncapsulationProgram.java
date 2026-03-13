package Assignments;

public class EncapsulationProgram {
private int num=20;
	public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
	public static void main(String[] args) {
		//int num=30;
		//System.out.println(num);
		EncapsulationProgram k1=new EncapsulationProgram();
		
		k1.setNum(40);
		System.out.println(k1.getNum());
		
	}

}
