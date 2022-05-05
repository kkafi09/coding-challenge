#include <iostream>
using namespace std;

void swap (int[] a, int x, int y){
    int temp = a [x];
    a[x] = a[y];
    a[y] = temp;
}

int locOfSmall(int[] a, int s, int e){
    int i = s;
    int j = i;
    while (i <= e){
        if(a[i]<a[j]){
            j = i;
        }
        i = i + 1;
    }
    return j;
}

void selSort(int[] a, int n){
    int i = 0;
    while (i < n-1){
        int j = locOfSmall(a, i, n-1);
        swap(a, i, j);
        i++;
    }
}

void display(int[] a, int n){
    int i = 0;
    while (i < n){
        cout<<a[i]", ";
        i++;
    }
    cout<<endl;
}

int main(){
    int[] array ={12,23,65,4,2,4,6,43,76,2,3,6};
    int size = sizeof(array)/sizeof(int);

    display(array, size);
    selSort(array, size);
    display(array, size);
    return 0;
}