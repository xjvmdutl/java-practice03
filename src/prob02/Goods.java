package prob02;

public class Goods {
	private String name;
	private int price;
	private int number;
	public Goods(String n,int p,int num){
		name=n;
		price=p;
		number=num;
	}
	@Override
	public String toString() {
		return name+"(가격:"+price+"원)이 "+number+"개 입고 되었습니다.";
	}
}
