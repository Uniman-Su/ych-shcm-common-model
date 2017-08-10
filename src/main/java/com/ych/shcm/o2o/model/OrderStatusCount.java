package com.ych.shcm.o2o.model;

/**
 * 订单状态数量
 */
public class OrderStatusCount {

    /**
     * 状态
     */
    private OrderStatus status;

    /**
     * 数量
     */
    private int count;

    /**
     * @return 状态
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * @param status
     *         状态
     */
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    /**
     * @return 状态
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count
     *         状态
     */
    public void setCount(int count) {
        this.count = count;
    }
}
