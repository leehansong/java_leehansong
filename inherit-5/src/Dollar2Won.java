import java.util.Scanner;
abstract class Converter{ //추상메소드 변환기
	protected double ratio; //비율
	abstract protected double convert(double src); 
	abstract protected String srcString(); 
	abstract protected String destString();
	
	public void run() { //일반메소드
		Scanner scanner=new Scanner(System.in);
		System.out.println(srcString()+"를"+destString());
		System.out.print(srcString()+"를 입력하세요>> ");
		double val =scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: "+res+destString());
		scanner.close();
	}
	
}
public class Dollar2Won extends Converter {
	public Dollar2Won(double ratio){
		this.ratio = ratio;
	}
	
	@Override 
	protected double convert(double src) {
		return src*ratio; //원을 달러로 변환
	}
	@Override
	protected String srcString() {
		return "달러";
	}
	@Override
	protected String destString() {
		return "원";
	}

	public static void main(String[] args) {
		Dollar2Won toDollar = new Dollar2Won(1200); //1200원에 1달러
		toDollar.run();
	}

}
