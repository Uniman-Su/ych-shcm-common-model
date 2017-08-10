package com.ych.shcm.o2o.parameter;

import com.ych.core.model.BasePaginableParameter;
import com.ych.shcm.o2o.model.ServiceProviderSettleStatus;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 查询服务商结算参数
 * <p>
 * Created by U on 2017/7/13.
 */
public class QueryServiceProviderSettleParameter extends BasePaginableParameter {

    /**
     * 服务商ID
     */
    private BigDecimal shopId;

    /**
     * 结算日
     */
    private Date settleDate;

    /**
     * 结算日起
     */
    private Date settleDateBegin;

    /**
     * 结算日止
     */
    private Date settleDateEnd;

    /**
     * 服务商ID
     */
    private Date serviceProviderId;

    /**
     * 状态
     */
    private List<ServiceProviderSettleStatus> statuses;

    /**
     * @return 服务商ID
     */
    public BigDecimal getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     *         服务商ID
     */
    public void setShopId(BigDecimal shopId) {
        this.shopId = shopId;
    }

    /**
     * @return 结算日
     */
    public Date getSettleDate() {
        return settleDate;
    }

    /**
     * @param settleDate
     *         结算日
     */
    public void setSettleDate(Date settleDate) {
        this.settleDate = settleDate;
    }

    /**
     * @return 结算日起
     */
    public Date getSettleDateBegin() {
        return settleDateBegin;
    }

    /**
     * @param settleDateBegin
     *         结算日起
     */
    public void setSettleDateBegin(Date settleDateBegin) {
        this.settleDateBegin = settleDateBegin;
    }

    /**
     * @return 结算日止
     */
    public Date getSettleDateEnd() {
        return settleDateEnd;
    }

    /**
     * @param settleDateEnd
     *         结算日止
     */
    public void setSettleDateEnd(Date settleDateEnd) {
        this.settleDateEnd = settleDateEnd;
    }

    /**
     * @return 服务商ID
     */
    public Date getServiceProviderId() {
        return serviceProviderId;
    }

    /**
     * @param serviceProviderId
     *         服务商ID
     */
    public void setServiceProviderId(Date serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    /**
     * @return 状态
     */
    public List<ServiceProviderSettleStatus> getStatuses() {
        return statuses;
    }

    /**
     * @param statuses
     *         状态
     */
    public void setStatuses(List<ServiceProviderSettleStatus> statuses) {
        this.statuses = statuses;
    }
}
