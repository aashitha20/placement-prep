//2 — C: Book struct and pointer-to-struct to input/display
// file: book_pointer.c
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct {
    char title[100];
    char author[50];
    double price;
} Book;

int main() {
    Book b;
    Book *p = &b;
    printf("Enter title author price: ");
    scanf("%99s %49s %lf", p->title, p->author, &p->price);
    printf("Book details:\nTitle: %s\nAuthor: %s\nPrice: %.2f\n",
           p->title, p->author, p->price);
    return 0;
}
