# include <stdio.h>


void print(int array[], int size){
    for (int i=0; i<size; i++){
        printf("%d ", array[i]);
    }
}

void mergesort(int array_to_be_sorted[], int size){
    if(size>1){
        int x = size/2;
        int b[x], c[x];
        for (int i=0; i<size; i++){
            b[i]=array_to_be_sorted[i];
            c[i]=array_to_be_sorted[i];
        }
        print(b, x);
        print(c, x);
    }
}
int main(){
    int n;
    printf("How many numbers?: ");
    scanf("%d", &n);
    int numbers[n];

    for(int i=0; i<n; i++){
        printf("Enter Number: ");
        scanf("%d", &numbers[i]);
    }

    mergesort(numbers, n);
    return 1;
}