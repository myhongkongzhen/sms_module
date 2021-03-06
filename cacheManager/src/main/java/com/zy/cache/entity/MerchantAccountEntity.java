package com.zy.cache.entity;

import java.util.Date;

public class MerchantAccountEntity
{
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.MERCHANT_ACCOUNT
	 *
	 * @mbggenerated
	 */
	private String merchantAccount;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.APPKEY
	 *
	 * @mbggenerated
	 */
	private String appkey;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.MERCHANT_NAME
	 *
	 * @mbggenerated
	 */
	private String merchantName;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.MERCHANT_LINKMAN
	 *
	 * @mbggenerated
	 */
	private String merchantLinkman;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.MERCHANT_PHONE
	 *
	 * @mbggenerated
	 */
	private String merchantPhone;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.MERCHANT_EMAIL
	 *
	 * @mbggenerated
	 */
	private String merchantEmail;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.IS_LOCKED
	 *
	 * @mbggenerated
	 */
	private Short isLocked;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.AUDIT_STATUS
	 *
	 * @mbggenerated
	 */
	private Short auditStatus;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.MERCHANT_PWD
	 *
	 * @mbggenerated
	 */
	private String merchantPwd;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.CURRENT_FEE
	 *
	 * @mbggenerated
	 */
	private Integer currentFee;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.COMMENT
	 *
	 * @mbggenerated
	 */
	private String comment;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.UPDATE_TIME
	 *
	 * @mbggenerated
	 */
	private Date updateTime;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.CREATE_TIME
	 *
	 * @mbggenerated
	 */
	private Date createTime;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.FEE_EXPIRE_TIME
	 *
	 * @mbggenerated
	 */
	private Date feeExpireTime;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column merchant_account.CHANNEL_ID
	 *
	 * @mbggenerated
	 */
	private String channelId;

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table merchant_account
	 *
	 * @mbggenerated
	 */
	public MerchantAccountEntity( String merchantAccount,
								  String appkey,
								  String merchantName,
								  String merchantLinkman,
								  String merchantPhone,
								  String merchantEmail,
								  Short isLocked,
								  Short auditStatus,
								  String merchantPwd,
								  Integer currentFee,
								  String comment,
								  Date updateTime,
								  Date createTime,
								  Date feeExpireTime,
								  String channelId )
	{
		this.merchantAccount = merchantAccount;
		this.appkey = appkey;
		this.merchantName = merchantName;
		this.merchantLinkman = merchantLinkman;
		this.merchantPhone = merchantPhone;
		this.merchantEmail = merchantEmail;
		this.isLocked = isLocked;
		this.auditStatus = auditStatus;
		this.merchantPwd = merchantPwd;
		this.currentFee = currentFee;
		this.comment = comment;
		this.updateTime = updateTime;
		this.createTime = createTime;
		this.feeExpireTime = feeExpireTime;
		this.channelId = channelId;
	}

	@Override public String toString()
	{
		return "MerchantAccountEntity{" +
			   "appkey='" + appkey + '\'' +
			   ", merchantAccount='" + merchantAccount + '\'' +
			   ", merchantName='" + merchantName + '\'' +
			   ", merchantLinkman='" + merchantLinkman + '\'' +
			   ", merchantPhone='" + merchantPhone + '\'' +
			   ", merchantEmail='" + merchantEmail + '\'' +
			   ", isLocked=" + isLocked +
			   ", auditStatus=" + auditStatus +
			   ", merchantPwd='" + merchantPwd + '\'' +
			   ", currentFee=" + currentFee +
			   ", comment='" + comment + '\'' +
			   ", updateTime=" + updateTime +
			   ", createTime=" + createTime +
			   ", feeExpireTime=" + feeExpireTime +
			   ", channelId='" + channelId + '\'' +
			   '}';
	}

