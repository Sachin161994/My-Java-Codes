package exeriments;

public class ArrayofArray {
public static void main(String[] args) {

	float[][] mat= new float[4][4];
    mat[3][1]=4f;
	for(int y=0;y<mat.length; y++) {
		for(int x=0; x<mat[y].length; x++) {
			System.out.println(mat[y][x] + " ");
		System.out.println();
	}
	
}
}}
