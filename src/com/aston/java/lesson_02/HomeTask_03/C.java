package com.aston.java.lesson_02.HomeTask_03;

import static com.aston.java.lesson_02.HomeTask_03.ProgrammingLanguages.ProgrammingLanguagesData.*;

public class C extends HiLevelProgrammingLanguage{

    @Override
    public void tellAllAboutProgrammingLanguage() {
        System.out.println();
        super.describeTypeOfProgrammingLanguage();
        System.out.println(C);
    }
}
