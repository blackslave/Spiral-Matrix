/**
 * �A�����2�ېw��C�����w�񎑗��ȏ����j������������LIST�V��
 * �A���F [[1,2,3],
 * 	    [4,5,6],
 * 		[7,8,9]]
 * �A�o�F123698754
 * 
 * @author black
 *
 */
public class spiralOrder {
	public static void main(String[] args){
		Solution Solution = new Solution();
		int [][] matrix =  {{ 1, 2 ,  3 ,4 },
						 	{ 5, 6 ,  7 ,8 },
							{ 9, 10, 11,12 }};	
		for(Integer e:Solution.spiralOrder(matrix))
		{
			System.out.print(e+"\t");
		}
	}
}
