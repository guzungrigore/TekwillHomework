package Homework2.Diagram1;

import java.util.Date;

public class Document {
    protected String[] authors;
    protected Date date;

    public String[] getAuthors() {
        return authors;
    }

    public void addAuthors(String name) {
        if (!name.isBlank()) {
            if (authors == null) {
                authors = new String[1];
                authors[0] = name;
            } else {
                String[] newAuthors = new String[authors.length + 1];

                for (int i = 0; i < authors.length; i++) {
                    newAuthors[i] = authors[i];
                }

                newAuthors[authors.length] = name;
                authors = newAuthors;
            }
        }
    }

    public Date getDate() {
        return date;
    }
}
