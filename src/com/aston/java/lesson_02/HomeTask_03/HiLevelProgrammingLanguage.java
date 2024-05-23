package com.aston.java.lesson_02.HomeTask_03;

import static com.aston.java.lesson_02.HomeTask_03.ProgrammingLanguages.ProgrammingLanguagesData.*;

public class HiLevelProgrammingLanguage extends ProceduralProgrammingLanguages{

    @Override
    public void describeTypeOfProgrammingLanguage() {
        System.out.println();
        super.describeTypeOfProgrammingLanguage();
        System.out.println(HiLevel);
    }
}
