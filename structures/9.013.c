//13 — C++: Dynamically allocate integer array with new, accept values, then resize to double its size (simulate realloc)
// file: resize_array.cpp
#include <iostream>
using namespace std;

int main() {
    int n; cout << "n = "; cin >> n;
    int *a = new int[n];
    for (int i = 0; i < n; ++i) { cout << "a["<<i<<"] = "; cin >> a[i]; }
    // Resize: allocate new block (double), copy, delete old
    int newn = n * 2;
    int *b = new int[newn];
    for (int i = 0; i < n; ++i) b[i] = a[i];
    // initialize the rest (optional)
    for (int i = n; i < newn; ++i) b[i] = 0;
    delete[] a; // release old memory
    a = b; n = newn;
    cout << "Resized array (size " << n << "):\n";
    for (int i = 0; i < n; ++i) cout << a[i] << " ";
    cout << "\n";
    delete[] a;
    return 0;
}
