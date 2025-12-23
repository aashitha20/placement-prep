//3 — C: Date struct nested inside Employee (input/display)
// file: employee_with_date.c
#include <stdio.h>

typedef struct {
    int day, month, year;
} Date;

typedef struct {
    int emp_id;
    char name[50];
    Date joining_date;
} Employee;

int main() {
    Employee e;
    printf("Enter id name day month year: ");
    scanf("%d %49s %d %d %d", &e.emp_id, e.name,
          &e.joining_date.day, &e.joining_date.month, &e.joining_date.year);
    printf("ID: %d Name: %s Joined on: %02d-%02d-%04d\n",
           e.emp_id, e.name, e.joining_date.day,
           e.joining_date.month, e.joining_date.year);
    return 0;
}
