#include <iostream>
#define SQR(x) ((x)*(x))

int main(){
    int i = 3;
    std::cout << SQR(i++) << "\n"; // expands to ((i++)*(i++)) -> i increments twice -> UB-ish / unexpected
    return 0;
}
