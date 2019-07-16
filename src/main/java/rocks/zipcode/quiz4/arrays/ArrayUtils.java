package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        return values[((values.length)/2)] ;
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] elements= new String[values.length-1];

        System.arraycopy(values, 0, elements, 0, (values.length-1)/2);
        System.arraycopy(values,(((values.length-1)-(values.length-1)/2)) +1, elements, ((values.length-1)/2), (values.length-1)/2);

         return elements;
    }

    public static String getLastElement(String[] values) {

        return values[(values.length)-1];
    }

    public static String[] removeLastElement(String[] values) {
            String [] elements= new String[values.length -1];
            for (int i=0; i <values.length-1; i++){
                elements[i]= values[i];
            }

        return elements;
    }
}