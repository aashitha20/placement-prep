//6 — C: Address + Employee (Address is nested); create array of 5 and display employees in a given city
// file: employees_by_city.c
#include <stdio.h>
#include <string.h>

typedef struct {
    char city[50];
    char state[50];
    int pincode;
} Address;

typedef struct {
    int emp_id;
    char name[50];
    Address addr;
} Employee;

int main() {
    Employee a[5];
    for (int i = 0; i < 5; ++i) {
        printf("Enter id name city state pincode: ");
        scanf("%d %49s %49s %49s %d", &a[i].emp_id, a[i].name,
              a[i].addr.city, a[i].addr.state, &a[i].addr.pincode);
    }
    char query[50];
    printf("Enter city to filter: ");
    scanf("%49s", query);
    printf("Employees in %s:\n", query);
    for (int i = 0; i < 5; ++i)
        if (strcmp(a[i].addr.city, query) == 0)
            printf("%d %s\n", a[i].emp_id, a[i].name);
    return 0;
}
