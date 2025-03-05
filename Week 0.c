//Week 0, Anag Devnani, 1BM23CS031
//how to find the sum of every column(individually) in a matrix
//how to transpose a matrix.

#include <stdio.h>
int i, j;
int[][] create_matrix(){
    printf("Enter no. of rows: ");
    scanf("%d", &i);
    printf("Enter no. of columns: ");
    scanf("%d", &j);
    int[i][j] matrix;
    printf("Enter the matrix values:\n");
    for(int x=0; x<i;x++){
        printf("%d row:\n", i+1);
        for (int y=0; y<j; j++){
            scanf("%d", &matrix[x][y]);
        }
    }
    return matrix;
}

// 1. Write a program in C to find the second smallest element in an array.
// I converted the "array" to be a matrix to make the problem more difficult
int second_smallest(int[i][j] matrix){
    //assuming that the matrix is valid and that there are atleast two elements in the matrix.
    int sec_small, small = matrix[0][0];
    for(int x=0; x<i; x++){
        for (int y=0; y<j; y++){
            if(matrix[x][y]<small){
                sec_small=small;
                small=matrix[x][y];
            }
            else if(matrix[x][y]>small && small<sec_small){
                sec_small = matrix[x][y];
            }
        }
    }
    return sec_small;
}

// 2. Write a program in C to find the sum of the left diagonals of a matrix.
int ldiag_sum(int[i][j] matrix){
    int sum = 0;
    for(int x=0; x<i; x++){
        for(int y=0; y<j; y++){
            if(x==y){
                sum+=matrix[x][y];
            }
        }
    }
    return sum;
}

// 3. Write a program in C to find the sum of rows and columns of a matrix.

// 4. Write a program in C to count the total number of duplicate elements in an array.
int duplicate_count(int[i][j] matrix){
    for(int x=0; x<i;x++){
        for(int y=0; y<j;y++){
        
        }
    }
}

int find(int[x] array, int objToFind){
    // returns 1 if found, 0 if not found
    int result = 0;
    for (int i=0; i<x; i++){
        if (array[i]==objToFind){
            result=1;
            break;
        }
    }
    return result;
}

// 5. Write a program in C to find the second largest element in an array.

// 6. Write a program in C to delete an element at a desired position from an array.