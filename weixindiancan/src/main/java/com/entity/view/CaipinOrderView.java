package com.entity.view;

import com.entity.CaipinOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("caipin_order")
public class CaipinOrderView extends CaipinOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单类型的值
		*/
		private String caipinOrderValue;
		/**
		* 支付类型的值
		*/
		private String caipinOrderPaymentValue;



		//级联表 address
			/**
			* 收货地址 的 创建用户
			*/
			private Integer addressYonghuId;
			/**
			* 收货人
			*/
			private String addressName;
			/**
			* 电话
			*/
			private String addressPhone;
			/**
			* 地址
			*/
			private String addressDizhi;
			/**
			* 是否默认地址
			*/
			private Integer isdefaultTypes;
				/**
				* 是否默认地址的值
				*/
				private String isdefaultValue;

		//级联表 caipin
			/**
			* 商品名称
			*/
			private String caipinName;
			/**
			* 商品照片
			*/
			private String caipinPhoto;
			/**
			* 视频演示
			*/
			private String caipinVideo;
			/**
			* 商品类型
			*/
			private Integer caipinTypes;
				/**
				* 商品类型的值
				*/
				private String caipinValue;
			/**
			* 商品库存
			*/
			private Integer caipinKucunNumber;
			/**
			* 商品原价
			*/
			private Double caipinOldMoney;
			/**
			* 现价
			*/
			private Double caipinNewMoney;
			/**
			* 点击次数
			*/
			private Integer caipinClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer caipinDelete;
			/**
			* 商品简介
			*/
			private String caipinContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public CaipinOrderView() {

	}

	public CaipinOrderView(CaipinOrderEntity caipinOrderEntity) {
		try {
			BeanUtils.copyProperties(this, caipinOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getCaipinOrderValue() {
				return caipinOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setCaipinOrderValue(String caipinOrderValue) {
				this.caipinOrderValue = caipinOrderValue;
			}
			/**
			* 获取： 支付类型的值
			*/
			public String getCaipinOrderPaymentValue() {
				return caipinOrderPaymentValue;
			}
			/**
			* 设置： 支付类型的值
			*/
			public void setCaipinOrderPaymentValue(String caipinOrderPaymentValue) {
				this.caipinOrderPaymentValue = caipinOrderPaymentValue;
			}




				//级联表的get和set address

					/**
					* 获取：收货地址 的 创建用户
					*/
					public Integer getAddressYonghuId() {
						return addressYonghuId;
					}
					/**
					* 设置：收货地址 的 创建用户
					*/
					public void setAddressYonghuId(Integer addressYonghuId) {
						this.addressYonghuId = addressYonghuId;
					}


					/**
					* 获取： 收货人
					*/
					public String getAddressName() {
						return addressName;
					}
					/**
					* 设置： 收货人
					*/
					public void setAddressName(String addressName) {
						this.addressName = addressName;
					}

					/**
					* 获取： 电话
					*/
					public String getAddressPhone() {
						return addressPhone;
					}
					/**
					* 设置： 电话
					*/
					public void setAddressPhone(String addressPhone) {
						this.addressPhone = addressPhone;
					}

					/**
					* 获取： 地址
					*/
					public String getAddressDizhi() {
						return addressDizhi;
					}
					/**
					* 设置： 地址
					*/
					public void setAddressDizhi(String addressDizhi) {
						this.addressDizhi = addressDizhi;
					}

					/**
					* 获取： 是否默认地址
					*/
					public Integer getIsdefaultTypes() {
						return isdefaultTypes;
					}
					/**
					* 设置： 是否默认地址
					*/
					public void setIsdefaultTypes(Integer isdefaultTypes) {
						this.isdefaultTypes = isdefaultTypes;
					}


						/**
						* 获取： 是否默认地址的值
						*/
						public String getIsdefaultValue() {
							return isdefaultValue;
						}
						/**
						* 设置： 是否默认地址的值
						*/
						public void setIsdefaultValue(String isdefaultValue) {
							this.isdefaultValue = isdefaultValue;
						}





				//级联表的get和set caipin

					/**
					* 获取： 商品名称
					*/
					public String getCaipinName() {
						return caipinName;
					}
					/**
					* 设置： 商品名称
					*/
					public void setCaipinName(String caipinName) {
						this.caipinName = caipinName;
					}

					/**
					* 获取： 商品照片
					*/
					public String getCaipinPhoto() {
						return caipinPhoto;
					}
					/**
					* 设置： 商品照片
					*/
					public void setCaipinPhoto(String caipinPhoto) {
						this.caipinPhoto = caipinPhoto;
					}

					/**
					* 获取： 视频演示
					*/
					public String getCaipinVideo() {
						return caipinVideo;
					}
					/**
					* 设置： 视频演示
					*/
					public void setCaipinVideo(String caipinVideo) {
						this.caipinVideo = caipinVideo;
					}

					/**
					* 获取： 商品类型
					*/
					public Integer getCaipinTypes() {
						return caipinTypes;
					}
					/**
					* 设置： 商品类型
					*/
					public void setCaipinTypes(Integer caipinTypes) {
						this.caipinTypes = caipinTypes;
					}


						/**
						* 获取： 商品类型的值
						*/
						public String getCaipinValue() {
							return caipinValue;
						}
						/**
						* 设置： 商品类型的值
						*/
						public void setCaipinValue(String caipinValue) {
							this.caipinValue = caipinValue;
						}

					/**
					* 获取： 商品库存
					*/
					public Integer getCaipinKucunNumber() {
						return caipinKucunNumber;
					}
					/**
					* 设置： 商品库存
					*/
					public void setCaipinKucunNumber(Integer caipinKucunNumber) {
						this.caipinKucunNumber = caipinKucunNumber;
					}

					/**
					* 获取： 商品原价
					*/
					public Double getCaipinOldMoney() {
						return caipinOldMoney;
					}
					/**
					* 设置： 商品原价
					*/
					public void setCaipinOldMoney(Double caipinOldMoney) {
						this.caipinOldMoney = caipinOldMoney;
					}

					/**
					* 获取： 现价
					*/
					public Double getCaipinNewMoney() {
						return caipinNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setCaipinNewMoney(Double caipinNewMoney) {
						this.caipinNewMoney = caipinNewMoney;
					}

					/**
					* 获取： 点击次数
					*/
					public Integer getCaipinClicknum() {
						return caipinClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setCaipinClicknum(Integer caipinClicknum) {
						this.caipinClicknum = caipinClicknum;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getCaipinDelete() {
						return caipinDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setCaipinDelete(Integer caipinDelete) {
						this.caipinDelete = caipinDelete;
					}

					/**
					* 获取： 商品简介
					*/
					public String getCaipinContent() {
						return caipinContent;
					}
					/**
					* 设置： 商品简介
					*/
					public void setCaipinContent(String caipinContent) {
						this.caipinContent = caipinContent;
					}

































				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}




}
