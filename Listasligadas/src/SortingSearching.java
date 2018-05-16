class SortingSearching {

    // ----------------------------------------------
    // auxiliary methods
    // ----------------------------------------------
    static <T extends Comparable<? super T>> 
	void swap ( T[] values, int i, int j ) {
	T tmp     = values[i];
	values[i] = values[j];
	values[j] = tmp;
    }

    static <T extends Comparable<? super T>> 
	boolean isLess ( T val1, T val2 ) {
	return ( val1.compareTo(val2) < 0 );
    }

    static <T extends Comparable<? super T>> 
	boolean isGreater ( T val1, T val2 ) {
	return ( val1.compareTo(val2) > 0 );
    }

    static <T extends Comparable<? super T>> 
	boolean isEqual ( T val1, T val2 ) {
	return ( val1.compareTo(val2) == 0 );
    }


    // ----------------------------------------------
    // searching
    // ----------------------------------------------
    public static <T extends Comparable<? super T>> 
	int sequentialSearch(T[] values, T val) {
	for (int i = 0 ; i < values.length ; i++) 
	    if ( isEqual(val,values[i]) ) 
		return i;
	return -1;
    }

    public static <T extends Comparable<? super T>> 
	int binarySearchRec(T[] values, T val ) {
	return binarySearchRec(values, val, 0, values.length - 1);
    }

    static <T extends Comparable<? super T>> 
	int binarySearchRec(T[] values, T val, int low, int high) {
	if( high < low )
	    return -1;
	else {
	    int half = low + ( high - low ) / 2;
	    if ( isEqual( val, values[half] ) )
		return half;
	    else if ( isLess( val, values[half] ) )
		return binarySearchRec(values, val, low, half - 1);
	    else
		return binarySearchRec(values, val, half + 1, high);      
	}
    }


    public static <T extends Comparable<? super T>> 
			     int binarySearch(T[] values, T val ) {
	return binarySearch(values, val, 0, values.length - 1);
    }

    static <T extends Comparable<? super T>> 
		      int binarySearch(T[] values, T val, int low, int high) {
	while ( low <= high ) {
	    int half = low + ( high - low ) / 2;
	    if ( isEqual( val, values[half] ) )
		return half;
	    else if ( isLess( val, values[half] ) )
		high = half - 1;
	    else
		low =  half + 1;
	}
	return -1;      
    }

    // ----------------------------------------------
    // sorting
    // ----------------------------------------------
    public static <T extends Comparable<? super T>>
			     void selectMinimumSort(T[] values) {
	for (int i = 0 ; i < values.length ; i++) {
	    int min = i;
	    for (int j = i + 1 ; j < values.length ; j++) 
		if ( isLess(values[j], values[min]) )
		    min = j;
	    swap(values, i, min);
	}
    }

    public static <T extends Comparable<? super T>> 
			     void insertionSort(T[] values) {
	for ( int i = 1 ; i < values.length ; i++ ) {
	    int j = i;
	    while ( j > 0 && isGreater( values[j - 1], values[j] ) ) { 
		swap( values, j, j - 1 );
		j--;
	    }
	}
    }

    public static <T extends Comparable<? super T>> 
			     void bubbleSort0(T[] values) {
	for ( int i = 0 ; i < values.length - 1 ; i++ ) 
	    for ( int j = 0 ; j < values.length - 1 - i ; j++ )
		if ( isGreater( values[j], values[j+1] ) ) 
		    swap( values, j, j+1 );
    }


    public static <T extends Comparable<? super T>> 
			     void bubbleSort1(T[] values) {
	boolean swapped = true;
	for ( int i = 0 ; i < values.length - 1 && swapped ; i++ ) {
	    swapped = false;
	    for ( int j = 0 ; j < values.length - 1 - i ; j++ )
		if ( isGreater( values[j], values[j+1] ) ) {
		    swap( values, j, j+1 );
		    swapped = true;
		}
	}
    }

    public static <T extends Comparable<? super T>> 
			     void quickSort(T[] values) {
	quickSort(values, 0, values.length - 1);
    }

    static <T extends Comparable<? super T>> 
		      void quickSort(T[] values, int low, int high) {
	if (high > low) {
	    int index = partition(values, low, high);
	    quickSort(values, low, index - 1);
	    quickSort(values, index + 1, high);
	}
    }
 
    
    static <T extends Comparable<? super T>> 
		      int partition(T[] values, int low, int high) {
	// Choose a pivot value and then partition the array so that every value
	// less than the pivot is positioned before the pivot in the array and
	// every value greater than the pivot is positioned after the pivot in
	// the array.
	T pivot = values[low];
	int i   = low;
	int j   = high;
	while ( i < j ) {
	    // Keep incrementing from the start of the range so long as the
	    // values are less or equal than the pivot.
	    while (i < high && !isGreater(values[i], pivot)) 
		i++;
	    // Keep decrementing from the end of the range so long as the values
	    // are greater than the pivot.
	    while ( isGreater( values[j], pivot ) ) 
		j--;
	    // So long at the indexes have not crossed, swap the pivot with the
	    // value that was out of place.
	    if ( i < j ) {
		swap( values, i, j );
	    }
	}
        swap(values, j, low);
	return j;
    }


    public static <T extends Comparable<? super T>> 
			     void mergeSort( T[] v, T[] u ) {
	mergeSort( v, u, 0, v.length - 1 );
    }

    static <T extends Comparable<? super T>> 
		      void mergeSort( T[] v, T[] u, int low, int high ) {
	if ( low < high ) {
	    int half = low + (high - low) / 2;
	    mergeSort( v, u, low, half );
	    mergeSort( v, u, half + 1, high );
	    merge( v, u, low, half, high );
	}
    }

    static <T extends Comparable<? super T>> 
		      void merge(T v[], T u[], int low, int half, int high) {
	int i = low;
	int j = half + 1;
	int k = low;

	// Alternately copy to u the smallest elements by order
	while( i <= half && j <= high )
	    if( isLess( v[i], v[j] ) )
		u[k++] = v[i++];
	    else
		u[k++] = v[j++];

	// if you reached j = high first, copy rest of first half
	while( i <= half )    
	    u[k++] = v[i++];

	// if you reached i = half first, copy rest of second half
	while( j <= high )  
	    u[k++] = v[j++];

	// Copy u back to v
	for( i = 0 ; i < k ; i++ )
	    v[i] = u[i];
    }
}

