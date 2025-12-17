//7 — C: Product struct; sort by price (ascending) using selection sort
// file: sort_products.c
#include <stdio.h>

typedef struct {
    int id;
    char name[50];
    double price;
} Product;

int main() {
    Product p[] = {{1,"p1",10.5},{2,"p2",7.2},{3,"p3",12.0},{4,"p4",3.3}};
    int n = sizeof(p)/sizeof(p[0]);
    for (int i = 0; i < n-1; ++i) {
        int min_idx = i;
        for (int j = i+1; j < n; ++j)
            if (p[j].price < p[min_idx].price) min_idx = j;
        Product tmp = p[i]; p[i] = p[min_idx]; p[min_idx] = tmp;
    }
    printf("Sorted by price:\n");
    for (int i = 0; i < n; ++i) printf("%d %s %.2f\n", p[i].id, p[i].name, p[i].price);
    return 0;
}
