//11 — C++: Student class with name and marks; dynamically allocate one Student, accept details, display, release
// file: class_student.cpp
#include <iostream>
#include <string>
using namespace std;

class Student {
public:
    string name;
    int marks;
    void display() const { cout << name << " " << marks << "\n"; }
};

int main() {
    Student *s = new Student;
    cout << "Enter name marks: ";
    cin >> s->name >> s->marks;
    cout << "Student: "; s->display();
    delete s;
    return 0;
}
