package day0112;

/**
 * 이차원 배열([행][열])
 * 행의수 : 배열명.length
 * 열의 수: 배열명[행의번호].length
 * @author user
 *
 */
public class UseArray2_1 {
	
	public void scoreProcess() {
		String[] names = {"강명준","강산","김정하","김현우","김진영"};
		int[][] score = {{90, 94, 91},{86, 84, 71},{96,99,100},{75,76,73},{63,69, 69}};
		
		System.out.println("--------------------------------------------------------");
		System.out.println("번호\t이름\t자바\t오라클\tHTML\t총 점\t평균");
		System.out.println("--------------------------------------------------------");
		
		int totalScore = 0;
		for(int i=0; i<names.length; i++) {
			System.out.printf("%d\t%s\t",(i+1), names[i]);
			
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%d\t",score[i][j]);
				totalScore+= score[i][j];
			} //end for
			System.out.printf("%d\t%.2f\n",totalScore, (double)totalScore/score[i].length); //데이터형 문에 totalScore/score[i].length 로만 안됨
			totalScore=0;
			
		}//end for
		
		
		//////////////////////////////////////////////////[ 숙 제 ]/////////////////////////////////////////////////////////////////
		System.out.println("--------------------------------------------------------");
		System.out.printf("응시 인원 [%d]명\n",score.length);
		
		int sum = 0;
		for(int[] i:score) {
			for(int j: i) {
				sum+=j;				
			}
		}
		//1. 코드를 직접 기술해서 처리
		System.out.printf("전체 총점 [%d]점, 전체 평균 [%.2f]\n", sum, (double)sum/(score.length*score[0].length));
		
		//숙제
		//아래의 작업을 instance variable와 method를 작성하여 처리 결과를 출력
		eachScore(score);
		greatJava(score);
		bestStudent(score, names);

	}//UseArray2

	public void eachScore(int[][] score) {
		int java = 0, oracle=0, html=0;		
		for(int i=0; i<score.length;i++) {
			java+=score[i][0];
			oracle+=score[i][1];
			html+=score[i][2];
		}//end for
		System.out.printf("자바 총점[%d], 오라클 총점[%d]점, Html 총점[%d]\n",java,oracle,html);

	}//eachScore
	
	public void greatJava(int[][] score) {
		int max = score[0][0];
		for(int i=1; i<score.length;i++) {
			if(max<score[i][0]) {
				max = score[i][0];
			}//end if
		}//end for
		System.out.printf("자바 최고점[%d]\n",max);

	}//greatJava
	
	
//	1등번호 [0], 이름[]
	public void bestStudent(int[][] score, String[] name) {
		int[] totalArr = new int[score.length];
		int max ;
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				totalArr[i] += score[i][j]; 
			}//endfor
			
			max = totalArr[0];
			if(max<totalArr[i]) {
				max = totalArr[i];
				System.out.printf("1등번호[%d], 이름: [%s]\n",i+1,name[i]);
			}//end if
			
		}//endfor
	}//bestStudent
		
		

	
	public static void main(String[] args) {
		new UseArray2_1().scoreProcess();
		System.out.println();
	
	}//main
	
}//class
