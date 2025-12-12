#include <iostream>
void fun(int){ std::cout<<"fun(int)\n"; }
void fun(double){ std::cout<<"fun(double)\n"; }
int main(){
    fun('A'); // prints: fun(int)
}
