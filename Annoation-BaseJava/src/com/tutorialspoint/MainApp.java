package com.tutorialspoint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(TextEditorConfig.class);
        //HelloWorld helloWorld=ctx.getBean(HelloWorld.class);
        //helloWorld.setMessage("Hello World!");
        //helloWorld.getMessage();
        //ctx.register(AppConfig.class,OtherConfig.class)
        TextEditor te=ctx.getBean(TextEditor.class);
        te.spellCheck();
    }
}
