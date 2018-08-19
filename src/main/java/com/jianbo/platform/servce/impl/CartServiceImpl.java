package com.jianbo.platform.servce.impl;

import com.jianbo.platform.entity.Cart;
import com.jianbo.platform.dao.CartDao;
import com.jianbo.platform.servce.CartService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 购物车 服务实现类
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartDao, Cart> implements CartService {
	
}
