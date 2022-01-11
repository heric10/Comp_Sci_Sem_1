// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
int x;
int y;
int l;
char sym;
int i;
cout<<"how long do you want your line?"<<endl;
cin>>l;
cout<<"what symbol should your box be made out of?"<<endl;
cin>>sym;
cout<<"what is the x-cordinate of your line?"<<endl;
cin>>x;
cout<<"What is the y-cordinate of your line?"<<endl;
cin>>y;
for(i=0;i<l;i++)
	{
	gotoxy(x+i,y);
	cout<<sym;
	}
}