
//System.err.println : 에러출력메세지 
public class Customer {
	
	int money = 1000;		//소유금액
	int bonusPoint = 0;		//보너스점수
	
	//매개변수를 부모객체로 전달함으로써 불필요한 오버로딩을 줄임
	void buy(Product product) {
		//이처럼 무언가를 하기전에 확인부터 해야한다~!!!! - Validation
		if(money < product.price) {
			System.err.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;	//return *중요* return시켜서 메서드를 수행시키지 않게 하기 위해~!!!
		}/* 위 if문 코드 기억해두기 */
		money = money - product.price;
		bonusPoint = bonusPoint + product.bonusPoint;
		System.out.println(product + "을/를 구입하셨습니다.");	
		//product.toString이 아닌 tv.toString이 출력됨
	}
	
/*	
	//변수만 다르고 함수가 동일함 -> 공통부모클래스로 변수를 바꿈
	void buy(Audio audio) {
		if(money < audio.price) {
			System.err.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return; 
		} 
		money = money - audio.price;
		bonusPoint = bonusPoint + audio.bonusPoint;
		System.out.println(audio + "을 구입하셨습니다.");
	}
	
	void buy(Computer computer) {
		if(money < computer.price) {
			System.err.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;	
		}
		money = money - computer.price;
		bonusPoint = bonusPoint + computer.bonusPoint;
		System.out.println(computer + "을 구입하셨습니다.");
	}
*/	
	

	@Override
	public String toString() {
		return "Customer [money=" + money + ", bonusPoint=" + bonusPoint + "]";
	}
	
	

}
