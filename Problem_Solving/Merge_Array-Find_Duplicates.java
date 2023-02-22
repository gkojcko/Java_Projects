public class test {

    public static void main(String[] args) {
        int numberarray[] = {2, 3, 6, 7, 1};
        int numberarray2[] = {2, 4, 1, 9, 5};
        int mergedarray[] = new int[numberarray.length + numberarray2.length];
        int z = 0;


        for(int i = 0;i< numberarray.length;i++){
            mergedarray[z] = numberarray[i];
            z++;
            //Merging numberarray to mergedarray
        }
        for(int e=0;e<numberarray2.length;e++) {
            mergedarray[z] = numberarray2[e];
            z++;
            //Merging numberarray to mergedarray2
        }

            for(int a = 0;a< mergedarray.length;a++){
                for(int p = a+1;p< mergedarray.length;p++){         //a+1 so two indexes cannot meet, p would always be +1 from a
                    if(mergedarray[a] == mergedarray[p]){
                        System.out.println("Duplicate elements are " + mergedarray[a]);
                        //printing out the duplicates
                    }
                }
            }
        }

    }
