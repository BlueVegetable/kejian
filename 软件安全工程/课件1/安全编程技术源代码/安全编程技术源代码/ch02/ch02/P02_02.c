#include <stdio.h>
#include <string.h>

void function(char *input) {
  char buffer[10];
  strcpy(buffer,input); 
  printf("buffer=%s\n",buffer);
}

int main(int argc,char* argv[]) {
   function(argv[1]);
   return 0;
}
