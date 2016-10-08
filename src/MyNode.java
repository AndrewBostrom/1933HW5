import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Noah on 12/10/2015.
 */
public class MyNode implements INode{
    private String value;
    private List<MyNode> children;

    public MyNode(String value){
        this.value = value;
        this.children = new LinkedList<>();
    }

    @Override
    public void addChild(MyNode n) {
        children.add(n);
    }

    @Override
    public String getName() {
        return value;
    }

    @Override
    public List<MyNode> getChildren() {
        return children;
    }
}
