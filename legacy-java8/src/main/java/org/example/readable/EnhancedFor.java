package org.example.readable;

import java.util.List;
import org.example.common.SomeDTO;

public class EnhancedFor {

    public void loop(List<SomeDTO> requests) {
        for (int i = 0; i < requests.size(); i++) {
            SomeDTO someDTO = requests.get(i);

        }
    }
}
