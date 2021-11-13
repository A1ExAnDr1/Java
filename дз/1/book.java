пакет  ru.mirea.pr1 ;

public  class  Book {
    частное  строковое имя;
    частные  int страницы;

    общедоступная  книга ( String  n , int  a ) {
        name = n;
        pages = a;
    }
    public  Book ( String  n ) {
        name = n;
        страницы =  0 ;
    }
    public  Book () {
        name =  " 42 " ;
        pages =  42 ;
    }

    public  void  setPages ( int  age ) {
        это . страницы = возраст;
    }
    public  void  setName ( String  Name ) {
        это . name = name;
    }
    public  int  getPages () {
        вернуть страницы;
    }
    public  String  getName () {
        возвращаемое имя;
    }
    public  String  toString () {
        верни  это . name + " включает " + это . страницы + " страницы. " ;
    }
    public  void  howLongToRead () {
        Система . из . println ( " Требуется " + (pages / 2 ) / 60 + " часов и " + (pages / 2 ) % 60 + " минут для чтения " + имя);
    }
}
