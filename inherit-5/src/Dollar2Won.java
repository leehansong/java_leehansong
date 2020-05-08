import java.util.Scanner;
abstract class Converter{ //�߻�޼ҵ� ��ȯ��
	protected double ratio; //����
	abstract protected double convert(double src); 
	abstract protected String srcString(); 
	abstract protected String destString();
	
	public void run() { //�Ϲݸ޼ҵ�
		Scanner scanner=new Scanner(System.in);
		System.out.println(srcString()+"��"+destString());
		System.out.print(srcString()+"�� �Է��ϼ���>> ");
		double val =scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: "+res+destString());
		scanner.close();
	}
	
}
public class Dollar2Won extends Converter {
	public Dollar2Won(double ratio){
		this.ratio = ratio;
	}
	
	@Override 
	protected double convert(double src) {
		return src*ratio; //���� �޷��� ��ȯ
	}
	@Override
	protected String srcString() {
		return "�޷�";
	}
	@Override
	protected String destString() {
		return "��";
	}

	public static void main(String[] args) {
		Dollar2Won toDollar = new Dollar2Won(1100); //1100���� 1�޷�
		toDollar.run();
	}

}
