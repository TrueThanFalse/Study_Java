package Day10;

public class _05_CardMain {

	public static void main(String[] args) {
		
		_04_CardPack cp = new _04_CardPack();
		
		int index = 0;
		
		for(int i=0; i<cp.getPack().length; i++) {
			cp.getPack()[i].print();
			index++;
			if(index%13 ==0) {
				System.out.println();
			}
		}
		
		System.out.println("----------");
		
		cp.shuffle(); // 셔플
		
		for(int i=0; i<cp.getPack().length; i++) {
			cp.getPack()[i].print();
			index++;
			if(index%13 ==0) {
				System.out.println();
			}
		}

		cp.pick().print();
		Card tmp = cp.pick();
		tmp.print();
		

	}

}
