package org.example.rawstring;

public class TestBoxes {

    // 17 에선 가능

    public static final String SELECT = """
        SELECT *
        FROM 어딘가
        WHERE id = %d
        """;

    public static final String DYNAMIC_QUERY = """
        AND col1 = '%s'
        AND col2 = '%s'
        AND col3 = '%s'
        AND col4 = '%s'
        """;
}
