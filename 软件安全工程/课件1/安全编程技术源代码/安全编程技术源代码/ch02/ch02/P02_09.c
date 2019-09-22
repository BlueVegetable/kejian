#include <stdio.h> 
#include <string.h> 
int main(int argc, char *argv[]){ 
    unsigned short s; 
    int i; 
    char buf[100]; 
    i = atoi(argv[1]); 
    s = i; 
    if(s >= 100){
         printf("拷贝字节数太大，请退出!\n"); 
         return -1; 
    } 
    printf("拷贝%d个字节\n", i); 
    memcpy(buf, argv[2], i); 
    buf[i] = '\0'; 
    
    return 0; 
}
