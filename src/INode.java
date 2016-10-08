import javax.xml.soap.Node;
import java.util.List;

/**
 * Created by Noah on 12/10/2015.
 */
public interface INode {

    public void addChild(MyNode n);

    public String getName();

    public List<MyNode> getChildren();

}
