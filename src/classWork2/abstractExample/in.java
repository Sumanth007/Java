package classWork2.abstractExample;

interface in {
    int a = 0;
    int b = 1;

    default int getA() {
        return 0;
    }

    int getB();


}
