#include <stdio.h>
#include <string.h>
#include <stdlib.h>

main (int argc, char *argv[]){
  char *buffer1, * buffer2;
  char str[] = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\x03\x00\x05\x00\x00\x09";
  buffer1= (char*)malloc (32);   
  buffer2= (char*)malloc (16);
  memcpy (buffer1, str, 32+6);    
  free (buffer1);
  free (buffer2);
  return 0;
}
