package Josephlee;

import java.util.Arrays;

public class Num2RMB {
	private String[] hanArr = {"Ҽ" , "��", "��" , "��" , "��" ,"½", "��", "��", "��"}; 
    
	private String[] unitArr = {"ʰ","��","ǧ"};
	/**
	 * ��һ��������ǿ��ת�����������ֺ� С�����֡�
	 * @param num ��Ҫ���ֽ�ĸ�������
	 * @return �ֽ�������������ֺ�С�����֡���һ������Ԫ�����������֣��ڶ�������Ԫ����С������
	 */
	private String[] divide(double num)
	{
		//��һ��������ǿ��ת����long�ͣ��õ������������֡�
		long zheng = (long)num;
		//��������ȥ�������֣��õ�С�����֡�
		long xiao = Math.round(num - zheng ) *100;
		//�����������ַ���������ת��Ϊ�ַ�����
		return new String[] {zheng + "", String.valueOf(xiao)};
	}
	/**
	 * ��һ����λ��ת���ɺ����ַ���
	 * 
	 */
		private String toHanStr(String numStr)
		{
			String result = "";
			int numLen = numStr.length();
			//���˱������ֵ�ÿһλ��
			for (int i=0; i < numLen; i++)
			{
				//��charת����int��
				int num = numStr.charAt(i) - 48 ;
				//��ӵ�λ
				 if (i != numLen && i !=0)
				 {
					 result += hanArr[num] + unitArr[numLen -2 -i];
				 }
				 //����Ҫ��ӵ�λ
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
			//���԰�һ���������ֽ��С�����ֺ���������
			System.out.println(Arrays.toString(nr.divide(256874.152487)));
			System.out.println(nr.toHanStr("3542"));
		}
		
	}
			
