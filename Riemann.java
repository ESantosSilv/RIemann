package prueba;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Riemann {
public static void main (String[]args) throws NumberFormatException, IOException 
{
BufferedWriter bw = new BufferedWriter (new OutputStreamWriter ( System.out ) );

bw.write( "Suma de riemann "+ suma_riemann(0, 10, 1) + "\n");
bw.write( "Suma de riemann "+ suma_riemann(0, 10, 2) + "\n");
bw.flush() ;
//number of numbers in which the sum advances
}

private static double suma_riemann (int initial_point, int final_point, int step_increment ) 
{
double response = 0.0;
double temp;

double x_i, x_i_1, y_i;

x_i_1 = initial_point;
x_i = step_increment + x_i_1 ;

for (int i = (int) x_i; i <= final_point; i += step_increment  ) 
{
y_i = (x_i * x_i_1);
temp = (y_i) * (x_i - x_i_1);
response += temp;

x_i_1 = x_i;
x_i = step_increment + x_i_1;
}

return response;
}

}
