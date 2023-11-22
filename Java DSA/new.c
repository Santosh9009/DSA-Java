#include <stdio.h>

int Stack[20];
int Top = -1;

void push(int n)
{
    Top++;
    Stack[Top] = n;
}

void pop()
{
    if (Top >= 0)
    {
        Stack[Top] = 0;
        Top--;
    }
    else
    {
        printf("Nothing to Pop");
    }
}

void display()
{
    printf("Binary is ");
    for (int i = Top; i >= 0; i--)
    {
        printf("%d", Stack[i]);
    }
}

int main()
{
    int n;
    scanf("%d", &n);

    int k = n;
    while (k > 0)
    {
        push(k % 2);
        k = k / 2;
    }

    display();
}