	@Override public boolean equals( Object o )
	{
		if ( this == o ) return true;
		if ( o == null || getClass() != o.getClass() ) return false;

		MerchantAccountEntity that = ( MerchantAccountEntity ) o;

		if ( merchantAccount != null ? !merchantAccount.equals( that.merchantAccount ) : that.merchantAccount != null ) return false;
		if ( appkey != null ? !appkey.equals( that.appkey ) : that.appkey != null ) return false;
		if ( merchantName != null ? !merchantName.equals( that.merchantName ) : that.merchantName != null ) return false;
		if ( merchantLinkman != null ? !merchantLinkman.equals( that.merchantLinkman ) : that.merchantLinkman != null ) return false;
		if ( merchantPhone != null ? !merchantPhone.equals( that.merchantPhone ) : that.merchantPhone != null ) return false;
		if ( merchantEmail != null ? !merchantEmail.equals( that.merchantEmail ) : that.merchantEmail != null ) return false;
		if ( isLocked != null ? !isLocked.equals( that.isLocked ) : that.isLocked != null ) return false;
		if ( auditStatus != null ? !auditStatus.equals( that.auditStatus ) : that.auditStatus != null ) return false;
		if ( merchantPwd != null ? !merchantPwd.equals( that.merchantPwd ) : that.merchantPwd != null ) return false;
		if ( currentFee != null ? !currentFee.equals( that.currentFee ) : that.currentFee != null ) return false;
		if ( comment != null ? !comment.equals( that.comment ) : that.comment != null ) return false;
		if ( updateTime != null ? !updateTime.equals( that.updateTime ) : that.updateTime != null ) return false;
		if ( createTime != null ? !createTime.equals( that.createTime ) : that.createTime != null ) return false;
		if ( feeExpireTime != null ? !feeExpireTime.equals( that.feeExpireTime ) : that.feeExpireTime != null ) return false;
		return !( channelId != null ? !channelId.equals( that.channelId ) : that.channelId != null );

	}

