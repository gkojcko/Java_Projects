import java.util.Scanner;

public class testing {
    public static void main(String args[]) {
        System.out.println("Give me a number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        int tmtbl = 1;
        int answer;

        while(tmtbl<=10){
            answer = n * tmtbl;
            System.out.println(n + "*" + tmtbl + "=" +answer);
            tmtbl++;

        }

    }
    }
