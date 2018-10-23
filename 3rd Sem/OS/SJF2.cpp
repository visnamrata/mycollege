#include<iostream>
using namespace std;
int waitTime[100];
int completeTime[100];

void BubbleSort(int a[][100],int s[], int n) 
{
	for (int i = 0; i < n-1; i++) 
	{
		for (int j = 0; j < n-i-1; j++)
		{
			if(a[1][s[j]]>a[1][s[j+1]])
			{
				int t=s[j+1];
				s[j+1]=s[j];
				s[j]=t;
			}
		}
	}
}

int sort(int n, int a[][100], int currentTime, int *s) //return no. of process avialable at a particular
{										  //time by sorting on the basis of SJF
	int t=0;
	for(int i=0;i<n;i++)
	{
		if(a[0][i]<=currentTime && a[4][i]==0)//if process is arrival time is less than current time and process is not completed
		{
			s[t]=i;
			a[3][i]=1; 
			t++;
		}	
		
	}
	BubbleSort(a, s, t); 
	return t;
}

void showProcess(int n, int a[][100])
{
	int totalBurstTime;
	for(int i=0;i<n;i++)
	{
		totalBurstTime+=a[1][i];
	}
	for(int i=0;i<=totalBurstTime;i++)
	{
		int s[100];
		int size = sort(n, a, i, s);
		a[1][s[0]]--;
		if(a[1][s[0]]==0)
		{
			cout<<"\n  Process "<<s[0]+1<<" is completed.";
			a[4][s[0]]=1;//this means process is complete
			completeTime[s[0]]=i+1;//note down completion time
		}
		for(int j=1;j<size;j++)
		{
			waitTime[s[j]]++; //if process wait then increase waiting time
		}
	}
}

int main()
{
	/*
		a[0] = arrival time
		a[1] = burst time
		a[2] = process id
		a[3] = waiting time
		a[4] = completion time
	*/
	int n, a[5][100];

	cout<<"Enter number of process: ";
	cin>>n;
	for(int i=0;i<n;i++)
	{
		a[2][i] = i;//process id
		a[3][i] = 0;
		a[4][i] = 0;
		cout<<"Enter burst time for "<<i+1<<" process: ";
		cin>>a[1][i];
	}

	cout<<"\n\nNow give arrival time for all process: \n\n";
	for(int i=0;i<n;i++)
	{
		cout<<"Enter Arrival time time for "<<i+1<<" process: ";
		cin>>a[0][i];
	}

	showProcess(n, a);

	double avgWait = 0;
	cout<<"\n\n";
	for(int i=0;i<n;i++)
	{
		cout<<"Waiting Time for process "<<i+1<<": "<<waitTime[i]<<"\n";
		avgWait+=waitTime[i];
	}
	cout<<"\nAverage Waiting time is: "<<((double)avgWait/n)<<"\n\n";

	cout<<"\n";
	for(int i=0;i<n;i++)
	{
		cout<<"Completion Time for process "<<i+1<<": "<<completeTime[i]<<"\n";
	}
	cout<<"\n\n";

	double avgTAtime = 0;
	for(int i=0;i<n;i++)
	{
		cout<<"TurnAround Time for process "<<i+1<<": "<<(completeTime[i]-a[0][i])<<"\n";
		avgTAtime+=(completeTime[i]-a[0][i]);
	}
	cout<<"\nAverage TurnAround time is: "<<((double)avgTAtime/n)<<"\n\n";
}