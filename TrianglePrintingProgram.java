class TrianglePrintingProgram {
    public static void main(String[] args){

int nums = 9;

for (int starts = 1; starts <= 9; starts++){
System.out.print("  ");
    for (int ends = 1; ends <= starts; ends++){

System.out.print("*");
   }
System.out.println();
}
System.out.println();


for (int starts = 1; starts <= 9; starts++){
System.out.print("  ");
 for (int ends = 9; ends >= starts; ends--){
System.out.print("*");
    }
System.out.println();
}

System.out.println();


for (int row = 1; row < nums; row++){
   for (int column = row; column < nums; column++){
System.out.print(" ");
  }
for (int looping = 1; looping < row; looping++){
System.out.print("*");
   }
System.out.println();
}

System.out.println();


for (int starts = 1; starts < nums; starts++){
  for (int ends = 1; ends < starts; ends++){
System.out.print(" ");
}
for (int triangle = starts; triangle < nums; triangle++){
System.out.print("*");
  }
System.out.println();
}


  }
}