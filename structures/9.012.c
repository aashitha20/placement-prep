//12 — C++: Dynamically allocate 2D int array using int** (rows x cols), accept elements, free memory
// file: dyn_2d.cpp
#include <iostream>
using namespace std;

int main() {
    int r,c; cout << "rows cols: "; cin >> r >> c;
    int **mat = new int*[r];
    for (int i = 0; i < r; ++i) mat[i] = new int[c];
    for (int i = 0; i < r; ++i)
        for (int j = 0; j < c; ++j) { cout << "mat["<<i<<"]["<<j<<"] = "; cin >> mat[i][j]; }
    cout << "Matrix:\n";
    for (int i = 0; i < r; ++i) {
        for (int j = 0; j < c; ++j) cout << mat[i][j] << " ";
        cout << "\n";
    }
    for (int i = 0; i < r; ++i) delete[] mat[i];
    delete[] mat;
    return 0;
}
