#include <stdio.h> 
#include <stdlib.h> 
int* arraycpy(int *array, int len){ 
    int *newarray, i; 
    newarray = malloc(len*sizeof(int)); 
    printf("为newarray成功分配%d字节内存\n",len*sizeof(int));
    if(newarray == NULL){ 
        return -1; 
    } 
    printf("循环运行次数：%d(0x%x)\n",len,len);
    for(i = 0; i < len; i++){
        newarray[i] = array[i]; 
    } 
    return newarray; 
}

int main(int argc, char *argv[]){ 
    int array[] = {1,2,3,4,5};    
    arraycpy(array,atoi(argv[1]));
    return 0; 
}
