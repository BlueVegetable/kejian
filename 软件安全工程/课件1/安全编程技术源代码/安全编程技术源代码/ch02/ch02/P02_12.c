#include <stdio.h> 
#include <stdlib.h> 
int catstring(char *buf1, char *buf2, int len1, int len2){ 
    char mybuf[256]; 
    if((len1 + len2) > 256){
             printf("����mybuf���ɷ�Χ!\n");
             return -1; 
    } 
    printf("����%d+%d=%d���ֽڵ�mybuf!\n",len1,len2,len1+len2);
    memcpy(mybuf, buf1, len1);
    memcpy(mybuf + len1, buf2, len2);     
    return 0; 
}

int main(int argc, char *argv[]){        
    catstring(argv[1],argv[2],atoi(argv[3]),atoi(argv[4]));
    return 0; 
}


