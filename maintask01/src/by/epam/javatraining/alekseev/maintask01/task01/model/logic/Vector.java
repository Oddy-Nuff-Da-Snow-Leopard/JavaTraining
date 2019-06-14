package by.epam.javatraining.alekseev.maintask01.task01.model.logic;

import by.epam.javatraining.alekseev.maintask01.model.exception.BadArgumentException;
import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 * This class contains various methods for manipulating arrays (such as sorting
 * and searching).
 *
 * Some public methods in this class throws a {@code BadArgumentExeption}, if
 * the specified array reference is null or empty, except where noted.
 *
 * The documentation for the methods contained in this class.
 *
 * @author Maksim Alekseev (Styrofoam inc.)
 * @see Double
 * @since 1.0
 */
public class Vector {

    /**
     * Used for logging
     */
    private static final Logger LOGGER = Logger.getLogger(Vector.class);

    /**
     * Used to denote zero array index
     */
    private static final int EMPTY_ARRAY_LENGTH = 0;
    
    /**
     * Can be returned if the method didn't find something, or the method
     * received bad parameters
     */
    private static final int DEFAULT_INDEX_VALUE = -1;

    private static final String IS_NULL_OR_EMPTY_MSG
            = "Method received bad parameter! Array is null or empty!";

    private static final String IS_NULL_MSG
            = "Method received bad parameter! Array is null!";

    private static final String IS_EMPTY_MSG
            = "Method received bad parameter! Array is empty!";

    private static boolean isNullOrEmpty(double[] array) {
        return array == null || array.length == EMPTY_ARRAY_LENGTH;
    }

    private static boolean isNull(double[] array) {
        return array == null;
    }

    private static boolean isEmpty(double[] array) {
        return array.length == EMPTY_ARRAY_LENGTH;
    }

    /**
     * Finds the maximum element of the array and returns it.
     *
     * @param array {@code double[]} the array to be searched
     * @return maximum element of the array
     * @throws BadArgumentException if the array is null or empty
     */
    public static double getMaxElement(double[] array) throws BadArgumentException {
        if (isNullOrEmpty(array)) {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
            throw new BadArgumentException(IS_NULL_OR_EMPTY_MSG);
        }

        double maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    /**
     * Finds the minimum element of the array and returns it.
     *
     * @param array {@code double[]} the array to be searched
     * @return minimum element of the array
     * @throws BadArgumentException if the array is null or empty
     */
    public static double getMinElement(double[] array) throws BadArgumentException {
        if (isNullOrEmpty(array)) {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
            throw new BadArgumentException(IS_NULL_OR_EMPTY_MSG);
        }

        double minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    /**
     * Finds the arithmetic average element of the array and returns it.
     *
     * @param array {@code double[]} the array to be searched
     * @return arithmetic average element of the array
     * @throws BadArgumentException if the array is null
     */
    public static double getArithmeticAverage(double[] array) throws BadArgumentException {
        if (isNull(array)) {
            LOGGER.warn(IS_NULL_MSG);
            throw new BadArgumentException(IS_NULL_MSG);
        }

        if (isEmpty(array)) {
            return 0;
        }

        double sumOfElements = 0;
        for (double element : array) {
            sumOfElements += element;
        }
        return sumOfElements / array.length;
    }

    /**
     * Finds the geometric average element of the array and returns it.
     *
     * @param array {@code double[]} the array to be searched
     * @return geometric average element of the array
     * @throws BadArgumentException if the array is null
     */
    public static double getGeometricAverage(double[] array) throws BadArgumentException {
        if (isNull(array)) {
            LOGGER.warn(IS_NULL_MSG);
            throw new BadArgumentException(IS_NULL_MSG);
        }

        if (isEmpty(array)) {
            return 0;
        }

        double compositionOfElements = 1;
        for (double element : array) {
            compositionOfElements *= element;
        }

        return Math.pow(compositionOfElements, 1. / array.length);
    }

    /**
     * Checks if the array is sorted ascending.
     *
     * @param array {@code double[]} the array to be checked
     * @return boolean flag that indicates whether the array is sorted ascending
     */
    private static boolean isSortedAsc(double[] array) {
        boolean isSortedAsc = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSortedAsc = false;
                break;
            }
        }
        return isSortedAsc;
    }

