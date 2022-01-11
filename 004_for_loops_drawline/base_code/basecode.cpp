// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char x = 0;
	int y = 0;
	int z = 0;
	//
	cout<<"choose your symbol"<<endl;
	cin>>x;
	//
	cout<<"choose how many times you want it to be repeated"<<endl;
	cin>>z;
	//
	cout<<"write 2 for verticle line or 1 for horizontal line"<<endl;
	cin>>y;
	//
	if(y == 1)
	{
	for(y = 0;y <= z;y++)
	{
	cout<<x;
	}
	}
if(y==2)
{
for(y = 0;y <= z;y++)
{
cout<<x<<endl;
}
}
}
