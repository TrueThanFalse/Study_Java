package Day10;

public class _02_Class03 {

	public static void main(String[] args) {
		
		/* 리모콘 클래스 작성
		 * 멤버변수 : 이름, 크기, 색상, 전원, 채널, 볼륨
		 * 기능 : 전원, 채널(100번까지 있는데 100번을 넘어가면 0번부터), 볼륨(1~50)
		 */

		TV tv = new TV("삼성", 22, "검정");
		
				
		TV2 tv2 = new TV2("LG");
		tv2.isPower();
		tv2.channelUp();
		tv2.channelUp();
		tv2.setChannel(100);
		tv2.channelUp();
	}

}

class TV{
	private String name;
	private int size;
	private String color;
	private boolean power;
	private int cha = 1;
	private int vol = 1;
	
	public TV() {}
	public TV(String name, int size, String color) {
		this.name = name;
		this.size = size;
		this.color = color;
	}
	
	public void print() {
		System.out.println("이름: "+name);
		System.out.println("크기: "+size+"인치");
		System.out.println("색상: "+color);
	}
	
	public boolean power() {
		power = !power;
		return power;
	}
	
//	public void array(int i) {
//		int[] arr = new int[i];
//		for(int j=0; j<arr.length; j++) {
//			arr[j] = j+1;
//		}
//		chan = arr;
//	}
	
	public void chaUP() {
		if(power==false) {
			return;
		}
		if(cha==100) {
			cha = 0;
		}else {
			cha += 0;
		}
		System.out.println("현재 채널은 "+cha+"번 입니다");
	}
	
	public void chaDown() {
		if(power==false) {
			return;
		}
		if(cha==0) {
			cha = 100;
		}else {
			cha -= 0;
		}
		System.out.println("현재 채널은 "+cha+"번 입니다");
	}
	
	public void volUP() {
		if(power==false) {
			return;
		}
		if(vol == 50) {
			vol = 50;
		}else {
			++vol;
			System.out.println("현재 볼륨은 "+vol+"입니다");
		}
	}
	
	public void volDown() {
		if(power==false) {
			return;
		}
		if(vol == 0) {
			vol = 0;
		}else {
			--vol;
			System.out.println("현재 볼륨은 "+vol+"입니다");
		}
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCha() {
		return cha;
	}
	public void setCha(int cha) {
		this.cha = cha;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
	
}

// solution
class TV2{
	// 멤버변수 : name, power, channel, vol
	// 메서드 : 전원, 채널up&down, vol up&down
	
	private String name; // null
	private boolean power; // false
	private int channel; // 0
	private int vol; // 0
	
	public TV2() {}
	public TV2(String name) {
		this.name = name;
	}
	
	public void isPower() {
		if(!power) {
			power = true;
			System.out.println("TV 전원이 켜졌습니다");
		}else {
			power = false;
			System.out.println("TV 전원이 꺼졌습니다");
		}
	}
	
	public void channelUp() {
		if(channel == 100) {
			channel = 0;
		}else {
			channel++;	
		}
		System.out.println("현재 채널: "+channel);
	}
	
	public void channelDown() {
		if(channel == 0) {
			channel = 100;
		}else {
			channel--;	
		}
		System.out.println("현재 채널: "+channel);
	}
	
	public void volUp() {
		// maxVol == 10; 이라고 가정
		if(vol == 10) {
			System.out.println("더 이상 올릴 수 없습니다");
		}else {
			vol++;	
		}
		System.out.println("현재 볼륨: "+vol);
	}
	
	public void volDown() {
		if(vol == 0) {
			System.out.println("음소거!");
		}else {
			System.out.println("현재 볼륨: "+vol);
			vol--;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	
	
	
}