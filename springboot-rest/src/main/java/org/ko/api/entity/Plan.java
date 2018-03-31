package org.ko.api.entity;

import java.io.Serializable;
import java.util.Date;

public class Plan implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_plan.id
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_plan.plan_code
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    private String planCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_plan.plan_name
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    private String planName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_plan.submit_dt
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    private Date submitDt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_plan.submit_user
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    private String submitUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_plan.plan_status
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    private String planStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_plan.delete_i
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    private String deleteI;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_plan.version_n
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    private Long versionN;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_plan.create_user_id
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    private String createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_plan.create_dt
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    private Date createDt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_plan.modify_user_id
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    private String modifyUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_plan.modify_dt
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    private Date modifyDt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_plan.id
     *
     * @return the value of art_plan.id
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_plan.id
     *
     * @param id the value for art_plan.id
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_plan.plan_code
     *
     * @return the value of art_plan.plan_code
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public String getPlanCode() {
        return planCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_plan.plan_code
     *
     * @param planCode the value for art_plan.plan_code
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void setPlanCode(String planCode) {
        this.planCode = planCode == null ? null : planCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_plan.plan_name
     *
     * @return the value of art_plan.plan_name
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_plan.plan_name
     *
     * @param planName the value for art_plan.plan_name
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void setPlanName(String planName) {
        this.planName = planName == null ? null : planName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_plan.submit_dt
     *
     * @return the value of art_plan.submit_dt
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public Date getSubmitDt() {
        return submitDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_plan.submit_dt
     *
     * @param submitDt the value for art_plan.submit_dt
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void setSubmitDt(Date submitDt) {
        this.submitDt = submitDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_plan.submit_user
     *
     * @return the value of art_plan.submit_user
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public String getSubmitUser() {
        return submitUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_plan.submit_user
     *
     * @param submitUser the value for art_plan.submit_user
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void setSubmitUser(String submitUser) {
        this.submitUser = submitUser == null ? null : submitUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_plan.plan_status
     *
     * @return the value of art_plan.plan_status
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public String getPlanStatus() {
        return planStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_plan.plan_status
     *
     * @param planStatus the value for art_plan.plan_status
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void setPlanStatus(String planStatus) {
        this.planStatus = planStatus == null ? null : planStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_plan.delete_i
     *
     * @return the value of art_plan.delete_i
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public String getDeleteI() {
        return deleteI;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_plan.delete_i
     *
     * @param deleteI the value for art_plan.delete_i
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void setDeleteI(String deleteI) {
        this.deleteI = deleteI == null ? null : deleteI.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_plan.version_n
     *
     * @return the value of art_plan.version_n
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public Long getVersionN() {
        return versionN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_plan.version_n
     *
     * @param versionN the value for art_plan.version_n
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void setVersionN(Long versionN) {
        this.versionN = versionN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_plan.create_user_id
     *
     * @return the value of art_plan.create_user_id
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_plan.create_user_id
     *
     * @param createUserId the value for art_plan.create_user_id
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_plan.create_dt
     *
     * @return the value of art_plan.create_dt
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_plan.create_dt
     *
     * @param createDt the value for art_plan.create_dt
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_plan.modify_user_id
     *
     * @return the value of art_plan.modify_user_id
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public String getModifyUserId() {
        return modifyUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_plan.modify_user_id
     *
     * @param modifyUserId the value for art_plan.modify_user_id
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId == null ? null : modifyUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_plan.modify_dt
     *
     * @return the value of art_plan.modify_dt
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public Date getModifyDt() {
        return modifyDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_plan.modify_dt
     *
     * @param modifyDt the value for art_plan.modify_dt
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void setModifyDt(Date modifyDt) {
        this.modifyDt = modifyDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", planCode=").append(planCode);
        sb.append(", planName=").append(planName);
        sb.append(", submitDt=").append(submitDt);
        sb.append(", submitUser=").append(submitUser);
        sb.append(", planStatus=").append(planStatus);
        sb.append(", deleteI=").append(deleteI);
        sb.append(", versionN=").append(versionN);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createDt=").append(createDt);
        sb.append(", modifyUserId=").append(modifyUserId);
        sb.append(", modifyDt=").append(modifyDt);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Plan other = (Plan) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPlanCode() == null ? other.getPlanCode() == null : this.getPlanCode().equals(other.getPlanCode()))
            && (this.getPlanName() == null ? other.getPlanName() == null : this.getPlanName().equals(other.getPlanName()))
            && (this.getSubmitDt() == null ? other.getSubmitDt() == null : this.getSubmitDt().equals(other.getSubmitDt()))
            && (this.getSubmitUser() == null ? other.getSubmitUser() == null : this.getSubmitUser().equals(other.getSubmitUser()))
            && (this.getPlanStatus() == null ? other.getPlanStatus() == null : this.getPlanStatus().equals(other.getPlanStatus()))
            && (this.getDeleteI() == null ? other.getDeleteI() == null : this.getDeleteI().equals(other.getDeleteI()))
            && (this.getVersionN() == null ? other.getVersionN() == null : this.getVersionN().equals(other.getVersionN()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateDt() == null ? other.getCreateDt() == null : this.getCreateDt().equals(other.getCreateDt()))
            && (this.getModifyUserId() == null ? other.getModifyUserId() == null : this.getModifyUserId().equals(other.getModifyUserId()))
            && (this.getModifyDt() == null ? other.getModifyDt() == null : this.getModifyDt().equals(other.getModifyDt()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlanCode() == null) ? 0 : getPlanCode().hashCode());
        result = prime * result + ((getPlanName() == null) ? 0 : getPlanName().hashCode());
        result = prime * result + ((getSubmitDt() == null) ? 0 : getSubmitDt().hashCode());
        result = prime * result + ((getSubmitUser() == null) ? 0 : getSubmitUser().hashCode());
        result = prime * result + ((getPlanStatus() == null) ? 0 : getPlanStatus().hashCode());
        result = prime * result + ((getDeleteI() == null) ? 0 : getDeleteI().hashCode());
        result = prime * result + ((getVersionN() == null) ? 0 : getVersionN().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateDt() == null) ? 0 : getCreateDt().hashCode());
        result = prime * result + ((getModifyUserId() == null) ? 0 : getModifyUserId().hashCode());
        result = prime * result + ((getModifyDt() == null) ? 0 : getModifyDt().hashCode());
        return result;
    }
}