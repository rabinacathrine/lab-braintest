package service;

public class PersonalityCalculator{
	public String findYourBrainType(String str) {
		int q[]=findAnswers(str);
		int  b=q[0]+q[1]+q[2]+q[4]+q[7]+q[9]+q[10]+q[11]+q[13]+q[17]+q[19];
		int c= q[3]=q[3]+q[5]+q[6]+q[8]+q[12]+q[14]+q[15]+q[16]+q[18];
		int x=66-b+c;
		if((x>=20)&&(x<=55))
		{
			String string="leftbrained";
			return string;
		}
		if((x>=56)&&(x<=64))
		{
			String string="nocleapreference";
			return string;
		}
		if((x>=65)&&(x<=100))
				{
			String string= "rightbrained";
			return  string;
				}

		return str;
	}
public int[] findAnswers(String str) {
	
		int i=0;
		String s[]=str.split(",");
		int n=s.length;
		int q[]=new int[n];
		for (String b : s)
		{
			q[i]=Integer.parseInt(b);
			i++;
		}
		return q;

}
}


