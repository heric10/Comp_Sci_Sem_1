// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
int l;
int w;
char sym;
int i;
int x;
cout<<"enter the length of your box"<<endl;
cin>>l;
cout<<"enter the width of your box"<<endl;
cin>>w;
cout<<"enter the symbol you would like to use to draw your box"<<endl;
cin>>sym;
	for(i=0;i<l;i++)
	{
	for(x=0;x<w;x++)
	{
		gotoxy(x+2,i+7);
		cout<<sym;
	}
	}
}
