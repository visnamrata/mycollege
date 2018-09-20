#include<iostream>
using namespace std;

void showProcess(int *b, int n)
{
	for(int i=0;i<n;i++)
	{
		cout<<"Process "<<i+1<<": "<<b[i]<<"\n";
	}
}

void waitingTime(int *b, int n)
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
			cout<<"Process "<<i+1<<" waiting time: "<<t+b[i-1]<<"\n";
			t+=b[i-1];
			av+=t;
		}
	}
	cout<<"Average waiting time: "<<av/n<<"ms";
}

void turnAroundTime(int *b, int n)
{
	cout<<"\n\nTurnAround time: \n";
	double t=0;
	double av;
	for(int i=0;i<n;i++)
	{
		cout<<"Process "<<i+1<<" TurnAround time: "<<t+b[i]<<"\n";
		t+=b[i];
		av+=t;		
	}
	cout<<"Average TurnAround time: "<<av/n<<"ms";
}


int main()
{
	int n, b[100];

	cout<<"Enter number of process: ";
	cin>>n;
	for(int i=0;i<n;i++)
	{
		cout<<"Enter burst time for "<<i+1<<" elemet: ";
		cin>>b[i];
	}

	showProcess(b, n);
	waitingTime(b, n);
	turnAroundTime(b,n);
}
