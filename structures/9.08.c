//8 — C: Employee (id,name,salary) — store details in file and then copy contents from file to new file and display
// file: file_employees.c
#include <stdio.h>

typedef struct {
    int id;
    char name[50];
    double salary;
} Emp;

int main() {
    Emp e[3];
    for (int i = 0; i < 3; ++i) {
        printf("Enter id name salary: ");
        scanf("%d %49s %lf", &e[i].id, e[i].name, &e[i].salary);
    }
    FILE *f = fopen("employees.dat","wb");
    fwrite(e, sizeof(Emp), 3, f);
    fclose(f);

    // Read and display
    Emp readbuf[3];
    f = fopen("employees.dat","rb");
    fread(readbuf, sizeof(Emp), 3, f);
    fclose(f);
    printf("Read from file:\n");
    for (int i = 0; i < 3; ++i)
        printf("%d %s %.2f\n", readbuf[i].id, readbuf[i].name, readbuf[i].salary);

    // Copy to another file
    FILE *src = fopen("employees.dat","rb");
    FILE *dst = fopen("employees_copy.dat","wb");
    char buf[512];
    size_t r;
    while ((r = fread(buf,1,sizeof(buf),src)) > 0) fwrite(buf,1,r,dst);
    fclose(src); fclose(dst);
    return 0;
}
