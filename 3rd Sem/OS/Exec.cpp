#include<iostream>
#include<unistd.h>
#include<sys/wait.h>
using namespace std;
int main()
{
	int pid = fork();
	if(pid==0)
	{
		execlp("ps","ps2",nullptr);
	}
	else
	{
		waitpid(pid, nullptr,0);
	}
}
