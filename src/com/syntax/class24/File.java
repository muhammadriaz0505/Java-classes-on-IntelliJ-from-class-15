package com.syntax.class24;

public abstract class File {
    abstract void open();
    void edit(){
    }
    void close(){
    }
}
class JavaFile extends File{

    @Override
    void open() {
        System.out.println("To open java file we need Norepad++");

    }
}
class WordFile extends File{

    @Override
    void open() {
        System.out.println("To open doc file we need Microsoft Word to be installed");

    }
}
class PdfFile extends File{

    @Override
    void open() {
        System.out.println("To open PdfFile we need software to be installed");

    }
}
 class FileTester{
     public static void main(String[] args) {
         File [] files={new JavaFile(),new WordFile(),new PdfFile()};
         for(File file:files){
           file.open();
         }

     }

}
