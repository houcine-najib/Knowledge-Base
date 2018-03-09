
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

int main(int argc, char** argv)
{
    unsigned long mem;
    mem = 1024*1024;
    if(argc==1)
      {
        printf("Using Default : Allocating 256 MB\n");
        int i;
     for( i = 1; i <=256; i++ ){
         printf("Allocating : %d MB\n", i);
         char* ptr = malloc(mem);
         memset(ptr, 0, mem);
         sleep(1);
        }
      }
    else if(argc==2)
       {
        printf("Allocating %s MBytes in Total\n",argv[1]);
        int i;
     for( i = 1; i <=(unsigned) atol(argv[1]); i++ ){
         printf("Allocating : %d MB\n", i);
         char* ptr = malloc(mem);
         memset(ptr, 0, mem);
         sleep(1);
        }
       }
    else
    {
        printf("Usage: loadmem <memory in bytes>");
        exit(1);
    }

     while(1)
    {
        sleep(120);
    }
}
