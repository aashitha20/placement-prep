//1 — C: Employee struct; input 5 employees and display the one with highest salary
// file: highest_salary.c
#include <stdio.h>
#include <string.h>

typedef struct {
    int emp_id;
    char name[50];
    double salary;
} Employee;

int main() {
    Employee a[5];
    for (int i = 0; i < 5; ++i) {
        printf("Employee %d id name salary: ", i+1);
        scanf("%d %49s %lf", &a[i].emp_id, a[i].name, &a[i].salary);
    }
    int idx = 0;
    for (int i = 1; i < 5; ++i)
        if (a[i].salary > a[idx].salary) idx = i;
    printf("\nHighest salary:\nID: %d Name: %s Salary: %.2f\n",
           a[idx].emp_id, a[idx].name, a[idx].salary);
    return 0;
}
