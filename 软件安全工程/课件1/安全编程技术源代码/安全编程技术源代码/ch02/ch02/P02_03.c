#include <stdio.h>
#include <string.h>

void fun1(char *input) { 
    char buffer[10];
    strcpy(buffer,input);
    printf("Call fun1,buffer=%s\n",buffer);
}

int main(int argc, char *argv[])
{
  fun1(argv[1]);
  return 0;
}
