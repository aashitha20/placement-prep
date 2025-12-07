//4 — C: Student struct with marks[3] and calculateAverage
// file: avg_marks.c
#include <stdio.h>

typedef struct {
    char name[50];
    int roll_no;
    int marks[3];
} Student;

double calculateAverage(Student s) {
    int sum = 0;
    for (int i = 0; i < 3; ++i) sum += s.marks[i];
    return sum / 3.0;
}

int main() {
    Student s;
    printf("Enter name roll mark1 mark2 mark3: ");
    scanf("%49s %d %d %d %d", s.name, &s.roll_no, &s.marks[0], &s.marks[1], &s.marks[2]);
    printf("Average = %.2f\n", calculateAverage(s));
    return 0;
}
