package str.exam;

public class StringLv4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "자바워크: 자바를 자바라"; // 기준
		String changeStr = "";          		// 결과
		
		String temp = "";			//임시 변수
		String replaceStr = "DB";	//변경할 문자열
		
		//1. 우선, 자바를 DB로 일괄 변경
		temp = originStr.replace("자바", replaceStr);
		//2. 마지막 DB가 있는 인덱스값 확인
		int idx = temp.lastIndexOf(replaceStr);
		System.out.println(idx);
		//3. 확인된 위치와 길이로 원하는 범위만 조합 
		changeStr = temp.substring(0,idx) + "자바" 
				+ temp.substring(idx+replaceStr.length(),temp.length());
				
		
//		자바워크: 자바를 자바라를 DB워크: DB를 자바라로 변경하여 출력하시오 
		System.out.println(originStr);
		System.out.println(changeStr);
		
		

		
		/*	
		String findStr = "자바"; 	//찾는 문자열
		String[] arr = originStr.split(findStr,4);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		changeStr = "DB"+arr[1]+"DB"+arr[2]+findStr+arr[3];
		*/
	}

}
