#include <stdio.h>
#include <string.h>

void fun1(char *input) { 
    char buffer[10];
    strcpy(buffer,input);
    printf("Call fun1,buffer=%s\n",buffer);
}

void fun2() { 
    printf("Call fun2");
}

int main(int argc, char *argv[])
{
  printf("Address Of fun2=%p\n",fun2);                             
  fun1("abcdefghijklmnopqrstuvwxyz12\xBD\x12\x40");
  return 0;
}