    /**
     * Checks if the array is sorted descending.
     *
     * @param array {@code double[]} the array to be checked
     * @return boolean flag that indicates whether the array is sorted
     * descending
     */
    private static boolean isSortedDesc(double[] array) {
        boolean isSortedDesc = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                isSortedDesc = false;
                break;
            }
        }
        return isSortedDesc;
    }

    /**
     * Checks if the array is sorted in any order.
     *
     * @param array {@code double[]} the array to be checked
     * @return boolean flag that indicates whether the array is sorted
     * @throws BadArgumentException if the array is null or empty
     */
    public static boolean isSorted(double[] array) throws BadArgumentException {
        if (isNullOrEmpty(array)) {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
            throw new BadArgumentException(IS_NULL_OR_EMPTY_MSG);
        }

        boolean isSorted = false;
        if (isSortedAsc(array)) {
            isSorted = true;
        } else if (isSortedDesc(array)) {
            isSorted = true;
        }

        return isSorted;
    }

    /**
     * Finds the position of the first local minimum of the array and returns
     * it. A local minimum is an element that is smaller than any of its
     * neighbors.
     *
     * @param array {@code double[]} the array to be searched
     * @return index of the first local minimum, if array isn't null or empty,
     * otherwise returns -1;
     */
    public static int getPositionOfFirstLocalMin(double[] array) {
        int index = DEFAULT_INDEX_VALUE;
        if (!isNullOrEmpty(array)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < (i > 0 ? array[i - 1] : Double.MAX_VALUE)
                        && array[i] < (i < array.length - 1 ? array[i + 1]
                                : Double.MAX_VALUE)) {
                    index = i;
                    break;
                }
            }
        } else {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
        }
        return index;
    }

    /**
     * Finds the position of the first local maximum of the array and returns
     * it. A local maximum is an element that is larger than any of its
     * neighbors);
     *
     * @param array {@code double[]} the array to be searched
     * @return index of the first local maximum, if array isn't null or empty,
     * otherwise returns -1;
     */
    public static int getPositionOfFirstLocalMax(double[] array) {
        int index = DEFAULT_INDEX_VALUE;
        if (!isNullOrEmpty(array)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > (i > 0 ? array[i - 1] : Double.MIN_VALUE)
                        && array[i] > (i < array.length - 1 ? array[i + 1]
                                : Double.MIN_VALUE)) {
                    index = i;
                    break;
                }
            }

        } else {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
        }
        return index;
    }

    /**
     * Finds the element using the linear search algorithm and returns index of
     * it.
     *
     * @param array {@code double[]} the array to be searched
     * @param key {@code double} the value for search
     * @return index of the found element, if such element exist in array,
     * otherwise returns -1; also can return -1 if array is null or empty
     */
    public static int linearSearch(double[] array, double key) {
        int index = DEFAULT_INDEX_VALUE;

        if (!isNullOrEmpty(array)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == key) {
                    index = i;
                    break;
                }
            }
        } else {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
        }

        return index;
    }

    /**
     * Finds the element using the binary search algorithm and returns index of
     * it. The array must be sorted prior to making this call. If it is not
     * sorted, it will be sorted.
     *
     * @param array {@code double[]} the array to be searched
     * @param key {@code double} the value for search
     * @return index of the found element, if such element exist in array,
     * otherwise returns -1; also can return -1 if array is null or empty
     */
    public static int doBinarySearch(double[] array, double key) {
        int index = DEFAULT_INDEX_VALUE;

        if (!isNullOrEmpty(array)) {

            if (!isSortedAsc(array)) {
                Arrays.sort(array);
                LOGGER.info("Array sorted!");
            }

            int leftIndex = 0;
            int rightIndex = array.length - 1;
            while (leftIndex <= rightIndex) {
                int midIndex = (leftIndex + rightIndex) / 2;
                if (array[midIndex] == key) {
                    index = midIndex;
                    break;
                } else if (array[midIndex] < key) {
                    leftIndex = midIndex + 1;
                } else if (array[midIndex] > key) {
                    rightIndex = midIndex - 1;
                }
            }
        } else {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
        }

        return index;
    }

    /**
     * Swaps elements of the array.
     *
     * @param array {@code double[]} the array
     * @param i {@code double} index for replace
     * @param j {@code double} index for replace
     */
    private static void swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Reverses array elements.
     *
     * @param array {@code double[]} the array to be reversed
     */
    public static void flip(double[] array) {
        if (!isNullOrEmpty(array)) {
            for (int i = 0; i < array.length / 2; i++) {
                swap(array, i, array.length - i - 1);
            }
        } else {
            LOGGER.info(IS_NULL_OR_EMPTY_MSG);
        }
    }

    /**
     * Sorts an array in ascending order using a bubble sort algorithm.
     *
     * @param array {@code double[]} the array to be sorted
     */
    public static void bubbleSortAsc(double[] array) {
        if (!isNullOrEmpty(array)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        swap(array, j, j + 1);
                    }
                }
            }
        } else {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
        }
    }

    /**
     * Sorts an array in ascending order using a modified bubble sort algorithm.
     *
     * @param array {@code double[]} the array to be sorted
     */
    public static void modified1BubbleSortAsc(double[] array) {
        if (!isNullOrEmpty(array)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        swap(array, j, j + 1);
                    }
                }
            }
        } else {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
        }
    }

    /**
     * Sorts an array in ascending order using a modified bubble sort algorithm.
     *
     * @param array {@code double[]} the array to be sorted
     */
    public static void modified2BubbleSortAsc(double[] array) {
        if (!isNullOrEmpty(array)) {
            for (int i = 0; i < array.length; i++) {
                boolean flag = false;
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        swap(array, j, j + 1);
                        flag = true;
                    }
                }
                if (!flag) {
                    return;
                }
            }
        } else {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
        }
    }

    /**
     * Sorts an array in ascending order using an insertion sort algorithm.
     *
     * @param array {@code double[]} the array to be sorted
     */
    public static void insertionSortAsc(double[] array) {
        if (!isNullOrEmpty(array)) {
            for (int i = 1; i < array.length; i++) {
                double temp = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > temp) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = temp;
            }

        } else {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
        }
    }

    /**
     * Sorts an array in ascending order using a selection sort algorithm.
     *
     * @param array {@code double[]} the array to be sorted
     */
    public static void selectionSortAsc(double[] array) {
        if (!isNullOrEmpty(array)) {
            for (int i = 0; i < array.length; i++) {
                int minIndex = i;
                double min = array[i];
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        minIndex = j;
                        min = array[j];
                    }
                }
                swap(array, i, minIndex);
            }
        } else {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
        }
    }

    /**
     * Sorts an array in ascending order using a merge sort algorithm.
     *
     * @param array {@code double[]} the array to be sorted
     */
    public static void mergeSortAsc(double[] array) {
        if (!isNullOrEmpty(array)) {
            if (array.length > 1) {
                double[] left = leftHalf(array);
                double[] right = rightHalf(array);

                mergeSortAsc(left);
                mergeSortAsc(right);

                merge(array, left, right);
            }
        } else {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
        }
    }

    private static double[] leftHalf(double[] array) {
        int size1 = array.length / 2;
        double[] left = new double[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    private static double[] rightHalf(double[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        double[] right = new double[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }

    private static void merge(double[] result, double[] left, double[] right) {
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length
                    || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }

    private static int partition(double array[], int f, int l) {
        double pivot = array[f];
        while (f < l) {
            while (array[f] < pivot) {
                f++;
            }
            while (array[l] > pivot) {
                l--;
            }
            swap(array, f, l);
        }
        return f;
    }

    /**
     * Sorts an array in ascending order using a quick sort algorithm.
     *
     * @param array {@code double[]} the array to be sorted
     * @param f {@code int} first sorting position(index)
     * @param l {@code int} first sorting position(index)
     */
    public static void quickSort(double array[], int f, int l) {
        if (!isNullOrEmpty(array)) {
            if (f >= l) {
                return;
            }
            int pivotIndex = partition(array, f, l);
            quickSort(array, f, pivotIndex);
            quickSort(array, pivotIndex + 1, l);
        } else {
            LOGGER.warn(IS_NULL_OR_EMPTY_MSG);
        }
    }
}
