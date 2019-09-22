#include <stdio.h> 
int main(int argc, char *argv[]){ 
    int n1 = 0x7fffffff;
    int n2 = 0x40000000;
    int n6 = 0x8fffffff;
    printf("%d(0x%x)+1=%d(0x%x)\n", n1, n1, n1+1, n1+1);     
    printf("%d(0x%x)+%d(0x%x)=%d(0x%x)\n", n2, n2, n2, n2, n2+n2, n2+n2);     
    printf("%d(0x%x)*4=%d(0x%x)\n", n2, n2, n2*4, n2*4); 
    printf("%d(0x%x)-%d(0x%x)=%d(0x%x)\n", n2, n2, n6, n6, n2-n6, n2-n6); 
    return 0; 
}
