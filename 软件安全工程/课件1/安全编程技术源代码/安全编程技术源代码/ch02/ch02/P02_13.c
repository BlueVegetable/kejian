#include <stdio.h>
int Array[10];
void InsertInt(int index, int value){
     Array[index] = value;
     printf("��ֵ%d����Array[%d]\n",index,value);
}     
int main(int argc, char *argv[]){ 
    int index = atoi(argv[1]);
    int value = atoi(argv[2]);
    InsertInt(index,value);
    return 0;
}
