package UnitTest.DatastructureTest.treeTest.binaryTreeTest.binaryTreeApplyTest;

import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;
import DataStructure.tree.binaryTree.ertyuygf.NearestCommonParent;
import UnitTest.DatastructureTest.treeTest.BinaryTreeTestDemo;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/5
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 查找最近公共父节点 测试案例
 */
public class NearestCommonParentTest extends BinaryTreeTestDemo {
    NearestCommonParent ncp = new NearestCommonParent();



    @Test
    public void testfindNCP() {
        BinaryTreeImpl target = ncp.findNCP(gettreeDemo03(), 5, 7);
        int value = target.value;
        assert value == 1;
        target = ncp.findNCP(gettreeDemo03(), 5, 3);
        value = target.value;
        assert value == 1;
        target = ncp.findNCP(gettreeDemo03(), 6, 7);
        value = target.value;
        assert value == 3;
        target = ncp.findNCP(gettreeDemo04(), 2, 7);
        value = target.value;
        assert value == 1;
        target = ncp.findNCP(gettreeDemo05(), 15, 5);
        value = target.value;
        assert value == 3;
        target = ncp.findNCP(gettreeDemo05(), 10, 19);
        value = target.value;
        assert value == 10;
        target = ncp.findNCP(gettreeDemo05(), 17, 18);
        value = target.value;
        assert value == 17;
    }

    //@Test
    public void testfind() {
        BinaryTreeImpl target = ncp.findxandy(gettreeDemo03(), 5, 7);
        int value = target.value;
        assert value == 1;
        target = ncp.findxandy(gettreeDemo03(), 5, 3);
        value = target.value;
        assert value == 1;
        target = ncp.findxandy(gettreeDemo03(), 6, 7);
        value = target.value;
        assert value == 3;
        target = ncp.findxandy(gettreeDemo04(), 2, 7);
        value = target.value;
        assert value == 1;
        target = ncp.findxandy(gettreeDemo05(), 15, 5);
        value = target.value;
        assert value == 3;
        target = ncp.findxandy(gettreeDemo05(), 10, 19);
        value = target.value;
        assert value == 10;
        target = ncp.findxandy(gettreeDemo05(), 17, 18);
        value = target.value;
        assert value == 17;
    }
}
