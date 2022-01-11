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
/////////////////////////////
int l1;
int w1;
char sym1;
int i1;
int x1;
cout<<"enter the length of your box"<<endl;
cin>>l1;
cout<<"enter the width of your box"<<endl;
cin>>w1;
cout<<"enter the symbol you would like to use to draw your box"<<endl;
cin>>sym1;
	for(i1=0;i1<l1;i1++)
	{
	for(x1=0;x1<w1;x1++)
	{
		gotoxy(x1+2,i1+7);
		cout<<sym1;
	}
	}
	}
	}
}