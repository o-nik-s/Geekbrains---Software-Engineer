package geekbrains_course.Lesson_02.Ex006.Interface;

import geekbrains_course.Lesson_02.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
