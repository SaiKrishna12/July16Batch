package day19;

public class DoubledimensionalArrays {

	public static void main(String[] args) {
		String[][] str=new String[2][3];
		str[0][0]="selenium";
		str[0][1]="qtp";
		str[0][2]="lr";
		
		str[1][0]="jmeter";
		str[1][1]="codedui";
		str[1][2]="soapui";
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++)
			{
				System.out.print(str[i][j]+"   ");
			}
			System.out.println();
		}
	}
}

