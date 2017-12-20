public class PassByValue {
    public static void main(String[] commandLine) {

        // init values that are to be transmogrified
        int     intArg     = 17;
        double  doubleArg  = 0.5;
        String  stringArg  = "A Change Is Gonna Come";
        int[]   arrayArg   = { intArg, intArg, };
        OurType ourTypeArg = new OurType();

        // before invoking transmogrify
        System.out.println( );
        System.out.println( "in main, before transmogrification");
        System.out.println( "    intArg= "           + intArg          );
        System.out.println( "    doubleArg= "        + doubleArg       );
        System.out.println( "    stringArg= "        + stringArg       );
        System.out.println( "    arrayArg= "         + arrayArg        );
        System.out.println( "    arrayArg[0]= "      + arrayArg[0]     );
        System.out.println( "    ourTypeArg= "       + ourTypeArg      );
        System.out.println( "    ourTypeArg.value= " + ourTypeArg.value);
                          
        transmogrify( intArg    
                    , doubleArg 
                    , stringArg 
                    , arrayArg  
                    , ourTypeArg
                    );

        // what hath transmogrify wrought?       
        System.out.println( );
        System.out.println( "in main, after transmogrification");
        System.out.println( "    intArg= "           + intArg          );
        System.out.println( "    doubleArg= "        + doubleArg       );
        System.out.println( "    stringArg= "        + stringArg       );
        System.out.println( "    arrayArg= "         + arrayArg        );
        System.out.println( "    arrayArg[0]= "      + arrayArg[0]     );
        System.out.println( "    ourTypeArg= "       + ourTypeArg      );
        System.out.println( "    ourTypeArg.value= " + ourTypeArg.value);
    }
    
    private static void transmogrify( int       intParam
                                    , double    doubleParam
                                    , String    stringParam
                                    , int[]     arrayParam
                                    , OurType   ourTypeParam
                                    )
    {   // see copied values
        System.out.println( );
        System.out.println( "    in transmogrify, but before transmogrification");
        System.out.println( "        intParam= "           + intParam          );
        System.out.println( "        doubleParam= "        + doubleParam       );
        System.out.println( "        stringParam= "        + stringParam       );
        System.out.println( "        arrayParam= "         + arrayParam        );
        System.out.println( "        arrayParam[0]= "      + arrayParam[0]     );
        System.out.println( "        ourTypeParam= "       + ourTypeParam      );
        System.out.println( "        ourTypeParam.value= " + ourTypeParam.value);

        // change the values of params
        intParam++;                 
        doubleParam++;
        stringParam  += " -- Sam Cooke";
        arrayParam[0]++;
        ourTypeParam.value++;

        // verify change in the parameters
        System.out.println( );
        System.out.println( "    in transmogrify, AFTER transmogrification");
        System.out.println( "        intParam= "           + intParam          );
        System.out.println( "        doubleParam= "        + doubleParam       );
        System.out.println( "        stringParam= "        + stringParam       );
        System.out.println( "        arrayParam= "         + arrayParam        );
        System.out.println( "        arrayParam[0]= "      + arrayParam[0]     );
        System.out.println( "        ourTypeParam= "       + ourTypeParam      );
        System.out.println( "        ourTypeParam.value= " + ourTypeParam.value);
    }
}

