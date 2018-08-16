/**
 * 順時間列出的方式，分為四段，印出左上至右上、右上至右下、右下至左下、左下至左上，之後將行列扣除再循環印出
 * 直到行列扣至0以下。
 */
import java.util.ArrayList;
import java.util.List;
public class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(matrix==null||matrix.length==0)	return result;
        int m = matrix.length;		//陣列-列
        int n = matrix[0].length;	//陣列-行
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
        	//      左上至右上列印  
        	for(int i =0;i<n-1;i++)
        	{
        		result.add(matrix[row][column++]);
        	} 	
        	//      右上至右下列印           
        	for(int i =0;i<m-1;i++)
        	{
        		result.add(matrix[row++][column]);
        	}
        	//      右下至左下列印   
        	for(int i =0;i<n-1;i++)
        	{
        		result.add(matrix[row][column--]);
        	}
        	//      左下至右上列印   
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
