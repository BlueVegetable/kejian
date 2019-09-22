#include <stdio.h> 
int main(int argc, char *argv[]) { 
     int k=0; 
     char buffer[28]="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
     printf("%.20s%n\n",buffer,&k); 
     printf("k=%d",k);
     return 0; 
} 


