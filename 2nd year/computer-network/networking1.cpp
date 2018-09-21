#include<iostream>
using namespace std;
void sender(int *a, int n)
{
	int pbit, temp=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]==1)
			temp++;
	}
	if(temp%2==0)
		pbit=1;
	else
		pbit=0;
	a[n]=pbit;
	cout<<"\nMessage Send: \n";
	for(int j=0;j<n;j++)
		cout<<a[j]<<" ";
	cout<<"\nPenetary bit: "<<a[n]<<"\n\n";
}

void receiver(int *a, int n)
{
	int pbit, temp=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]==1)
			temp++;
		//	cout<<temp;
	}
	cout<<"\nMessage Received: \n";
	for(int j=0;j<n;j++)
		cout<<a[j]<<" ";
	cout<<"\nPenetary bit: "<<a[n]<<"\n\n";
	if(temp%2==0 && a[n]==1)
		cout<<"Message is correct";
	else if(temp%2==1 && a[n]==0)
		cout<<"Message is correct";
	else
		cout<<"Message is not correct!!!, Send it again";
}

int main()
{
	int n,a[100];
	cout<<"Enter number of bits you want to send: ";
	cin>>n;
	cout<<"\nNow enter your message(0 or 1)\n\n";
	for(int i=0;i<n;i++)
	{
		cout<<"Enter "<<i+1<<" bit: ";
		cin>>a[i];
	}
	sender(a,n);
	receiver(a,n);
}
