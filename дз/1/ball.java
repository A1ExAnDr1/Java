пакет  ru.mirea.pr1 ;

public  class  Ball {
    частный  цвет строки ;
    частный  размер строки ;

    public  Ball ( String  n , String  a ) {
        цвет = n;
        size = a;
    }
    public  Ball ( String  n ) {
        цвет = n;
        size =  " маленький " ;
    }
    public  Ball () {
        color =  " желтый " ;
        size =  " маленький " ;
    }

    public  void  setColor ( Цвет строки  ) {
        это . color = цвет;
    }
    public  void  setSize ( String  Name ) {
        это . размер = размер;
    }
    public  String  getColor () {
        вернуть цвет;
    }
    public  String  getSize () {
        размер возврата ;
    }
    public  String  toString () {
        верни  это . размер + " и   " + это . цвет + « мяч. » ;
    }
}
