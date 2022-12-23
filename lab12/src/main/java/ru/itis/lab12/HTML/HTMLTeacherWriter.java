package ru.itis.lab12.HTML;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class HTMLTeacherWriter extends HTMLPersonWriter {

    private Teacher teacher;

    public HTMLTeacherWriter(Teacher teacher, String fileName) {
        super(teacher, fileName);
        this.teacher = teacher;
    }

    public void printAddedInfo(FileWriter writer) throws IOException {
        writer.write("<div>" + teacher.getPosition() + "</div>\n");

        for(String cource: teacher.getCources())
            writer.write("<div>" + cource + "</div>\n");
    }

}



