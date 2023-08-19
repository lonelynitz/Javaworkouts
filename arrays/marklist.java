package arrays;

public class marklist {
    public static void main(String[] args) {
        
        String department[] = {"Computer Science","Bio-Tech","Chemstry"};

        int dep , st, sc, total =0;

        double parcentage = 0.0;

      // 3 dimensional array:
        int[ ][ ][ ] scores = {

        {{75, 87, 69}, {90, 87, 85},{56, 67, 76}}, 
        {{78, 67, 75}, {87, 98, 76}, {67, 56, 66}}, 
        {{72, 63, 72}, {82, 91, 71}, {64, 56, 66}}

       };


       for(dep=0;dep<3;dep++){

        for(int i=0;i<3;i++){

            System.out.println("Department : " + department[i]);

            for(st=0;st<3;st++){
                System.out.println("Students : " + (st+1) + " Scores : ");

                for(sc=0;sc<3;sc++){

                    System.out.println(scores[dep][st][sc] + " ");
                    total += scores[dep][st][sc];

                    parcentage = (double) total;
                }
                System.out.println("\nTotal scores: " +total); // Displaying total marks of student.
                System.out.println("Percentage: " +parcentage); // Displaying percentage. 
                total = 0; // reset total to zero
            }
            System.out.println();
        }
        break;

       }

    }
}
