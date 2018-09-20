#include<iostream>
using namespace std;

int SJF(int a[][100], int n)
{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(a[i][0]<a[j][0])
			{
				int t=a[i][0];
				int index= a[i][1];
				a[i][0] = a[j][0];
				a[j][0] = t;
	
				a[i][1]= a[j][1];
				a[j][1]= index;
			}
		}
	}
}

int display(int b[][100], int n)
{
	for(int i=0;i<n; i++)
	{
		cout<<"\n"<<b[i][1]<<":  "<<b[i][0]; 
	}
}

int waitingTime(int b[][100], int n)
{
	cout<<"\n\nWaiting time: \n";
	double t=0;
	double av;
	for(int i=0;i<n;i++)
	{
		if(i==0)
		{
			cout<<"Process "<<i+1<<" waiting time: "<<t<<"\n";
			av+=t;
		}
		else
		{	
			cout<<"Process "<<i+1<<" waiting time: "<<t+b[i-1][0]<<"\n";
			t+=b[i-1][0];
			av+=t;
		}
	}
	cout<<"Average waiting time: "<<av/n<<"ms";
}
void turnAroundTime(int b[][100], int n)
{
	cout<<"\n\nTurnAround time: \n";
	double t=0;
	double av;
	for(int i=0;i<n;i++)
	{
		cout<<"Process "<<i+1<<" TurnAround time: "<<t+b[i][0]<<"\n";
		t+=b[i][0];
		av+=t;		
	}
	cout<<"Average TurnAround time: "<<av/n<<"ms";
}

int main()
{
	int n, b[100][100];

	cout<<"Enter number of process: ";
	cin>>n;
	for(int i=0;i<n;i++)
	{
		b[i][1]=i+1;
		cout<<"Enter burst time for "<<i+1<<" process: ";
		cin>>b[i][0];
	}

	SJF(b, n);
	display(b, n);
	waitingTime(b,n);
	turnAroundTime(b,n);
}
