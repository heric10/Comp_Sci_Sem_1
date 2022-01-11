// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int l;
	int w;
	char sym;
	int x;
	int y;
	int i;
	int z;
	cout<<"Enter the length of your box"<<endl;
	cin>>l;
		cout<<"Enter the width of your box"<<endl;
		cin>>w;
			cout<<"Enter the symbol your box should be made out of"<<endl;
			cin>>sym;
				cout<<"enter the x-cordinate of your box"<<endl;
				cin>>x;
					cout<<"enter the y-cordinate of your box"<<endl;
					cin>>y;
	for(i=0;i<l;i++)
		{
		for(z=0;z<w;z++)
		{
		gotoxy(z+x,i+y);
		cout<<sym;
		}
		}
}
