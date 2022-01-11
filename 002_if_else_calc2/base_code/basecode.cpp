// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int x = 0;
	int y = 0;
	int a1 = 0;
	cout<<"Choose 2 numbers to be added, multiplied, divided, or subtracted"<<endl;
	cin>>x;
	cin>>y;
	cout<<"type the number 1 if you want your number to be added"<<endl;
	cout<<"type the number 2 if you want your number to be subtracted"<<endl;
	cout<<"type the number 3 if you want your number to be divided"<<endl;
	cout<<"type the number 4 if you want your number to be multiplied"<<endl;
	cin>>a1;
	if(a1 == 1)
	{
	cout<<x+y<<endl;
	}
	else if(a1== 2)
	{
	cout<<x-y<<endl;
	}
	else if(a1 == 3)
	{
	cout<<x*y<<endl;
	}
	else if(a1 == 4)
	{
	cout<<x/y<<endl;
	}

}
