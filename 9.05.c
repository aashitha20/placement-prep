//5 — C++: Student dynamic allocation for n students; find student with highest marks
// file: dynamic_students.cpp
#include <bits/stdc++.h>
using namespace std;

struct Student {
    string name;
    int roll_no;
    float marks;
};

int main() {
    int n;
    cout << "n = "; cin >> n;
    Student *arr = new Student[n];
    for (int i = 0; i < n; ++i) {
        cout << "name roll marks: ";
        cin >> arr[i].name >> arr[i].roll_no >> arr[i].marks;
    }
    int idx = 0;
    for (int i = 1; i < n; ++i) if (arr[i].marks > arr[idx].marks) idx = i;
    cout << "Top student: " << arr[idx].name << " roll " << arr[idx].roll_no << " marks " << arr[idx].marks << "\n";
    delete[] arr;
    return 0;
}
