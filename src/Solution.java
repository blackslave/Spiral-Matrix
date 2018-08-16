/**
 * �����ԗ�o�I�����C���׎l�i�C��o���㎊�E��A�E�㎊�E���A�E���������A����������C�V�㛒�s��J���ďz��o
 * �����s��J��0�ȉ��B
 */
import java.util.ArrayList;
import java.util.List;
public class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(matrix==null||matrix.length==0)	return result;
        int m = matrix.length;		//�w��-��
        int n = matrix[0].length;	//�w��-�s
        int row =0;
        int column=0;
        while(m>0 && n>0)
        {
        	if(m==1)
        	{
        		for(int i =0;i<n;i++)
        		{
        			result.add(matrix[row][column++]);
        		}
        		break;
        	}
        	else if(n==1)
        	{
            	for(int i =0;i<m;i++)
            	{
            		result.add(matrix[row++][column]);
            	}
            	break;
            }	
        	//      ���㎊�E����  
        	for(int i =0;i<n-1;i++)
        	{
        		result.add(matrix[row][column++]);
        	} 	
        	//      �E�㎊�E�����           
        	for(int i =0;i<m-1;i++)
        	{
        		result.add(matrix[row++][column]);
        	}
        	//      �E�����������   
        	for(int i =0;i<n-1;i++)
        	{
        		result.add(matrix[row][column--]);
        	}
        	//      �������E����   
        	for(int i =0;i<m-1;i++)
        	{
        		result.add(matrix[row--][column]);
        	}	
        	row++;
        	column++;
        	m=m-2;
        	n=n-2;
        }
		return result;
    }
}
