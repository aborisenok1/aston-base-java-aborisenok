package com.aston.java.lesson_02.HomeTask_03;

public abstract class ProgrammingLanguages {


    public abstract void describeTypeOfProgrammingLanguage();

    public abstract void tellAllAboutProgrammingLanguage();


    public enum ProgrammingLanguagesData {
        Procedural("I am procedural programming language"),
        NonProcedural("I am non-procedural programming language"),
        LowLevel("I am Low level machine-dependent programming language"),
        HiLevel("I am Hi level machine-independent programming language"),
        OOP("I am object-oriented programming language"),
        Declarative("I am declarative programming language"),
        Logical("I am logical programming language"),
        Functional("I am functional programming language"),


        Assembler("I am Assembler"),
        Fortran("I am Fortran"),
        BASIC("I am BASIC"),
        Pascal("I am Pascal"),
        C("I am C(machine-oriented)"),
        Cplusplus("I am C++"),
        VisualBasic("I am Visual Basic"),
        Delphi("I am Delphi"),
        Java("I am Java"),
        Prolog("I am Prolog"),
        LISP("I am LISP");

        private final String fldVal;

        ProgrammingLanguagesData(String value) {
            this.fldVal = value;
        }

        public String toString() {
            return String.valueOf(fldVal);
        }
    }



}