	@Override public int hashCode()
	{
		int result = merchantAccount != null ? merchantAccount.hashCode() : 0;
		result = 31 * result + ( appkey != null ? appkey.hashCode() : 0 );
		result = 31 * result + ( merchantName != null ? merchantName.hashCode() : 0 );
		result = 31 * result + ( merchantLinkman != null ? merchantLinkman.hashCode() : 0 );
		result = 31 * result + ( merchantPhone != null ? merchantPhone.hashCode() : 0 );
		result = 31 * result + ( merchantEmail != null ? merchantEmail.hashCode() : 0 );
		result = 31 * result + ( isLocked != null ? isLocked.hashCode() : 0 );
		result = 31 * result + ( auditStatus != null ? auditStatus.hashCode() : 0 );
		result = 31 * result + ( merchantPwd != null ? merchantPwd.hashCode() : 0 );
		result = 31 * result + ( currentFee != null ? currentFee.hashCode() : 0 );
		result = 31 * result + ( comment != null ? comment.hashCode() : 0 );
		result = 31 * result + ( updateTime != null ? updateTime.hashCode() : 0 );
		result = 31 * result + ( createTime != null ? createTime.hashCode() : 0 );
		result = 31 * result + ( feeExpireTime != null ? feeExpireTime.hashCode() : 0 );
		result = 31 * result + ( channelId != null ? channelId.hashCode() : 0 );
		return result;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table merchant_account
	 *
	 * @mbggenerated
	 */
	public MerchantAccountEntity()
	{
		super();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.MERCHANT_ACCOUNT
	 *
	 * @return the value of merchant_account.MERCHANT_ACCOUNT
	 * @mbggenerated
	 */
	public String getMerchantAccount()
	{
		return merchantAccount;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.MERCHANT_ACCOUNT
	 *
	 * @param merchantAccount the value for merchant_account.MERCHANT_ACCOUNT
	 * @mbggenerated
	 */
	public void setMerchantAccount( String merchantAccount )
	{
		this.merchantAccount = merchantAccount == null ? null : merchantAccount.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.APPKEY
	 *
	 * @return the value of merchant_account.APPKEY
	 * @mbggenerated
	 */
	public String getAppkey()
	{
		return appkey;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.APPKEY
	 *
	 * @param appkey the value for merchant_account.APPKEY
	 * @mbggenerated
	 */
	public void setAppkey( String appkey )
	{
		this.appkey = appkey == null ? null : appkey.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.MERCHANT_NAME
	 *
	 * @return the value of merchant_account.MERCHANT_NAME
	 * @mbggenerated
	 */
	public String getMerchantName()
	{
		return merchantName;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.MERCHANT_NAME
	 *
	 * @param merchantName the value for merchant_account.MERCHANT_NAME
	 * @mbggenerated
	 */
	public void setMerchantName( String merchantName )
	{
		this.merchantName = merchantName == null ? null : merchantName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.MERCHANT_LINKMAN
	 *
	 * @return the value of merchant_account.MERCHANT_LINKMAN
	 * @mbggenerated
	 */
	public String getMerchantLinkman()
	{
		return merchantLinkman;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.MERCHANT_LINKMAN
	 *
	 * @param merchantLinkman the value for merchant_account.MERCHANT_LINKMAN
	 * @mbggenerated
	 */
	public void setMerchantLinkman( String merchantLinkman )
	{
		this.merchantLinkman = merchantLinkman == null ? null : merchantLinkman.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.MERCHANT_PHONE
	 *
	 * @return the value of merchant_account.MERCHANT_PHONE
	 * @mbggenerated
	 */
	public String getMerchantPhone()
	{
		return merchantPhone;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.MERCHANT_PHONE
	 *
	 * @param merchantPhone the value for merchant_account.MERCHANT_PHONE
	 * @mbggenerated
	 */
	public void setMerchantPhone( String merchantPhone )
	{
		this.merchantPhone = merchantPhone == null ? null : merchantPhone.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.MERCHANT_EMAIL
	 *
	 * @return the value of merchant_account.MERCHANT_EMAIL
	 * @mbggenerated
	 */
	public String getMerchantEmail()
	{
		return merchantEmail;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.MERCHANT_EMAIL
	 *
	 * @param merchantEmail the value for merchant_account.MERCHANT_EMAIL
	 * @mbggenerated
	 */
	public void setMerchantEmail( String merchantEmail )
	{
		this.merchantEmail = merchantEmail == null ? null : merchantEmail.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.IS_LOCKED
	 *
	 * @return the value of merchant_account.IS_LOCKED
	 * @mbggenerated
	 */
	public Short getIsLocked()
	{
		return isLocked;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.IS_LOCKED
	 *
	 * @param isLocked the value for merchant_account.IS_LOCKED
	 * @mbggenerated
	 */
	public void setIsLocked( Short isLocked )
	{
		this.isLocked = isLocked;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.AUDIT_STATUS
	 *
	 * @return the value of merchant_account.AUDIT_STATUS
	 * @mbggenerated
	 */
	public Short getAuditStatus()
	{
		return auditStatus;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.AUDIT_STATUS
	 *
	 * @param auditStatus the value for merchant_account.AUDIT_STATUS
	 * @mbggenerated
	 */
	public void setAuditStatus( Short auditStatus )
	{
		this.auditStatus = auditStatus;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.MERCHANT_PWD
	 *
	 * @return the value of merchant_account.MERCHANT_PWD
	 * @mbggenerated
	 */
	public String getMerchantPwd()
	{
		return merchantPwd;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.MERCHANT_PWD
	 *
	 * @param merchantPwd the value for merchant_account.MERCHANT_PWD
	 * @mbggenerated
	 */
	public void setMerchantPwd( String merchantPwd )
	{
		this.merchantPwd = merchantPwd == null ? null : merchantPwd.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.CURRENT_FEE
	 *
	 * @return the value of merchant_account.CURRENT_FEE
	 * @mbggenerated
	 */
	public Integer getCurrentFee()
	{
		return currentFee;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.CURRENT_FEE
	 *
	 * @param currentFee the value for merchant_account.CURRENT_FEE
	 * @mbggenerated
	 */
	public void setCurrentFee( Integer currentFee )
	{
		this.currentFee = currentFee;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.COMMENT
	 *
	 * @return the value of merchant_account.COMMENT
	 * @mbggenerated
	 */
	public String getComment()
	{
		return comment;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.COMMENT
	 *
	 * @param comment the value for merchant_account.COMMENT
	 * @mbggenerated
	 */
	public void setComment( String comment )
	{
		this.comment = comment == null ? null : comment.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.UPDATE_TIME
	 *
	 * @return the value of merchant_account.UPDATE_TIME
	 * @mbggenerated
	 */
	public Date getUpdateTime()
	{
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.UPDATE_TIME
	 *
	 * @param updateTime the value for merchant_account.UPDATE_TIME
	 * @mbggenerated
	 */
	public void setUpdateTime( Date updateTime )
	{
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.CREATE_TIME
	 *
	 * @return the value of merchant_account.CREATE_TIME
	 * @mbggenerated
	 */
	public Date getCreateTime()
	{
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.CREATE_TIME
	 *
	 * @param createTime the value for merchant_account.CREATE_TIME
	 * @mbggenerated
	 */
	public void setCreateTime( Date createTime )
	{
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.FEE_EXPIRE_TIME
	 *
	 * @return the value of merchant_account.FEE_EXPIRE_TIME
	 * @mbggenerated
	 */
	public Date getFeeExpireTime()
	{
		return feeExpireTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.FEE_EXPIRE_TIME
	 *
	 * @param feeExpireTime the value for merchant_account.FEE_EXPIRE_TIME
	 * @mbggenerated
	 */
	public void setFeeExpireTime( Date feeExpireTime )
	{
		this.feeExpireTime = feeExpireTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column merchant_account.CHANNEL_ID
	 *
	 * @return the value of merchant_account.CHANNEL_ID
	 * @mbggenerated
	 */
	public String getChannelId()
	{
		return channelId;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column merchant_account.CHANNEL_ID
	 *
	 * @param channelId the value for merchant_account.CHANNEL_ID
	 * @mbggenerated
	 */
	public void setChannelId( String channelId )
	{
		this.channelId = channelId == null ? null : channelId.trim();
	}
}
