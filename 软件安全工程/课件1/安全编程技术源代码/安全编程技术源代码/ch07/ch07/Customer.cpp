#include "iostream.h"
class Customer
{
private:
    char* name;
public:
    //���캯��
	Customer(char* name)
    {
        this->name = name;
		cout<<name<<"���캯��������"<<endl;
	}
    //��������
    //��������
	~Customer()
    {		
		cout<<name<<"��������������"<<endl;
	}
};
int main(){
     Customer* cus1 = new Customer("cus1");  
     delete(cus1); 
     Customer cus2("cus2");    
}
