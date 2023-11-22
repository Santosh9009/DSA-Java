public class hiii 
{  
 
static void printSpiralPattern(int size)  
{
int row = 0, col = 0;  
int boundary = size - 1;  
int sizeLeft = size - 1;  
int flag = 1;  

char move = 'd';  

int[][] matrix =new int [size][size];  
for (int i = 1; i < size * size + 1; i++)  
{  

    matrix[row][col] = i;  

switch (move)  
{  

case 'r':  
    col += 1;  
    break;  

case 'l':  
    col -= 1;  
    break;  

    case 'u':  
    row -= 1;  
    break;  

    case 'd':  
    row += 1;  
    break;  
}  
 
if (i == boundary)  
    {  

        boundary = boundary + sizeLeft;  

        if (flag != 2)  
        {  
        flag = 2;  
        }  
        else  
        {  
        flag = 1;  
        sizeLeft -= 1;  
        }  
       
        switch (move)  
        {  
      
        case 'r':  
            move = 'u';  
            break;  
        
        case 'd':  
            move = 'r';  
            break;  
          
        case 'l':  
            move = 'd';  
            break;  
        
        case 'u':  
            move = 'l';  
            break;  
        }  
    }  
    }  

    for (row = 0; row < size; row++)  
    {  
        
        for (col = 0; col < size; col++)  
            {  
                int n = matrix[row][col];  
                if(n < 10)  
                    System.out.print(n +" ");  
                else  
                    System.out.print(n +" ");  
            }  
        System.out.println();  
    }  
}  
  
public static void main(String args[])  
{  

int size = 5;  
System.out.println(" Pattern is: \n");  
   
printSpiralPattern(size);  
}  
}  
