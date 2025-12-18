//9 — C: Singly linked list of Node with data (int); create list, insert at end, display
// file: singly_list.c
#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node *next;
} Node;

Node* insert_end(Node *head, int val) {
    Node *n = malloc(sizeof(Node));
    n->data = val; n->next = NULL;
    if (!head) return n;
    Node *p = head; while (p->next) p = p->next;
    p->next = n;
    return head;
}

void display(Node *head) {
    while (head) { printf("%d -> ", head->data); head = head->next; }
    printf("NULL\n");
}

int main() {
    Node *head = NULL;
    head = insert_end(head, 10);
    head = insert_end(head, 20);
    head = insert_end(head, 30);
    display(head);
    // free
    Node *t;
    while (head) { t = head; head = head->next; free(t); }
    return 0;
}
