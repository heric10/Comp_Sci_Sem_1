// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"Happy Holidays!"<<endl;
	char sym1;
	int i = 3;
	cout<<"Choose what symbol you want it to snow with"<<endl;
	cin>>sym1;
	cout<<endl;
	while(true){
	gotoxy(5,i);
	cout<<sym1<<endl;
	sleep(1);
	cout<<" "<<endl;
	i++;
	gotoxy(11,i-5);
	cout<<sym1<<endl;
	sleep(1);
	cout<<" "<<endl;
	i++;
	gotoxy(8,i-3);
	cout<<sym1<<endl;
	sleep(1);
	cout<<" "<<endl;
	i++;
	gotoxy(5,i-4);
	cout<<sym1<<endl;
	sleep(1);
	cout<<" "<<endl;
	i++;
	gotoxy(10,i-7);
	cout<<sym1<<endl;
	sleep(1);
	cout<<" "<<endl;
	i++;
	gotoxy(8,i-1);
	cout<<sym1<<endl;
	sleep(1);
	cout<<" "<<endl;
	i++;
	}
	}