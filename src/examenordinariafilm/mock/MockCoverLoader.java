
package examenordinariafilm.mock;

import examenordinariafilm.model.Cover;
import examenordinariafilm.view.CoverLoader;
import java.util.ArrayList;
import java.util.List;


public class MockCoverLoader implements CoverLoader {

    @Override
    public List<Cover> load() {
        List<Cover> list = new ArrayList<>();
        list.add(new Cover("hola"));
        list.add(new Cover("mundo"));
        list.add(new Cover("2020"));
        return list;
    }
    
}

