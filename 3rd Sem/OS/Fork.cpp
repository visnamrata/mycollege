#include<iostream>
#include<unistd.h>
using namespace std;
int main()
{
	cout<<"Forking!\n";
	int pid = fork();
	cout<<"Forked!!\n";
	cout<<"pid = "<<pid<<"\n";
}