#include <stdio.h> 
int main(void){ 
    int l; 
    short s; 
    char c; 
    l = 0xdeadbeef; 
    s = l; 
    c = l; 
    printf("l=0x%x(%d bytes)\n", l, sizeof(l)); 
    printf("s=0x%x(%d bytes)\n", s, sizeof(s)); 
    printf("c=0x%x(%d bytes)\n", c, sizeof(c)); 
    return 0; 
}
