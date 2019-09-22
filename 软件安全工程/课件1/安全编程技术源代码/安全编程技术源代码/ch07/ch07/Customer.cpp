#include "iostream.h"
class Customer
{
private:
    char* name;
public:
    //构造函数
	Customer(char* name)
    {
        this->name = name;
		cout<<name<<"构造函数被调用"<<endl;
	}
    //其他代码
    //析构函数
	~Customer()
    {		
		cout<<name<<"析构函数被调用"<<endl;
	}
};
int main(){
     Customer* cus1 = new Customer("cus1");  
     delete(cus1); 
     Customer cus2("cus2");    
}
