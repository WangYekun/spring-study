package com.allinpay.com.demo.service;

import com.allinpay.com.demo.bean.QueryRsp;

import java.util.Map;

public interface AppService {
	/**
	 * 订单查询
	 * @param params
	 * @return
	 */
	public QueryRsp queryOrder(Map params);
}
