package day3country;

public class Country {
private String cname[]=new String[20];
private int cpopulation[]=new int[20];
private double carea[]=new double[20];
private double arr[]=new double[20];
private int n;
public void setAttributes(int n,String cname[],int cpoppulation[],double carea[])
{
	this.n=n;
	this.cname=cname;
    this.cpopulation=cpopulation;
    this.carea=carea;
}

public String largestarea()
{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-1-i;j++)
		{
			if(carea[j]>carea[j+1])
			{
			double temp=carea[j];
				carea[j]=carea[j+1];
				carea[j]=temp;
				
				String tp=cname[j];
				cname[j]=cname[j+1];
				cname[j+1]=tp;
				
				int tm=cpopulation[j];
				cpopulation[j]=cpopulation[j+1];
				cpopulation[j+1]=tm;
						
			}
		}
		
	}
	return cname[n-1];
	
}
public String largestpopulation()
{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-1-i;j++)
		{
			if(cpopulation[j]>cpopulation[j+1])
			{
				int tm=cpopulation[j];
				cpopulation[j]=cpopulation[j+1];
				cpopulation[j+1]=tm;
						
				String tp=cname[j];
				cname[j]=cname[j+1];
				cname[j+1]=tp;
			
			}
		}
		
	}
	return cname[n-1];
}
public String largestDensity(
		)
{
	for(int i=0;i<n;i++)
	{
	
		arr[i]=(double)(cpopulation[i]/carea[i]);
	}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					double tq=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tq;
					int tm=cpopulation[j];
					cpopulation[j]=cpopulation[j+1];
					cpopulation[j+1]=tm;
					String tp=cname[j];
					cname[j]=cname[j+1];
					cname[j+1]=tp;
				
				}
			}
			
		}
		return cname[n-1];
	}
}
