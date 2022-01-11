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
	cout<<"Choose a symbol"<<endl;
	cin>>x;
		//
		cout<<"choose the amount of times you want your symbol to be repeated"<<endl;
		cin>>z;
			//
			cout<<"Write 3 for diagonal line, 2 for vertical line, or 1 for horizontal line"<<endl;
			cin>>y;
	if(y==1)
	{
	for(y=0;y <= z;y++)
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
			if(y==3)
			{
			for(y=0;y<z;y++)
			{
			gotoxy(y+1,y+5);
			cout<<x;
		}
		}
}
	