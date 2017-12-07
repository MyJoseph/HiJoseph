package Josephlee;

import java.util.Arrays;

public class Num2RMB {
	private String[] hanArr = {"壹" , "贰", "叁" , "肆" , "伍" ,"陆", "柒", "捌", "玖"}; 
    
	private String[] unitArr = {"拾","百","千"};
	/**
	 * 把一个浮点数强制转换成整数部分和 小数部分。
	 * @param num 需要被分解的浮点数。
	 * @return 分解出来的整数部分和小数部分。第一个数组元素是整数部分，第二个数组元素是小数部分
	 */
	private String[] divide(double num)
	{
		//把一个浮点数强制转换成long型，得到他的整数部分。
		long zheng = (long)num;
		//浮点数减去整数部分，得到小数部分。
		long xiao = Math.round(num - zheng ) *100;
		//下面用了两种方法将整数转换为字符串。
		return new String[] {zheng + "", String.valueOf(xiao)};
	}
	/**
	 * 把一个四位数转换成汉字字符串
	 * 
	 */
		private String toHanStr(String numStr)
		{
			String result = "";
			int numLen = numStr.length();
			//依此遍历数字的每一位。
			for (int i=0; i < numLen; i++)
			{
				//把char转换成int型
				int num = numStr.charAt(i) - 48 ;
				//添加单位
				 if (i != numLen && i !=0)
				 {
					 result += hanArr[num] + unitArr[numLen -2 -i];
				 }
				 //否则不要添加单位
				 else
				 {
					 result += hanArr[num];
				 }
			}
			return result;
		}
		public static void main(String[] args)
		{
			Num2RMB nr = new Num2RMB();
			//测试把一个浮点数分解成小数部分和整数部分
			System.out.println(Arrays.toString(nr.divide(256874.152487)));
			System.out.println(nr.toHanStr("3542"));
		}
		
	}
			
