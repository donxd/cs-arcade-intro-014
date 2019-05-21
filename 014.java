int[] alternatingSums(int[] a) {
    int [] totales = new int [ 2 ];
    for ( int i = 0; i < a.length; i++ ){
        totales[ i%2 ] += a[ i ];
    }
    
    return totales;
}
