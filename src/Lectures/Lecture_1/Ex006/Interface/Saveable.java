package Lectures.Lecture_1.Ex006.Interface;

import Lectures.Lecture_1.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
