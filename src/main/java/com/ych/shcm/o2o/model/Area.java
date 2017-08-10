package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IPreorderTreenode;

/**
 * 地区,以预排序遍历树结构保存
 * <p>
 * Created by U on 2017/7/4.
 */
public class Area implements IPreorderTreenode, Serializable {

    private static final long serialVersionUID = 9152709135760241405L;

    /**
     * 顶级
     */
    private static final String TOP_PARENT_ID = "0";

    /**
     * ID
     */
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 父节点ID
     */
    private String parentId;

    /**
     * 左权重
     */
    private int left;

    /**
     * 右权重
     */
    private int right;

    /**
     * 孩子节点
     */
    private List<Area> children;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *         ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return 名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *         名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 父节点ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     *         父节点ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * @return 左权重
     */
    public int getLeft() {
        return left;
    }

    /**
     * @param left
     *         左权重
     */
    public void setLeft(int left) {
        this.left = left;
    }

    /**
     * @return 右权重
     */
    public int getRight() {
        return right;
    }

    /**
     * @param right
     *         右权重
     */
    public void setRight(int right) {
        this.right = right;
    }

    /**
     * @return 孩子节点
     */
    public List<Area> getChildren() {
        return children;
    }

    /**
     * @param children
     *         孩子节点
     */
    public void setChildren(List<Area> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
