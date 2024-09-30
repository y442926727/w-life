package cn.wlife.base.response.node;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 节点列表转节点树工具类型
 * @author qunhua.yi
 * @since 0.1
 */
public class List2TreeUtil {

    /**
     * 节点列表转节点
     * @param allList
     * @return
     * @param <T>
     */
    public static <T> List<TreeNodeRes<T>> buildTree(List<ListNodeRes<T>> allList) {
        if (CollUtil.isNotEmpty(allList)) {
            List<ListNodeRes<T>> parentNodes = allList.stream()
                    .filter(t -> ObjectUtil.equals(t.getParentId(), null)
                            || ObjectUtil.equals(t.getParentId().toString(), "")
                            || ObjectUtil.equals(t.getParentId().toString(), 0)).collect(Collectors.toList());
            if (CollUtil.isNotEmpty(parentNodes)) {
                List<TreeNodeRes<T>> trees = new ArrayList<>();
                for (ListNodeRes<T> item : parentNodes) {
                    TreeNodeRes<T> tree = new TreeNodeRes<>();
                    BeanUtil.copyProperties(item, tree);
                    tree.addChildren(bulidChildren(allList, item));
                }
            }

        }
        //  allList.get(0).getId() instanceof String
        return null;
    }

    private static <T> List<TreeNodeRes<T>> bulidChildren(List<ListNodeRes<T>> allList, ListNodeRes<T> thisNode) {
        List<ListNodeRes<T>> childNodes = allList.stream()
                .filter(t ->
                        ObjectUtil.equals(t.getParentId(), thisNode.getId())
                                && ObjectUtil.equals(t.getParentType(), thisNode.getType())
                ).collect(Collectors.toList());
        if (CollUtil.isNotEmpty(childNodes)) {
            List<TreeNodeRes<T>> trees = new ArrayList<>();
            for (ListNodeRes<T> item : childNodes) {
                TreeNodeRes<T> tree = new TreeNodeRes<>();
                BeanUtil.copyProperties(item, tree);
                tree.addChildren(bulidChildren(allList, item));
                trees.add(tree);
            }
            return trees;
        }
        return null;
    }


    public static <T> List<ListNodeRes<T>> demolishTree(List<TreeNodeRes<T>> trees) {
        List<ListNodeRes<T>> listNodes = new ArrayList<>();
        return null;

    }

    public static <T> List<TreeNodeRes<T>> mergeTree(List<TreeNodeRes<T>>... trees) {

        return null;
    }
}
