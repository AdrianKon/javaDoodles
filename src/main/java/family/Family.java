package family;

import java.util.ArrayList;
import java.util.List;

public class Family extends Component {
    private int id;
    private Father father;
    private List<Component> children = new ArrayList<>();


    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
