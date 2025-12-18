//10 — C++: Dynamically allocate array of integers (user input), display and deallocate
// file: dyn_array.cpp
#include <iostream>
using namespace std;
int main() {
    int n; cout << "n = "; cin >> n;
    int *a = new int[n];
    for (int i = 0; i < n; ++i) { cout << "a[" << i << "] = "; cin >> a[i]; }
    cout << "Array: ";
    for (int i = 0; i < n; ++i) cout << a[i] << " ";
    cout << "\n";
    delete[] a;
    return 0;
}
