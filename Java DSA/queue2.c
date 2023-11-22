#include<stdio.h>
#include<stdlib.h>

void enque();
void deque();
void display();
int f=-1,r=-1,q[5];

int main(){
int ch;
printf("\n enter any number 1:enque, 2:deque, 3:display, 4:exit");
scanf("%d",&ch);
what(ch);
}

 void what(int ch){

    switch(ch){
        case 1: enque();
        printf("\n enter any number 1:enque, 2:deque, 3:display, 4:exit");
        scanf("%d",&ch);
        what(ch);
        case 2: deque();
        printf("\n enter any number 1:enque, 2:deque, 3:display, 4:exit");
        scanf("%d",&ch);
        what(ch);
        case 3: display();
        printf("\n enter any number 1:enque, 2:deque, 3:display, 4:exit");
        scanf("%d",&ch);
        what(ch);
        case 4: exit(0);
        printf("the end");
        default: printf("wrong no");
    }
    
     return;
}

void enque(){
    if(f==-1 && r==-1){
        r++;
        printf("enter a value");
        scanf("%d",&q[r]);
        f=0;      
    }else if(r<5){
        r++;
        printf("enter a value");
        scanf("%d",&q[r]);
    }else{
        printf("overflow");
    }
}

void deque(){
    if(f==-1 || r==-1){
        printf("underflow");
    }else if(f<=r){
        q[f]=0;
        f++;
    }else{
        printf("no more element left");
        f=-1,r=-1;
    }
}

void display(){
    int i;
    if(f==-1 || r==-1){
        printf("no element");
    }else{
    for( i=f;i<=r;i++){
        printf("%d",q[i]);
    }
    }
}

