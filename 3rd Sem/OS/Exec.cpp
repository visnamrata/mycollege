#include<iostream>
#include<unistd.h>
#include<sys/wait.h>
using namespace std;
int main()
{
	int pid = fork();
	if(pid==0)
	{
		cout<<"Hello";
		execlp("ps","ps2",nullptr);
		cout<<"Hello2";
	}
	else
	{
		waitpid(pid, nullptr,0);
	}
}