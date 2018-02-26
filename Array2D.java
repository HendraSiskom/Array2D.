import java.util.Scanner;
public class Array2D {
  public static void main(String args[]) {
  Scanner input= new Scanner(System.in);
int baris, kolom, masukkan;
int [] [] X = new int [3] [2] ;
System.out.println();
System.out.println("Masukkan  Matriks1");
System.out.println("--------------------------------");
for (baris = 0; baris < 3; baris++)
{
   for (kolom=0; kolom <2;  kolom++)
  {
   System.out.print ("Masukkan X["+baris+"]["+kolom+"] adalah :");
   masukkan =  input.nextInt();

  X[baris][kolom] = masukkan;
}
 System.out.println("");
}
 System.out.println("Hasil");

for (baris = 0; baris <X.length; baris++)
{
     for (kolom=0; kolom <X[0].length; kolom++) 
 {
     System.out.print(X[baris][kolom]+" ");
}
System.out.println(" ");
}
}
}   