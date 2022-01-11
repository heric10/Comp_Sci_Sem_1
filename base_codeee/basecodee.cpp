// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
char sym;
int i = 3;
cout<<"Choose what symbol you want it to snow with"<<endl;
cin>>sym;
cout<<endl;
while(true){
gotoxy(5,i);
cout<<sym<<endl;
sleep(1);
i++;
gotoxy(5,i-1);
cout<<"   "<<endl;

}
}