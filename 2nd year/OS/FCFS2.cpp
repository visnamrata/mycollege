#include<iostream>
using namespace std;

void showProcess(int *b, int n, int *a)
{
	for(int i=0;i<n;i++)
	{
		cout<<"Process "<<i+1<<": "<<"Burst time: "<<b[i]<<"\tArrival time: "<<a[i]<<"\n";
	}
}

void waitingTime(int *b, int n, int *a)
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
			cout<<"Process "<<i+1<<" waiting time: "<<t+b[i-1]-a[i]<<"\n";
			t+=b[i-1];
			av+=t;
		}
	}
	cout<<"Average waiting time: "<<av/n<<"ms";
}

void turnAroundTime(int *b, int n, int *a)
{
	cout<<"\n\nTurnAround time: \n";
	double t=0;
	double av;
	for(int i=0;i<n;i++)
	{
		cout<<"Process "<<i+1<<" TurnAround time: "<<t+b[i]-a[i]<<"\n";
		t+=b[i];
		av+=t;		
	}
	cout<<"Average TurnAround time: "<<av/n<<"ms";
}


int main()
{
	int n, b[100], a[100];

	cout<<"Enter number of process: ";
	cin>>n;
	for(int i=0;i<n;i++)
	{
		cout<<"Enter burst time for "<<i+1<<" process: ";
		cin>>b[i];
	}
	cout<<"\n\nNow give arrival time for all process: \n\n";
	for(int i=0;i<n;i++)
	{
		cout<<"Enter Arrival time time for "<<i+1<<" process: ";
		cin>>a[i];
	}

	showProcess(b, n, a);
	waitingTime(b, n, a);
	turnAroundTime(b,n, a);
}
