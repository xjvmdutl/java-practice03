package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;++i) {
			System.out.print("입력 :");
			String s= sc.nextLine();
			String[] arr = s.split(" ");
			String name = arr[0];
			int price = Integer.parseInt(arr[1]);
			int number = Integer.parseInt(arr[2]);
			Goods g = new Goods(name,price,number);
			System.out.println(g.toString());
		}
		sc.close();
		*/
		Scanner sc =new Scanner(System.in);
		Goods[] goods = new Goods[3];
		for(int i = 0;i<COUNT_GOODS;++i) {
			System.out.print("입력 :");
			String info =sc.nextLine();
			String[] data = info.split(" ");
			String name = data[0];
			int price = Integer.parseInt(data[1]);
			int countStock = Integer.parseInt(data[2]);
			goods[i]=new Goods(name,price,countStock);
		}
		for(int i=0;i<goods.length;++i)
			System.out.println(goods[i].toString());
		
		sc.close();
	}
}
